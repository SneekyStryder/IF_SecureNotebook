import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SecureNotebookWindow extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton saveButton;
    private JTextArea notebookText;
    private JLabel myNotebook;
    private JLabel textFileName;
    private File txtFile;
    private String text = "";

    public SecureNotebookWindow(int fileNum, String fileName, Color labelColor) throws IOException {
        createUIComponents(fileNum, fileName, labelColor);
    }

    private void createUIComponents(int fileNum, String fileName, Color labelColor) throws IOException {
        setContentPane(mainPanel);
        setTitle("Secure Notebook");
        setSize(400, 300);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textFileName.setText(fileName);
        textFileName.setForeground(labelColor);
        saveButton.setFont(new Font("Calibri", Font.PLAIN, 16));
        saveButton.setBackground(new Color(235, 64, 52));
        saveButton.setForeground(Color.white);
        saveButton.setUI(new CustomButtonUI());
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = notebookText.getText();
                try {
                    saveToFile(text, fileNum);
                    System.out.println(text);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        setVisible(true);
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("saveFile" + fileNum + ".txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line);
                contentBuilder.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        notebookText.append(contentBuilder.toString());
    }

    public void saveToFile(String text, int fileNum) throws IOException {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("saveFile" + fileNum + ".txt"));
                writer.write(text);
                writer.close();
                JOptionPane.showMessageDialog(null, "File saved successfully.");
            }
            catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error saving file: " + e.getMessage());
            }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
