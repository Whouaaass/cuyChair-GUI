package co.edu.unicauca.cuychair.gui.views.test;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import co.edu.unicauca.cuychair.gui.domain.Conference;
import co.edu.unicauca.cuychair.gui.utils.DateUtils;
import co.edu.unicauca.cuychair.gui.utils.StringUtils;

// Class for individual conference cards
public class ConferenceCard extends JPanel {
    public ConferenceCard(Conference conference) {
        setLayout(new BorderLayout(10, 10));   
        
        // adds a cool border
        setBorder(BorderFactory.createEtchedBorder());

        // Wrapper panel for padding
        JPanel paddingWrapper = new JPanel(new BorderLayout(10, 10));
        paddingWrapper.setBorder(new EmptyBorder(10, 10, 10, 10)); // top, left, bottom, right       

        add(paddingWrapper, BorderLayout.CENTER);


        // Title
        JLabel titleLabel = new JLabel(conference.getTitle());
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        paddingWrapper.add(titleLabel, BorderLayout.NORTH);

        // Conference Info
        JPanel infoPanel = new JPanel(new GridLayout(5, 1));
        infoPanel.add(new JLabel(StringUtils.truncateWithEllipsis(conference.getDescription(), 30)));
        infoPanel.add(new JSeparator());
        infoPanel.add(new JLabel("Fecha: " + DateUtils.formatToPrettyDate(conference.getDate())));
        infoPanel.add(new JLabel("Ubicación: " + conference.getLocation()));
        infoPanel.add(new JLabel("Estado: " + conference.getStatus()));
        paddingWrapper.add(infoPanel, BorderLayout.CENTER);

        // Button to view details
        JButton viewButton = new JButton("Ver Más");
        viewButton.addActionListener(e -> showConferenceDetails(conference));
        paddingWrapper.add(viewButton, BorderLayout.SOUTH);
    }

    private void showConferenceDetails(Conference conference) {
        // Redirect logic placeholder
        JOptionPane.showMessageDialog(this, "Mostrando detalles para: " + conference.getTitle());
    }
}
