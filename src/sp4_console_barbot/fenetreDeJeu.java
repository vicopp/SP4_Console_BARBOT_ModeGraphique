/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_barbot;

/**
 *
 * @author victor
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
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

        panneau_grille = new javax.swing.JPanel();
        panneau_info_joueurs = new javax.swing.JPanel();
        panneau_info_partie = new javax.swing.JPanel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur1 = new java.awt.TextField();
        nom_joueur2 = new java.awt.TextField();
        btn_start = new javax.swing.JButton();
        btn_col0 = new javax.swing.JButton();
        btn_col1 = new javax.swing.JButton();
        btn_col2 = new javax.swing.JButton();
        btn_col3 = new javax.swing.JButton();
        btn_col4 = new javax.swing.JButton();
        btn_col5 = new javax.swing.JButton();
        btn_col6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(51, 255, 204));
        panneau_grille.setLayout(new java.awt.GridLayout());
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 672, 576));

        panneau_info_joueurs.setBackground(new java.awt.Color(255, 255, 153));
        panneau_info_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panneau_info_joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 340, 160));

        panneau_info_partie.setBackground(new java.awt.Color(255, 255, 153));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 350, 140));

        panneau_creation_partie.setBackground(new java.awt.Color(255, 255, 153));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom joueur 1:");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Nom joueur 2:");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        nom_joueur1.setName(""); // NOI18N
        nom_joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur1ActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 20, 130, -1));
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 130, -1));

        btn_start.setText("Demarrer la partie");
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 330, 160));

        btn_col0.setText("1");
        btn_col0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        btn_col1.setText("2");
        getContentPane().add(btn_col1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 60, -1, -1));

        btn_col2.setText("3");
        getContentPane().add(btn_col2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 60, -1, -1));

        btn_col3.setText("4");
        getContentPane().add(btn_col3, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 60, -1, -1));

        btn_col4.setText("5");
        btn_col4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col4, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 60, -1, -1));

        btn_col5.setText("6");
        getContentPane().add(btn_col5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        btn_col6.setText("7");
        getContentPane().add(btn_col6, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nom_joueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur1ActionPerformed

    private void btn_col0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col0ActionPerformed

    private void btn_col4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col4ActionPerformed

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
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col0;
    private javax.swing.JButton btn_col1;
    private javax.swing.JButton btn_col2;
    private javax.swing.JButton btn_col3;
    private javax.swing.JButton btn_col4;
    private javax.swing.JButton btn_col5;
    private javax.swing.JButton btn_col6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.TextField nom_joueur1;
    private java.awt.TextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueurs;
    private javax.swing.JPanel panneau_info_partie;
    // End of variables declaration//GEN-END:variables
}
