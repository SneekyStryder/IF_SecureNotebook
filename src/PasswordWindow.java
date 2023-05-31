import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;


public class PasswordWindow extends JFrame {
    private JPasswordField passwordField1;
    private JPanel PasswordPanel;
    private JButton submitButton;
    private JLabel passwordLable;
    private boolean pass = false;

    public PasswordWindow() {
        createUIComponents();
    }

    public void createUIComponents() {
        setContentPane(PasswordPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);

        // Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField1.getPassword());

                if (password.equals("csawesome")) {
                    JOptionPane.showMessageDialog(null, "Password correct. Access granted!");
                    launchProgram();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Password incorrect. Access denied!");
                    setVisible(false);
                }

                // Clear the password field after submit
                passwordField1.setText("");
            }
        });
    }
        //char[] inputPassword = passwordField1.getPassword();

        public void launchProgram() {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    SecureNotebookMenu secureNotebookMenu = new SecureNotebookMenu();
                    // Create an instance of the new program's frame
                    /*
                    try {
                        SecureNotebookMenu secureNotebookMenu = new SecureNotebookMenu();
                        // SecureNotebookWindow secureNotebook = new SecureNotebookWindow();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                     */
                    //SecureNotebookWindow.setVisible(true);
                }
            });
        }
}
