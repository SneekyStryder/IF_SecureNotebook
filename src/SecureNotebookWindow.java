import javax.swing.*;
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
    private File txtFile;
    private String text = "";

    public SecureNotebookWindow() throws IOException {
        createUIComponents();
    }

    private void createUIComponents() throws IOException {
        setContentPane(mainPanel);
        setTitle("Secure Notebook");
        setSize(400, 300);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = notebookText.getText();
                try {
                    saveToFile(text);
                    System.out.println(text);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        setVisible(true);
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("saveFile.txt"))) {
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

    public void saveToFile(String text) throws IOException {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("saveFile.txt"));
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
