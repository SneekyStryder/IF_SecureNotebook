import javax.swing.*;
import java.awt.*;
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

    public SecureNotebookMenu() {
        createUIComponents();
    }

    public void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Secure Notebook");
        setSize(400, 400);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textFile1Option.setFont(new Font("Calibri", Font.PLAIN, 16));
        textFile1Option.setBackground(new Color(57, 251, 103));
        textFile1Option.setForeground(Color.black);
        textFile1Option.setUI(new CustomButtonUI());
        textFile1Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(1, textFile1Option.getText(), new Color(57, 251, 103));
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                // SecureNotebookWindow secureNotebook = new SecureNotebookWindow();
            }
        });
        textFile2Option.setFont(new Font("Calibri", Font.PLAIN, 16));
        textFile2Option.setBackground(new Color(5, 28, 179));
        textFile2Option.setForeground(Color.white);
        textFile2Option.setUI(new CustomButtonUI());
        textFile2Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(2, textFile2Option.getText(), new Color(5, 28, 179));
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        textFile3Option.setFont(new Font("Calibri", Font.PLAIN, 16));
        textFile3Option.setBackground(new Color(26, 26, 26));
        textFile3Option.setForeground(Color.yellow);
        textFile3Option.setUI(new CustomButtonUI());
        textFile3Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(3, textFile3Option.getText(), new Color(0, 0, 0));
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        textFile4Option.setFont(new Font("Calibri", Font.PLAIN, 16));
        textFile4Option.setBackground(new Color(154, 9, 250));
        textFile4Option.setForeground(Color.white);
        textFile4Option.setUI(new CustomButtonUI());
        textFile4Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(4, textFile4Option.getText(), new Color(154, 9, 250));
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        textFile5Option.setFont(new Font("Calibri", Font.PLAIN, 16));
        textFile5Option.setBackground(new Color(246, 174, 34));
        textFile5Option.setForeground(Color.white);
        textFile5Option.setUI(new CustomButtonUI());
        textFile5Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(5, textFile5Option.getText(), new Color(246, 174, 34));
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        textFile6Option.setFont(new Font("Calibri", Font.PLAIN, 16));
        textFile6Option.setBackground(new Color(56, 251, 215));
        textFile6Option.setForeground(Color.black);
        textFile6Option.setUI(new CustomButtonUI());
        textFile6Option.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow(6, textFile6Option.getText(), new Color(56, 251, 215));
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        quitButton.setFont(new Font("Calibri", Font.PLAIN, 16));
        quitButton.setBackground(new Color(235, 64, 52));
        quitButton.setForeground(Color.white);
        quitButton.setUI(new CustomButtonUI());
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

    public static void main(String[] args) {
        SecureNotebookMenu secureNotebookMenu = new SecureNotebookMenu();
    }
}
