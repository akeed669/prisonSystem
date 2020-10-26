package ooae2test1;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

public class FormGuardManager extends javax.swing.JFrame {

    prisonGuard pG; //declaring an instance of the prisonGuard class
//    wardenMethods wM; //declaring an instance of the wardenMethods class
    FormWeaponSelector wS = new FormWeaponSelector(); //initialising an instance of the FormWeaponSelector class

    public FormGuardManager() throws SQLException {
        initComponents();
        pG = new prisonGuard();
//        this.wM=wardenActs;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fNameBox = new javax.swing.JTextField();
        lNameBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addGuardBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uNameBox = new javax.swing.JTextField();
        pWordBox = new javax.swing.JTextField();
        closeBtn = new javax.swing.JButton();
        removeGuardBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        updateRecordBtn = new javax.swing.JButton();
        assignTaskBtn = new javax.swing.JButton();
        addGunBtn = new javax.swing.JButton();
        deployCellBlock = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Deployment Area");

        addGuardBtn.setText("Add Guard");
        addGuardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGuardBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Manage Guards Form");

        jLabel5.setText("Username");

        jLabel6.setText("Password");

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        removeGuardBtn.setText("Remove Guard");
        removeGuardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeGuardBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Deployment Area", "Username"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        updateRecordBtn.setText("Update Record");
        updateRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRecordBtnActionPerformed(evt);
            }
        });

        assignTaskBtn.setText("Assign Task");
        assignTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTaskBtnActionPerformed(evt);
            }
        });

        addGunBtn.setText("Select Weapon");
        addGunBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGunBtnActionPerformed(evt);
            }
        });

        deployCellBlock.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lNameBox)
                                    .addComponent(uNameBox, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(deployCellBlock, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fNameBox, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(49, 49, 49)
                                .addComponent(pWordBox, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addGunBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(addGuardBtn)
                        .addGap(18, 18, 18)
                        .addComponent(removeGuardBtn)
                        .addGap(18, 18, 18)
                        .addComponent(assignTaskBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateRecordBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeBtn)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(deployCellBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(uNameBox))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pWordBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(addGunBtn)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGuardBtn)
                    .addComponent(removeGuardBtn)
                    .addComponent(assignTaskBtn)
                    .addComponent(updateRecordBtn)
                    .addComponent(refreshBtn)
                    .addComponent(closeBtn))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addGuardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGuardBtnActionPerformed
        try {

            String fName = fNameBox.getText();
            String lName = lNameBox.getText();
            String deployment = (String) deployCellBlock.getSelectedItem();
            String uName = uNameBox.getText();
            String pWord = pWordBox.getText();
            String chosenWeapon = wS.weaponDesc;

            //retrieve user data from form and store in variables before creating a new instance of a prison guard
            prisonGuard guard = new prisonGuard(fName, lName, deployment, uName, pWord, chosenWeapon);

            //the facade pattern is used here to call a method from the prisonGuard class by using 
            boolean success = pG.addNewGuard(guard);
            if (success) {
                popupMessage.infoBox("A new guard has been successfully added to the system", "Information");
            }

            //refreshing the table in the form by displaying the guard added into the database
            pG.populateGuardsTable(this);
        } catch (SQLException ex) {
            Logger.getLogger(FormGuardManager.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_addGuardBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        try {

            pG.populateGuardsTable(this);
        } catch (SQLException ex) {
            Logger.getLogger(FormGuardManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_refreshBtnActionPerformed


    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();

        TableModel model = jTable1.getModel();

        fNameBox.setText(model.getValueAt(i, 0).toString());

        lNameBox.setText(model.getValueAt(i, 1).toString());

        deployCellBlock.getModel().setSelectedItem(model.getValueAt(i, 2).toString());

        uNameBox.setText(model.getValueAt(i, 3).toString());

        pWordBox.setText("******");
    }//GEN-LAST:event_jTable1MouseClicked

    private void removeGuardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeGuardBtnActionPerformed

        try {

            String query = "DELETE FROM guards where username ='" + uNameBox.getText() + "'";
            https://stackoverflow.com/questions/9442027/how-to-delete-a-record-string-java-and-mysql

            pG.executeSQlQuery(query, "Deleted", this);
            pG.populateGuardsTable(this);
        } catch (SQLException ex) {
            Logger.getLogger(FormGuardManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeGuardBtnActionPerformed

    private void updateRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRecordBtnActionPerformed
        try {

            String query = "UPDATE guards SET fName='" + fNameBox.getText() + "',lName='" + lNameBox.getText() + "',prisonArea='" + (String) deployCellBlock.getSelectedItem() + "' WHERE username = '" + uNameBox.getText() + "'";
            https://www.dreamincode.net/forums/topic/144921-sql-update-query-in-java-netbeans/
            pG.executeSQlQuery(query, "Updated", this);
            pG.populateGuardsTable(this);
        } catch (SQLException ex) {
            Logger.getLogger(FormGuardManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_updateRecordBtnActionPerformed

    private void assignTaskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignTaskBtnActionPerformed
        try {
            int i = jTable1.getSelectedRow();
            TableModel model = jTable1.getModel();

            String username = (model.getValueAt(i, 3).toString());

            FormGuardTask gT = new FormGuardTask(username);
            gT.setVisible(true);
            pG.populateGuardsTasksTable(gT);
        } catch (SQLException ex) {
            Logger.getLogger(FormGuardManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_assignTaskBtnActionPerformed

    private void addGunBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGunBtnActionPerformed

        wS.setVisible(true);

    }//GEN-LAST:event_addGunBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) throws SQLException {
//
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
//
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormGuardManager.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormGuardManager.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormGuardManager.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormGuardManager.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//
//                try {
//                    new FormGuardManager().setVisible(true);
//
//                } catch (SQLException ex) {
//                    Logger.getLogger(FormGuardManager.class
//                            .getName()).log(Level.SEVERE, null, ex);
//                }
//
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGuardBtn;
    private javax.swing.JButton addGunBtn;
    private javax.swing.JButton assignTaskBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JComboBox deployCellBlock;
    private javax.swing.JTextField fNameBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jTable1;
    private javax.swing.JTextField lNameBox;
    private javax.swing.JTextField pWordBox;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton removeGuardBtn;
    private javax.swing.JTextField uNameBox;
    private javax.swing.JButton updateRecordBtn;
    // End of variables declaration//GEN-END:variables
}
