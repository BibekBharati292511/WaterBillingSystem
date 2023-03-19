/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LEGION
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        loginPanel = new javax.swing.JPanel();
        WBS = new javax.swing.JLabel();
        tapPhoto = new javax.swing.JLabel();
        userLoginPanel = new javax.swing.JPanel();
        LoginTitle = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(45, 160, 204));
        loginPanel.setForeground(new java.awt.Color(255, 255, 255));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WBS.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        WBS.setForeground(new java.awt.Color(255, 255, 255));
        WBS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WBS.setText("Water Billing System");
        loginPanel.add(WBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        tapPhoto.setBackground(new java.awt.Color(45, 160, 204));
        tapPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Water-Source.jpg"))); // NOI18N
        loginPanel.add(tapPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 350, 570));

        userLoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        userLoginPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        userLoginPanel.setForeground(new java.awt.Color(0, 0, 0));
        userLoginPanel.setMinimumSize(new java.awt.Dimension(204, 60));
        userLoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LoginTitle.setForeground(new java.awt.Color(0, 0, 0));
        LoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTitle.setText("Login");
        userLoginPanel.add(LoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        userLoginPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 240, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Meter Number");
        userLoginPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username");
        userLoginPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        userLoginPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 60, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info-icon.png"))); // NOI18N
        jButton3.setToolTipText("Please login with your registered username and meter number in water billing department\n");
        userLoginPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 20, 20));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        userLoginPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 240, -1));

        loginPanel.add(userLoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 360, 350));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JLabel WBS;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel tapPhoto;
    private javax.swing.JPanel userLoginPanel;
    // End of variables declaration//GEN-END:variables
}