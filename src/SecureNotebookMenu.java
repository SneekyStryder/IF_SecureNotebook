import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SecureNotebookMenu extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton textFile1Option;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
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
                    SecureNotebookWindow secureNotebookWindow = new SecureNotebookWindow();
                    setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                // SecureNotebookWindow secureNotebook = new SecureNotebookWindow();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
