package co.edu.unicauca.cuychair.gui.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 * Simple login view with username, password, and login button.
 */
public class LoginView extends JPanel {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginView() {
        setLayout(new BorderLayout());

        // Title Panel
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.addBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        

        JLabel titleLabel = new JLabel("Inicio de Sesión");
        titleLabel.setFont(titleLabel.getFont().deriveFont(18f));        
        titlePanel.add(titleLabel, BorderLayout.CENTER);
        add(titlePanel, BorderLayout.NORTH);
        
        // Main Panel
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Username Label and Field
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(new JLabel("Usuario:"), gbc);

        gbc.gridx = 1;
        usernameField = new JTextField(15);
        mainPanel.add(usernameField, gbc);

        // Password Label and Field
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(new JLabel("Contraseña:"), gbc);

        gbc.gridx = 1;
        passwordField = new JPasswordField(15);
        mainPanel.add(passwordField, gbc);

        // Login Button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        loginButton = new JButton("Iniciar Sesión");
        buttonPanel.add(loginButton);
        mainPanel.add(buttonPanel, gbc);

        add(mainPanel, BorderLayout.CENTER);

        // Action Listener for Login Button
        loginButton.addActionListener((ActionEvent e) -> {
            handleLogin();
        });
    }

    // Placeholder method to handle login logic
    private void handleLogin() {
        String username = usernameField.getText();
        char[] password = passwordField.getPassword();

        if (username.isEmpty() || password.length == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Simulate authentication (replace with real logic)
        if ("admin".equals(username) && "1234".equals(new String(password))) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Inicio de Sesión");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new LoginView());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
