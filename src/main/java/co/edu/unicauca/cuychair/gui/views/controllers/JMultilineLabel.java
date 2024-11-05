package co.edu.unicauca.cuychair.gui.views.controllers;


import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Frdy
 */
public class JMultilineLabel extends JTextArea {
    private static final long serialVersionUID = 1L;

    // No-argument constructor for Java Bean compatibility
    public JMultilineLabel() {
        this("");
    }

    // Constructor with text parameter
    public JMultilineLabel(String text) {
        super(text);
        initialize();
    }

    // Initialize method to set default properties
    private void initialize() {
        setEditable(false);
        setCursor(null);
        setOpaque(false);
        setFocusable(false);
        setFont(UIManager.getFont("Label.font"));
        setWrapStyleWord(true);
        setLineWrap(true);
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setAlignmentY(CENTER_ALIGNMENT);
    }

    // Getter for the text property
    @Override
    public String getText() {
        return super.getText();
    }

    // Setter for the text property
    @Override
    public void setText(String text) {
        super.setText(text);
    }

    // Optional: Override other property getters and setters if necessary
}
