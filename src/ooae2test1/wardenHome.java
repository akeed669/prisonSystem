
package ooae2test1;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class wardenHome extends javax.swing.JFrame {

    prisonInmate pI = new prisonInmate();
    prisonGuard pG = new prisonGuard();
    
    public wardenHome(String username) {
        initComponents();
        this.headerLbl.setText("Welcome to your homepage, "+username+" !");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageInmatesBtn = new javax.swing.JButton();
        manageGuardsBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        headerLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manageInmatesBtn.setText("Manage Inmates");
        manageInmatesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInmatesBtnActionPerformed(evt);
            }
        });

        manageGuardsBtn.setText("Manage Guards");
        manageGuardsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageGuardsBtnActionPerformed(evt);
            }
        });

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        headerLbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        headerLbl.setText("Welcome to your homepage, //username here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageGuardsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageInmatesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(headerLbl))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(manageInmatesBtn)
                .addGap(37, 37, 37)
                .addComponent(manageGuardsBtn)
                .addGap(37, 37, 37)
                .addComponent(logoutBtn)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageInmatesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInmatesBtnActionPerformed
        try {
            FormInmateManager iM = new FormInmateManager();
            iM.setVisible(true);
            pI.populateInmatesTable(iM);
        } catch (SQLException ex) {
            Logger.getLogger(wardenHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_manageInmatesBtnActionPerformed

    private void manageGuardsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageGuardsBtnActionPerformed
        try {
            FormGuardManager gM = new FormGuardManager();
            gM.setVisible(true);
            pG.populateGuardsTable(gM);
        } catch (SQLException ex) {
            Logger.getLogger(wardenHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_manageGuardsBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed

        //https://coderanch.com/t/538905/java/Closing-open-windows-opening
        java.awt.Window win[] = java.awt.Window.getWindows();
        for (int i = 0; i < win.length; i++) {
            win[i].dispose();
            win[i] = null;
        }
//            wardenMethods wardenActs=new wardenMethods();
        loginForm newLogin = new loginForm();
        newLogin.setVisible(true);

    }//GEN-LAST:event_logoutBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(wardenHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(wardenHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(wardenHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(wardenHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new wardenHome().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLbl;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton manageGuardsBtn;
    private javax.swing.JButton manageInmatesBtn;
    // End of variables declaration//GEN-END:variables
}
