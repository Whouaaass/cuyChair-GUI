package co.edu.unicauca.cuychair.gui.views;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SignupView extends JPanel {
    private JTextField nameField, lastNameField, emailField, phoneField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton signupButton;
    private JButton loginButton;  // New field

    public SignupView() {        

        setLayout(new BorderLayout());

        setBorder(BorderFactory.createTitledBorder("Registro"));
        setSize(400, 500);        
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Nombre:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Apellido:"));
        lastNameField = new JTextField();
        panel.add(lastNameField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Teléfono:"));
        phoneField = new JTextField();
        panel.add(phoneField);

        panel.add(new JLabel("Contraseña:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        panel.add(new JLabel("Confirmar Contraseña:"));
        confirmPasswordField = new JPasswordField();
        panel.add(confirmPasswordField);

        signupButton = new JButton("Registro");
        signupButton.addActionListener(e -> handleSignup());
        
        loginButton = new JButton("Ir a Login");
        loginButton.addActionListener(e -> handleGoToLogin());
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(signupButton);
        buttonPanel.add(loginButton);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void handleSignup() {
        String name = nameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        if (name.isEmpty() || lastName.isEmpty() || email.isEmpty() || 
            phone.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden!", 
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // TODO: Add your signup logic here
        JOptionPane.showMessageDialog(this, "Registro exitoso!");
    }

    private void handleGoToLogin() {
        JFrame window = (JFrame) SwingUtilities.getWindowAncestor(this);
        window.getContentPane().removeAll();
        window.add(new LoginView());
        window.setTitle("Iniciar sesión");
        window.revalidate();
        window.repaint();
        window.pack();
        
    }

}
