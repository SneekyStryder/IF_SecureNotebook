import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SecureNotebookWindow extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton saveButton;
    private JTextArea notebookText;
    private JLabel myNotebook;
    private JLabel textFileName;
    private JButton exitButton;
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
        saveButton.setBackground(new Color(255, 255, 255));
        saveButton.setForeground(Color.black);
        saveButton.setUI(new CustomButtonUI());
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = notebookText.getText();
                try {
                    saveButton.setBackground(new Color(52, 235, 88));
                    saveButton.setForeground(Color.white);
                    saveToFile(text, fileNum);
                    System.out.println(text);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        exitButton.setFont(new Font("Calibri", Font.PLAIN, 16));
        exitButton.setBackground(new Color(235, 64, 52));
        exitButton.setForeground(Color.white);
        exitButton.setUI(new CustomButtonUI());
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                SecureNotebookMenu secureNotebookMenu = new SecureNotebookMenu();
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

    public static void main(String[] args) throws IOException {
        SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(1, "test", new Color(255, 255, 255));
    }
}
