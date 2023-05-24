import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        saveButton.addActionListener(this);
        setVisible(true);
        Scanner scan = new Scanner("C:\\Users\\BT_3W2_01\\IdeaProjects\\IF_SecureNotebook\\src\\saveFile.txt");
        while (scan.hasNextLine()) {
            text += scan.nextLine();
        }
        Files.deleteIfExists(Paths.get("C:\\Users\\BT_3W2_01\\IdeaProjects\\IF_SecureNotebook\\src\\saveFile.txt"));
        txtFile = new File("C:\\Users\\BT_3W2_01\\IdeaProjects\\IF_SecureNotebook\\src\\saveFile.txt");
        if(txtFile.createNewFile()){
            System.out.println("C:\\Users\\BT_3W2_01\\IdeaProjects\\IF_SecureNotebook\\src\\saveFile.txt File Created");
        }else System.out.println("File C:\\Users\\BT_3W2_01\\IdeaProjects\\IF_SecureNotebook\\src\\saveFile.txt already exists");
        saveToFile(text);
    }

    public void saveToFile(String text) throws IOException {
        try {
            FileWriter writer = new FileWriter("saveFile.txt");
            writer.write(text);
            writer.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
