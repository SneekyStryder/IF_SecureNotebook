import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecureNotebookMenu extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton quitButton;

    public SecureNotebookMenu() {
        createUIComponents();
    }

    public void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Secure Notebook");
        setSize(400, 300);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //for (int i = 1; i <= 10; i++) {
        JButton menuOption = new JButton("Menu Option " + 1);
        menuOption.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuOption.setBounds(50, 50, 75, 35);
        setSize(250, 200);
        setLayout(null);
        menuOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                JOptionPane.showMessageDialog(null, "Selected: " + button.getText());
            }
        });


        // Create a scroll pane and add the menu panel to it
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Add the scroll pane to the frame

        // Display the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
