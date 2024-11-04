package co.edu.unicauca.cuychair.gui.views;


import co.edu.unicauca.cuychair.gui.styledcontrols.StyledButtonUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Frdy
 */
public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();        
        setUIs();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null); // this centers the view in the screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BannerPanel = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        InfoPanel = new javax.swing.JPanel();
        userIconLabel = new javax.swing.JLabel();
        userInfoLabel = new javax.swing.JPanel();
        mailLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        OptionsPanel = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 30));
        goConferencesButton = new javax.swing.JButton();
        goPapersButton = new javax.swing.JButton();
        goReviewPapersButton = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 350));

        BannerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BannerPanel.setPreferredSize(new java.awt.Dimension(280, 369));

        icon.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon("D:\\Universidad\\IngenieriaDeSoftwareII\\cuyChair-GUI\\src\\main\\resources\\images\\icon-md.png")); // NOI18N

        nameLabel.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("CuyChair Conference");

        javax.swing.GroupLayout BannerPanelLayout = new javax.swing.GroupLayout(BannerPanel);
        BannerPanel.setLayout(BannerPanelLayout);
        BannerPanelLayout.setHorizontalGroup(
            BannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BannerPanelLayout.setVerticalGroup(
            BannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(nameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(BannerPanel, java.awt.BorderLayout.CENTER);

        MainPanel.setLayout(new java.awt.BorderLayout());

        userIconLabel.setIcon(new javax.swing.ImageIcon("D:\\Universidad\\IngenieriaDeSoftwareII\\cuyChair-GUI\\src\\main\\resources\\images\\personIcon.png")); // NOI18N
        InfoPanel.add(userIconLabel);

        userInfoLabel.setLayout(new javax.swing.BoxLayout(userInfoLabel, javax.swing.BoxLayout.Y_AXIS));

        mailLabel.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        mailLabel.setText("user@mail.com");
        userInfoLabel.add(mailLabel);

        usernameLabel.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        usernameLabel.setText("Nombre de Usuario");
        userInfoLabel.add(usernameLabel);

        InfoPanel.add(userInfoLabel);

        MainPanel.add(InfoPanel, java.awt.BorderLayout.PAGE_START);

        goConferencesButton.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        goConferencesButton.setText("Ver Conferencias");
        goConferencesButton.setPreferredSize(new java.awt.Dimension(200, 40));
        goConferencesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goConferencesButtonActionPerformed(evt);
            }
        });

        goPapersButton.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        goPapersButton.setText("Articulos Enviados");
        goPapersButton.setPreferredSize(new java.awt.Dimension(200, 40));
        goPapersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goPapersButtonActionPerformed(evt);
            }
        });

        goReviewPapersButton.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        goReviewPapersButton.setText("Revisar Articulos");
        goReviewPapersButton.setPreferredSize(new java.awt.Dimension(200, 40));
        goReviewPapersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goReviewPapersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionsPanelLayout = new javax.swing.GroupLayout(OptionsPanel);
        OptionsPanel.setLayout(OptionsPanelLayout);
        OptionsPanelLayout.setHorizontalGroup(
            OptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsPanelLayout.createSequentialGroup()
                .addGroup(OptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(goReviewPapersButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(goPapersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goConferencesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filler1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filler2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        OptionsPanelLayout.setVerticalGroup(
            OptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsPanelLayout.createSequentialGroup()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(goConferencesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(goPapersButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(goReviewPapersButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainPanel.add(OptionsPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(MainPanel, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void setUIs() {
        this.goConferencesButton.setUI(new StyledButtonUI());
        this.goPapersButton.setUI(new StyledButtonUI());
        this.goReviewPapersButton.setUI(new StyledButtonUI());
    }
    
    private void goReviewPapersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goReviewPapersButtonActionPerformed
        System.out.println("Going to Review Papers");
    }//GEN-LAST:event_goReviewPapersButtonActionPerformed

    private void goPapersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goPapersButtonActionPerformed
        System.out.println("Going to Papers");
    }//GEN-LAST:event_goPapersButtonActionPerformed

    private void goConferencesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goConferencesButtonActionPerformed
        System.out.println("Going to Conference");
    }//GEN-LAST:event_goConferencesButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BannerPanel;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel OptionsPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton goConferencesButton;
    private javax.swing.JButton goPapersButton;
    private javax.swing.JButton goReviewPapersButton;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel userIconLabel;
    private javax.swing.JPanel userInfoLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
