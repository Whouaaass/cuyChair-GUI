package co.edu.unicauca.cuychair.gui.views.panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CreatePaperPanel extends JPanel {
    private JTextField txtTitle;
    private JTextField txtSubtitle;
    private JTextArea txtAbstract;
    private JComboBox<String> cmbConference;
    
    public CreatePaperPanel() {
        initComponents();
    }
    
    private void initComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Title
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Title:"), gbc);
        
        txtTitle = new JTextField(30);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(txtTitle, gbc);
        
        // Subtitle
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Subtitle:"), gbc);
        
        txtSubtitle = new JTextField(30);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(txtSubtitle, gbc);
        
        // Abstract
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Abstract:"), gbc);
        
        txtAbstract = new JTextArea(5, 30);
        txtAbstract.setLineWrap(true);
        txtAbstract.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(txtAbstract);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(scrollPane, gbc);
        
        // Conference
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Conference:"), gbc);
        
        cmbConference = new JComboBox<>();
        // Add conference options here
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(cmbConference, gbc);
    }
    
    // Getters for form fields
    public String getPaperTitle() {
        return txtTitle.getText();
    }
    
    public String getPaperSubtitle() {
        return txtSubtitle.getText();
    }
    
    public String getPaperAbstract() {
        return txtAbstract.getText();
    }
    
    public String getSelectedConference() {
        return (String) cmbConference.getSelectedItem();
    }
}

