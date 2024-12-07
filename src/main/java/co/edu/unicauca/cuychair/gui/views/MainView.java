package co.edu.unicauca.cuychair.gui.views;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.unicauca.cuychair.gui.context.SessionContext;
import co.edu.unicauca.cuychair.gui.views.panels.AuthorPanel;
import co.edu.unicauca.cuychair.gui.views.panels.ConferencePanel;
import co.edu.unicauca.cuychair.gui.views.panels.ReviewPanel;

/**
 * Vista principal de la aplicación, es como un home 
 * @author Frdy
 */
public class MainView extends javax.swing.JFrame {

    private SelectedView selectedView = null;

    public MainView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public MainView(String viewId) {
        SelectedView selection = SelectedView.valueOf(viewId);
        initComponents();
        setLocationRelativeTo(null);
        selectView(selection);
    }

    private void initComponents() {

        headerPanel = new JPanel();
        navigationPanel = new JPanel();
        viewPanel = new JPanel();
        jButton1 = new JButton("Conferences");
        jButton2 = new JButton("Papers");
        jButton3 = new JButton("Review Papers");
        JLabel userLabel = new JLabel("User: " + SessionContext.getInstance().getUserName());        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));

        headerPanel.setLayout(new BorderLayout());
        headerPanel.add(navigationPanel, BorderLayout.CENTER);

        navigationPanel.setLayout(new BoxLayout(navigationPanel, BoxLayout.LINE_AXIS));
        navigationPanel.add(jButton1);
        navigationPanel.add(jButton2);
        navigationPanel.add(jButton3);

        jButton1.addActionListener(evt -> selectView(SelectedView.CONFERENCE));
        jButton2.addActionListener(evt -> selectView(SelectedView.PAPERS));
        jButton3.addActionListener(evt -> selectView(SelectedView.REVIEW_PAPERS));

        getContentPane().add(headerPanel, BorderLayout.PAGE_START);

        viewPanel.setLayout(new CardLayout());
        getContentPane().add(viewPanel, BorderLayout.CENTER);

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new MainView().setVisible(true));
    }

    /**
     * Selecciona la vista a mostrar
     * 
     * @param selectedView vista a mostrar
     */
    private void selectView(SelectedView selectedView) {
        CardLayout cardLay = (CardLayout) viewPanel.getLayout();
        if (!selectedView.hasBeenGotted()) {
            viewPanel.add(selectedView.getPanel(), selectedView.getId());
        }
        cardLay.show(viewPanel, selectedView.getId());
        this.selectedView = selectedView;

        viewPanel.validate();

        // cambia el titulo de la ventana
        this.setTitle(selectedView.getId());
        pack();
    }

    private enum SelectedView {
        CONFERENCE("Conference"),
        PAPERS("Papers"),
        REVIEW_PAPERS("ReviewPapers");

        private final String id;
        private JPanel panel; // panel seleccionado

        private final static Map<String, JPanel> panelsGotted = new HashMap<>(3);

        private SelectedView(String id) {
            this.id = id;
            panel = null;
        }

        public JPanel getPanel() {
            if (panelsGotted.containsKey(id))
                return panel;
            switch (id) {
                case "Conference" -> panel = new ConferencePanel();
                case "Papers" -> panel = new AuthorPanel();
                case "ReviewPapers" -> panel = new ReviewPanel();
            }
            panelsGotted.put(id, panel);
            return panel;
        }

        public boolean hasBeenGotted() {
            return panelsGotted.containsKey(id);
        }

        public String getId() {
            return id;
        }
    }

    // Componentes 
    private JPanel navigationPanel;
    private JPanel headerPanel;
    private JPanel viewPanel;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
}
