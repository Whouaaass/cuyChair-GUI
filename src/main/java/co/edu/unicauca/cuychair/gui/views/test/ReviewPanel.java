package co.edu.unicauca.cuychair.gui.views.test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

import co.edu.unicauca.cuychair.gui.views.controllers.JCustomTextArea;

public class ReviewPanel extends JPanel {

    private final int COMMENT_LIMIT = 1000; // Límite de caracteres para comentarios

    private final JList<String> articleList;       // Lista de artículos
    private final JTextArea commentsArea;         // Área para escribir comentarios
    private final JComboBox<String> ratingCombo;  // ComboBox para calificación
    private final JButton submitButton;           // Botón para enviar la revisión    

    public ReviewPanel() {
        setLayout(new BorderLayout(10, 10));

        // Panel izquierdo: Lista de artículos
        JPanel articlePanel = new JPanel(new BorderLayout());
        articlePanel.setBorder(BorderFactory.createTitledBorder("Artículos Pendientes"));
        DefaultListModel<String> articleListModel = new DefaultListModel<>();
        articleListModel.addElement("Artículo 1: Inteligencia Artificial");
        articleListModel.addElement("Artículo 2: Sistemas Distribuidos");
        articleListModel.addElement("Artículo 3: Bases de Datos");
        articleList = new JList<>(articleListModel);
        articleList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);        
        articlePanel.add(new JScrollPane(articleList), BorderLayout.CENTER);
        add(articlePanel, BorderLayout.WEST);

        // Panel central: Área de revisión
        JPanel reviewPanel = new JPanel(new BorderLayout(5, 5));
        JPanel commentPanel = new JPanel(new BorderLayout());
        commentPanel.setBorder(BorderFactory.createTitledBorder("Comentarios"));
        commentsArea = new JCustomTextArea(COMMENT_LIMIT);
        commentsArea.setLineWrap(true);
        commentsArea.setWrapStyleWord(true);                
        commentPanel.add(new JScrollPane(commentsArea), BorderLayout.CENTER);
        reviewPanel.add(commentPanel, BorderLayout.CENTER);


        // Panel de calificación
        JPanel ratingPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ratingPanel.setBorder(BorderFactory.createTitledBorder("Calificación"));
        String[] ratings = {"1 - Muy Deficiente", "2 - Deficiente", "3 - Regular", "4 - Bueno", "5 - Excelente"};
        ratingCombo = new JComboBox<>(ratings);
        ratingPanel.add(new JLabel("Calificación:"));
        ratingPanel.add(ratingCombo);
        reviewPanel.add(ratingPanel, BorderLayout.SOUTH);

        add(reviewPanel, BorderLayout.CENTER);

        // Panel inferior: Controles de envio
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));                
        submitButton = new JButton("Enviar Revisión");
        submitButton.addActionListener((ActionEvent e) -> {
            handleReviewSubmission();
        });
        controlPanel.add(submitButton);        
        
        add(controlPanel, BorderLayout.SOUTH);
    }

    // Manejo de la acción de envío
    private void handleReviewSubmission() {
        String selectedArticle = articleList.getSelectedValue();
        String comments = commentsArea.getText().trim();
        String rating = (String) ratingCombo.getSelectedItem();

        if (selectedArticle == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un artículo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (comments.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, escribe tus comentarios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Aquí puedes añadir la lógica para guardar la revisión en la base de datos
        JOptionPane.showMessageDialog(this, "Revisión enviada para \"" + selectedArticle + "\".\nCalificación: " + rating + "\nComentarios: " + comments, "Revisión Enviada", JOptionPane.INFORMATION_MESSAGE);

        // Limpiar campos después del envío
        articleList.clearSelection();
        commentsArea.setText("");
        ratingCombo.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel de Revisión de Artículos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ReviewPanel());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


