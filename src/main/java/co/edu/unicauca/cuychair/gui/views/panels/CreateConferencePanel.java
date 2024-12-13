package co.edu.unicauca.cuychair.gui.views.panels;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import co.edu.unicauca.cuychair.gui.views.modals.InputModal;

public class CreateConferencePanel extends JPanel {

    private static final String[] DUMMY_REVIEWERS = {"Revisor 1"};
    private static final String[] DUMMY_AUTHORS = {"Autor 1"};

    private static final int BORDER_PADDING = 20;
    private static final int FIELD_WIDTH = 200;
    private static final int TEXT_AREA_ROWS = 5;
    private static final int LIST_HEIGHT = 70;
    private static final int GRID_VGAP = 10;
    private static final int GRID_HGAP = 15;

    // Declare components
    private JTextField txtTitle;
    private JTextField txtSubject;
    private JTextField txtCity;
    private JTextField txtDate;
    private JTextArea txtDescription;
    private JList<String> listReviewers;
    private DefaultListModel<String> listModelReviewers;
    private JList<String> listAuthors;
    private DefaultListModel<String> listModelAuthors;
    private JButton btnSubmit;
    private JPanel mainPanel;

    public CreateConferencePanel() {
        initComponents();
    }

    private void initComponents() {
        // Initialize components with improved dimensions
        mainPanel = new JPanel();
        txtTitle = new JTextField();
        txtSubject = new JTextField();
        txtCity = new JTextField();
        txtDate = new JTextField();
        txtDescription = new JTextArea(TEXT_AREA_ROWS, 20);
        listReviewers = new JList<>(listModelReviewers = new DefaultListModel<>());
        listAuthors = new JList<>(listModelAuthors = new DefaultListModel<>());
        btnSubmit = new JButton("Crear Conferencia");
        JPanel inputPanel = new JPanel(new GridBagLayout());

        // Set preferred sizes
        Dimension fieldSize = new Dimension(FIELD_WIDTH, txtTitle.getPreferredSize().height);
        txtTitle.setPreferredSize(fieldSize);
        txtSubject.setPreferredSize(fieldSize);
        txtCity.setPreferredSize(fieldSize);
        txtDate.setPreferredSize(fieldSize);

        // Configure components
        txtDescription.setLineWrap(true);
        txtDescription.setWrapStyleWord(true);
        btnSubmit.setFont(new Font(btnSubmit.getFont().getName(), Font.BOLD, 14));

        // Layout setup
        mainPanel.setLayout(new BorderLayout(GRID_HGAP, GRID_VGAP));
        mainPanel.setBorder(new EmptyBorder(BORDER_PADDING, BORDER_PADDING, BORDER_PADDING, BORDER_PADDING));

        // Create main input panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Add components with GridBagLayout
        addFormField(inputPanel, "Titulo:", txtTitle, gbc, 0);
        addFormField(inputPanel, "Tema:", txtSubject, gbc, 1);
        addFormField(inputPanel, "Ciudad:", txtCity, gbc, 2);
        addFormField(inputPanel, "Fecha:", txtDate, gbc, 3);

        // Description area
        gbc.gridy = 4;
        gbc.gridx = 0;
        inputPanel.add(new JLabel("Descripcion:"), gbc);
        gbc.gridx = 1;
        gbc.weighty = 1.0;
        inputPanel.add(new JScrollPane(txtDescription), gbc);

        // Lists panel
        JPanel listsPanel = new JPanel(new GridLayout(2, 1, GRID_HGAP, GRID_VGAP));

        // Configure lists with fixed height
        JScrollPane reviewersScroll = new JScrollPane(listReviewers);
        JScrollPane authorsScroll = new JScrollPane(listAuthors);
        reviewersScroll.setPreferredSize(new Dimension(FIELD_WIDTH, LIST_HEIGHT));
        authorsScroll.setPreferredSize(new Dimension(FIELD_WIDTH, LIST_HEIGHT));

        // Wrap JScrollPanes in panels
        JPanel reviewersPanel = new JPanel(new BorderLayout());
        reviewersPanel.setBorder(BorderFactory.createTitledBorder("Revisores"));
        reviewersPanel.add(reviewersScroll, BorderLayout.CENTER);
        JButton btnAddReviewer = new JButton("Agregar");
        JButton btnRemoveReviewer = new JButton("Remover");
        JPanel reviewersButtonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnAddReviewer.addActionListener(
            l -> addPersonThroughModal("Ingrese el correo del revisor:", listModelReviewers)
        );
        btnRemoveReviewer.addActionListener(l -> removeSelectedIndex(listReviewers, listModelReviewers));
        reviewersButtonsPanel.add(btnAddReviewer);
        reviewersButtonsPanel.add(btnRemoveReviewer);
        reviewersPanel.add(reviewersButtonsPanel, BorderLayout.SOUTH);

        JPanel authorsPanel = new JPanel(new BorderLayout());
        authorsPanel.setBorder(BorderFactory.createTitledBorder("Autores"));
        authorsPanel.add(authorsScroll, BorderLayout.CENTER);
        JButton btnAddAuthor = new JButton("Add");
        JButton btnRemoveAuthor = new JButton("Remove");
        JPanel authorsButtonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnAddAuthor.addActionListener(l
                -> addPersonThroughModal("Ingrese el correo del autor:", listModelAuthors)
        );
        btnRemoveAuthor.addActionListener(l -> removeSelectedIndex(listAuthors, listModelAuthors));
        authorsButtonsPanel.add(btnAddAuthor);
        authorsButtonsPanel.add(btnRemoveAuthor);
        authorsPanel.add(authorsButtonsPanel, BorderLayout.SOUTH);

        listsPanel.add(reviewersPanel);
        listsPanel.add(authorsPanel);
        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(btnSubmit);

        // Add all panels to main panel
        mainPanel.add(inputPanel, BorderLayout.WEST);
        mainPanel.add(listsPanel, BorderLayout.EAST);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void addFormField(JPanel panel, String label, JComponent field, GridBagConstraints gbc, int row) {
        gbc.gridy = row;
        gbc.gridx = 0;
        gbc.weightx = 0.0;
        panel.add(new JLabel(label), gbc);
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        panel.add(field, gbc);
    }

    private void addPersonThroughModal(String message, DefaultListModel<String> list) {
        Window ancestor = SwingUtilities.getWindowAncestor(this);
        while (ancestor != null && !(ancestor instanceof JFrame)) {
            ancestor = SwingUtilities.getWindowAncestor(ancestor);
        }
        if (ancestor == null) {
            return;
        }
        InputModal modal = new InputModal((JFrame) ancestor,
                message,
                (String input) -> {
                    list.addElement(input);
                });
        modal.setVisible(true);
    }

    private void removeSelectedIndex(JList<String> list, DefaultListModel<String> listModel) {
        int selectedIndex = list.getSelectedIndex();
        if (selectedIndex != -1) {
            listModel.remove(selectedIndex);
        }
    }

    public static void main(String[] args) {
        // Run the application
        JFrame frame = new JFrame("Crear Conferencia");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new CreateConferencePanel());
        frame.pack();
        SwingUtilities.invokeLater(() -> frame.setVisible(true));
    }
}
