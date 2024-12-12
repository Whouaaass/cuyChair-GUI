package co.edu.unicauca.cuychair.gui.views.panels;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class goBackContainer extends JPanel {
    private JButton btnBack;
    private JPanel contentPanel;

    public goBackContainer(JPanel content) {
        this.contentPanel = content;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create back button
        btnBack = new JButton("← Back");
        btnBack.setFocusPainted(false);

        // Add components to layout
        add(btnBack, BorderLayout.NORTH);
        add(contentPanel, BorderLayout.CENTER);
    }

    public JButton getBackButton() {
        return btnBack;
    }
}
