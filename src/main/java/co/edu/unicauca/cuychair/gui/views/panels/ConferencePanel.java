package co.edu.unicauca.cuychair.gui.views.panels;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JScrollBar;

import co.edu.unicauca.cuychair.gui.domain.Conference;
import co.edu.unicauca.cuychair.gui.views.test.ConferenceCard;

/**
 *
 * @author Frdy
 */
public class ConferencePanel extends javax.swing.JPanel {

    private final List<JComponent> cards = new ArrayList<>();

    /**
     * Creates new form ConferencePanel
     */
    public ConferencePanel() {
        System.out.println("Conference Panel loaded");
        initComponents();
        testConferenceCards();
    }

    public final void testConferenceCards() {
        cards.add(new ConferenceCard(new Conference("IAS", "No se que es esto", new Date(), "more IAS", "More IAs")));

        cards.add(new ConferenceCard(new Conference("Minecon", "this is great conference about Minecraft!!! <br> explore all the news about minecraft, and what it can possibly bring", new Date(), "more Minecon", "More Minecon")));

        cards.add(new ConferenceCard(new Conference("TechFuture Expo", "Explore the latest in technology and innovation. <br> Join us to see how the future of tech is unfolding!", new Date(), "more TechFuture Expo", "More TechFuture Expo")));

        cards.add(new ConferenceCard(new Conference("EcoSummit", "An inspiring event on sustainability and environmental innovation. <br> Learn how we can make a greener planet together.", new Date(), "more EcoSummit", "More EcoSummit")));

        cards.add(new ConferenceCard(new Conference("AI & Robotics Summit", "Dive into the world of AI and robotics! <br> See groundbreaking advancements and future possibilities.", new Date(), "more AI & Robotics Summit", "More AI & Robotics Summit")));

        cards.add(new ConferenceCard(new Conference("Medical Breakthroughs", "Join top researchers in healthcare and medicine. <br> Discover the latest in medical technology and innovation.", new Date(), "more Medical Breakthroughs", "More Medical Breakthroughs")));

        cards.add(new ConferenceCard(new Conference("SpaceCon", "A stellar conference for space enthusiasts! <br> Explore new discoveries, missions, and the future of space exploration.", new Date(), "more SpaceCon", "More SpaceCon")));

        this.populateContentPanel(calculateColumns(scrollPanel.getWidth()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanel = new javax.swing.JScrollPane();
        contentPanel = new javax.swing.JPanel();
        optionsPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setViewportView(contentPanel);
        scrollPanel.setWheelScrollingEnabled(false);
        scrollPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                scrollPanelMouseWheelMoved(evt);
            }
        });
        scrollPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                scrollPanelComponentResized(evt);
            }
        });

        contentPanel.setLayout(new java.awt.GridBagLayout());
        scrollPanel.setViewportView(contentPanel);

        add(scrollPanel, java.awt.BorderLayout.CENTER);

        optionsPanel.setPreferredSize(new java.awt.Dimension(150, 326));

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(optionsPanel, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void scrollPanelComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_scrollPanelComponentResized
        int columns = calculateColumns(scrollPanel.getWidth());
        populateContentPanel(columns);
    }//GEN-LAST:event_scrollPanelComponentResized

    private void scrollPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_scrollPanelMouseWheelMoved
        JScrollBar verticalBar = scrollPanel.getVerticalScrollBar();
        int scrollAmount = evt.getUnitsToScroll() * verticalBar.getUnitIncrement()*20;
        verticalBar.setValue(verticalBar.getValue() + scrollAmount);
    }//GEN-LAST:event_scrollPanelMouseWheelMoved

    // Method to calculate the number of columns based on available width
    private int calculateColumns(int availableWidth) {
        return Math.max(1, availableWidth / (ConferenceCardPanel.WIDTH + 10)); // 10 is the gap between cards
    }

    private void populateContentPanel(int columns) {
        contentPanel.removeAll();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding between cards
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTHWEST;

        for (int i = 0; i < cards.size(); i++) {
            Component comp = cards.get(i);
            gbc.gridx = i % columns; // Column index
            gbc.gridy = i / columns; // Row index
            contentPanel.add(comp, gbc);
        }

        contentPanel.revalidate(); // Refresh the layout
        contentPanel.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables
}
