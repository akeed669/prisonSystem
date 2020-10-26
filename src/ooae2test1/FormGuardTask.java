package ooae2test1;

import AbstractTaskFactory.Assignment;
import AbstractTaskFactory.assignmentFactoryProducer;
import AbstractTaskFactory.assignmentFactory;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

public class FormGuardTask extends javax.swing.JFrame {

    prisonGuard pG;
    String uNamePass;
    assignmentFactory gFactory;
    
    public FormGuardTask() {
        initComponents();
        pG = new prisonGuard();

    }

    public FormGuardTask(String username) {
        initComponents();
        uNamePass = username;
        pG = new prisonGuard();
        gFactory=assignmentFactoryProducer.getFactory(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aTypeCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        descBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jSpinner1 = new javax.swing.JSpinner();
        addTaskBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        guardsTaskTable = new javax.swing.JTable();
        removeTaskBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Patrol", "Escort Inmate" }));
        aTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aTypeComboActionPerformed(evt);
            }
        });

        jLabel1.setText("Assignment Type");

        jLabel2.setText("Description");

        jLabel3.setText("Date");

        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });

        addTaskBtn.setText("Add Task");
        addTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskBtnActionPerformed(evt);
            }
        });

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        guardsTaskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Username", "Assignment Type", "Description", "Date"
            }
        ));
        guardsTaskTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardsTaskTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(guardsTaskTable);

        removeTaskBtn.setText("Remove Task");
        removeTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTaskBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(descBox, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(aTypeCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addTaskBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(removeTaskBtn)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addTaskBtn)
                            .addComponent(removeTaskBtn))
                        .addGap(18, 18, 18)
                        .addComponent(closeBtn)
                        .addGap(69, 69, 69))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void aTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aTypeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aTypeComboActionPerformed


    private void addTaskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskBtnActionPerformed

        try {
            String taskType = (String) aTypeCombo.getSelectedItem();
            String description = descBox.getText();

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            jXDatePicker1.setFormats(dateFormat);
            DateFormat sysDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String date_to_store = sysDate.format(jXDatePicker1.getDate());
            //https://stackoverflow.com/questions/15077455/converting-date-format-of-jxdatepicker-to-date-type-of-mysql-for-storing-it-in-d

//            JSpinner timeSpinner = new JSpinner(new SpinnerDateModel());
//            JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm:ss");
//            timeSpinner.setEditor(timeEditor);
//            // will only show the current time
//            timeSpinner.setValue(jSpinner1);
//            String time_to_store;
            
            Assignment assignment=gFactory.getAssignment(uNamePass, taskType, description, date_to_store);
//            GuardAssignment assignment = new GuardAssignment(uNamePass, taskType, description, date_to_store);

            boolean success = pG.addNewGuardTask(assignment);
            if (success) {
                popupMessage.infoBox("A new task has been successfully added to the system", "Information");
            }
            pG.populateGuardsTasksTable(this);
//            this.populateGuardsTable();
        } catch (SQLException ex) {
            Logger.getLogger(FormGuardManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addTaskBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void removeTaskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTaskBtnActionPerformed
        try {
            int i = guardsTaskTable.getSelectedRow();

            TableModel model = guardsTaskTable.getModel();

            String query = "DELETE FROM guardassignment where username ='" + model.getValueAt(i, 0).toString() + "'";
            https://stackoverflow.com/questions/9442027/how-to-delete-a-record-string-java-and-mysql

            pG.executeSQlQuery(query, "Deleted", this);
            pG.populateGuardsTasksTable(this);
        } catch (SQLException ex) {
            Logger.getLogger(FormGuardManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeTaskBtnActionPerformed

    private void guardsTaskTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardsTaskTableMouseClicked

    }//GEN-LAST:event_guardsTaskTableMouseClicked

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
            java.util.logging.Logger.getLogger(FormGuardTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGuardTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGuardTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGuardTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGuardTask().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox aTypeCombo;
    private javax.swing.JButton addTaskBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField descBox;
    protected javax.swing.JTable guardsTaskTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JButton removeTaskBtn;
    // End of variables declaration//GEN-END:variables
}
