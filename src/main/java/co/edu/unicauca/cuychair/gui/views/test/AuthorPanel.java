package co.edu.unicauca.cuychair.gui.views.test;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Frdy
 */
public class AuthorPanel extends JPanel {
    private JTable articlesTable;       // Tabla para mostrar artículos
    private JButton newSubmissionButton; // Botón para enviar un nuevo artículo

    public AuthorPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Modelo para la tabla de artículos
        String[] columnNames = {"Nombre del Artículo", "Conferencia", "Estado"};
        Object[][] data = {
                {"Inteligencia Artificial Avanzada", "Conferencia de IA 2024", "En Revisión"},
                {"Sistemas Distribuidos Modernos", "Conferencia de Computación 2024", "Aceptado"},
                {"Bases de Datos Escalables", "Conferencia de Software 2024", "Rechazado"}
        };

        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer que las celdas sean no editables
            }
        };

        articlesTable = new JTable(tableModel);
        articlesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(articlesTable);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Artículos Enviados"));
        add(scrollPane, BorderLayout.CENTER);

        // Panel inferior con botón para nuevo envío
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        newSubmissionButton = new JButton("Enviar Nuevo Artículo");
        newSubmissionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleNewSubmission();
            }
        });
        bottomPanel.add(newSubmissionButton);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    // Método para manejar la acción de nuevo envío
    private void handleNewSubmission() {
        JOptionPane.showMessageDialog(this, "Abriendo panel para enviar un nuevo artículo...", "Nuevo Envío", JOptionPane.INFORMATION_MESSAGE);

        // Aquí podrías abrir el panel correspondiente para el envío de artículos.
        // Por ejemplo:
        // JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        // parentFrame.setContentPane(new SubmissionPanel());
        // parentFrame.revalidate();
        // parentFrame.repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel del Autor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new AuthorPanel());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
