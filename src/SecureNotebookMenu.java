import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SecureNotebookMenu extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton textFile1Option;
    private JButton textFile6Option;
    private JButton textFile5Option;
    private JButton textFile4Option;
    private JButton textFile3Option;
    private JButton textFile2Option;
    private JButton quitButton;
    private JScrollPane scrollPane;

    public SecureNotebookMenu() {
        createUIComponents();
    }

    public void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Secure Notebook");
        setSize(400, 300);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textFile1Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(1);
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                // SecureNotebookWindow secureNotebook = new SecureNotebookWindow();
            }
        });
        textFile2Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(2);
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        textFile3Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(3);
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        textFile4Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(4);
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        textFile5Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(5);
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        textFile6Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(6);
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Closing Notebook");
                setVisible(false);
            }
        });
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
