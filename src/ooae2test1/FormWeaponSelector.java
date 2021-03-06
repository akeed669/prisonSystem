package ooae2test1;

import DecorateWeapon.nightVision;
import DecorateWeapon.AssaultRifle;
import DecorateWeapon.Silencer;
import DecorateWeapon.halfGrip;
import DecorateWeapon.Pistol;
import DecorateWeapon.SMG;
import DecorateWeapon.Weapon;

public class FormWeaponSelector extends javax.swing.JFrame {

    private String selectedWeapon;
    protected String weaponDesc;

    /**
     * Creates new form FormWeaponSelector
     */
    public FormWeaponSelector() {
        initComponents();
        silencerOption.setVisible(false);
        nightVisionOption.setVisible(false);
        halfGripOption.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pistolBtn = new javax.swing.JButton();
        smgBtn = new javax.swing.JButton();
        ARBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        silencerOption = new javax.swing.JCheckBox();
        nightVisionOption = new javax.swing.JCheckBox();
        halfGripOption = new javax.swing.JCheckBox();
        confirmBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pistolBtn.setText("Pistol");
        pistolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pistolBtnActionPerformed(evt);
            }
        });

        smgBtn.setText("Sub-Machine Gun");
        smgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smgBtnActionPerformed(evt);
            }
        });

        ARBtn.setText("Assault Rifle");
        ARBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select A Weapon");

        silencerOption.setText("Equip Silencer");

        nightVisionOption.setText("Equip Night Vision lens");

        halfGripOption.setText("Equip Half Grip");

        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(smgBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pistolBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ARBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(halfGripOption)
                            .addComponent(nightVisionOption)
                            .addComponent(silencerOption)
                            .addComponent(confirmBtn))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(pistolBtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(smgBtn)
                        .addGap(52, 52, 52)
                        .addComponent(ARBtn)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(silencerOption)
                        .addGap(28, 28, 28)
                        .addComponent(nightVisionOption)
                        .addGap(30, 30, 30)
                        .addComponent(halfGripOption)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(confirmBtn)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showSupplements() {
        silencerOption.setVisible(true);
        nightVisionOption.setVisible(true);
        halfGripOption.setVisible(true);
    }

    private void smgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smgBtnActionPerformed

        this.selectedWeapon = "SMG";
        this.showSupplements();

    }//GEN-LAST:event_smgBtnActionPerformed

    private void pistolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistolBtnActionPerformed

        this.selectedWeapon = "Pistol";
        this.showSupplements();

    }//GEN-LAST:event_pistolBtnActionPerformed

    private void ARBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARBtnActionPerformed

        this.selectedWeapon = "AR";
        this.showSupplements();

    }//GEN-LAST:event_ARBtnActionPerformed

    private void addAttachment(Weapon weapon) {
        if (silencerOption.isSelected()) {
            weapon = new Silencer(weapon);
        }
        if (nightVisionOption.isSelected()) {
            weapon = new nightVision(weapon);
        }
        if (halfGripOption.isSelected()) {
            weapon = new halfGrip(weapon);
        }
        this.weaponDesc = weapon.getDescription();
    }
    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed

        switch (this.selectedWeapon) {
            case "Pistol":
                Weapon pistol = new Pistol();
                this.addAttachment(pistol);
                break;

            case "SMG":
                Weapon submachinegun = new SMG();
                this.addAttachment(submachinegun);
                break;

            case "AR":
                Weapon assaultrifle = new AssaultRifle();
                this.addAttachment(assaultrifle);
                break;
        }
        this.dispose();
    }//GEN-LAST:event_confirmBtnActionPerformed

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
//            java.util.logging.Logger.getLogger(FormWeaponSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormWeaponSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormWeaponSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormWeaponSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormWeaponSelector().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ARBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JCheckBox halfGripOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox nightVisionOption;
    private javax.swing.JButton pistolBtn;
    private javax.swing.JCheckBox silencerOption;
    private javax.swing.JButton smgBtn;
    // End of variables declaration//GEN-END:variables
}
