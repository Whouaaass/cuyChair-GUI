/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.edu.unicauca.cuychair.gui.views.panels;

/**
 *
 * @author Frdy
 */
public class ConferenceCardPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConferenceCardPanel
     */
    public ConferenceCardPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMultilineLabel1 = new co.edu.unicauca.cuychair.gui.views.controllers.JMultilineLabel();

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conference Title");

        jButton1.setText("Ver más");

        jButton2.setText("Mandar Articulo");

        jMultilineLabel1.setColumns(20);
        jMultilineLabel1.setRows(5);
        jMultilineLabel1.setText("[Nombre de la Conferencia] es un evento anual que reúne a expertos, profesionales y entusiastas de [tema o industria] para compartir conocimientos, descubrir las últimas tendencias y fomentar la colaboración. Durante [número de días] días, los asistentes podrán participar en una variedad de actividades, como presentaciones magistrales, sesiones interactivas, paneles de discusión y talleres prácticos, diseñados para profundizar en temas clave de [tema o industria].\n\nCon una selección de ponentes reconocidos a nivel nacional e internacional, esta conferencia ofrece una oportunidad única para aprender de los líderes de opinión y pioneros del sector. Además, los asistentes podrán expandir su red de contactos a través de sesiones de networking y eventos sociales, favoreciendo la creación de relaciones duraderas y oportunidades de colaboración.\n\nNo importa si eres un profesional experimentado, un investigador académico o alguien que recién comienza en el campo; [Nombre de la Conferencia] tiene algo para todos. Únete a nosotros para una experiencia enriquecedora que contribuirá a tu crecimiento profesional y personal en [tema o industria].\n\n");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMultilineLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jMultilineLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(14, 14, 14))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("Conference Title");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private co.edu.unicauca.cuychair.gui.views.controllers.JMultilineLabel jMultilineLabel1;
    // End of variables declaration//GEN-END:variables
}
