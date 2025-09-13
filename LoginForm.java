import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    // Components
    private JLabel userLabel, passLabel, messageLabel;
    private JTextField userText;
    private JPasswordField passText;
    private JButton loginButton;

    public LoginForm() {
        // Frame settings
        setTitle("Login Form");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen

        // Panel for form
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        // Username
        userLabel = new JLabel("Username:");
        userText = new JTextField();

        // Password
        passLabel = new JLabel("Password:");
        passText = new JPasswordField();

        // Button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        // Message label
        messageLabel = new JLabel("");
        messageLabel.setHorizontalAlignment(JLabel.CENTER);

        // Adding to panel
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passLabel);
        panel.add(passText);
        panel.add(new JLabel()); // empty cell
        panel.add(loginButton);

        // Add to frame
        add(panel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = new String(passText.getPassword());

        // Hardcoded login check
        if (username.equals("admin") && password.equals("1234")) {
            messageLabel.setText("Login Successful!");
            messageLabel.setForeground(Color.GREEN);
        } else {
            messageLabel.setText("Login Failed! Try again.");
            messageLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
