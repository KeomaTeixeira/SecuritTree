/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keoma
 */
public class Manage extends javax.swing.JFrame {

    /**
     * Creates new form Manage
     */
    public Manage() {
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

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        jButtonLockDoor = new javax.swing.JButton();
        jButtonUnlockDoor = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jLabelLogout = new javax.swing.JLabel();
        jLabelDoor = new javax.swing.JLabel();
        jLabelHierarchy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 25, 28));
        jPanel1.setPreferredSize(new java.awt.Dimension(881, 632));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(169, 224, 49));
        lblTitle.setText("SECURITREE - Security Dashboard");

        lblInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(169, 224, 49));
        lblInfo.setText("Manage Doors");

        jButtonLockDoor.setBackground(new java.awt.Color(152, 201, 45));
        jButtonLockDoor.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonLockDoor.setForeground(new java.awt.Color(21, 25, 28));
        jButtonLockDoor.setText("Lock Door");
        jButtonLockDoor.setBorder(null);
        jButtonLockDoor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLockDoor.setFocusPainted(false);
        jButtonLockDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLockDoorActionPerformed(evt);
            }
        });

        jButtonUnlockDoor.setBackground(new java.awt.Color(152, 201, 45));
        jButtonUnlockDoor.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonUnlockDoor.setForeground(new java.awt.Color(21, 25, 28));
        jButtonUnlockDoor.setText("Unlock Door");
        jButtonUnlockDoor.setBorder(null);
        jButtonUnlockDoor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUnlockDoor.setFocusPainted(false);
        jButtonUnlockDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnlockDoorActionPerformed(evt);
            }
        });

        jButtonLogout.setBackground(new java.awt.Color(152, 201, 45));
        jButtonLogout.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonLogout.setForeground(new java.awt.Color(21, 25, 28));
        jButtonLogout.setText("Back");
        jButtonLogout.setBorder(null);
        jButtonLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogout.setFocusPainted(false);
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jLabelLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_back_96px.png"))); // NOI18N

        jLabelDoor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_padlock_96px.png"))); // NOI18N

        jLabelHierarchy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_lock_96px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblInfo)
                        .addGap(388, 388, 388))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLockDoor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabelHierarchy)
                        .addGap(84, 84, 84)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDoor)
                        .addGap(82, 82, 82))
                    .addComponent(jButtonUnlockDoor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(35, 35, 35)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHierarchy)
                    .addComponent(jLabelDoor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLockDoor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUnlockDoor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122)
                .addComponent(jLabelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUnlockDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnlockDoorActionPerformed
        this.dispose();
        UnlockDoor U = new UnlockDoor();
        U.setVisible(true);
    }//GEN-LAST:event_jButtonUnlockDoorActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        this.dispose();
        Dashboard D = new Dashboard();
        D.setVisible(true);
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonLockDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLockDoorActionPerformed
        this.dispose();
        LockDoor L = new LockDoor();
        L.setVisible(true);
    }//GEN-LAST:event_jButtonLockDoorActionPerformed

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
            java.util.logging.Logger.getLogger(Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLockDoor;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonUnlockDoor;
    private javax.swing.JLabel jLabelDoor;
    private javax.swing.JLabel jLabelHierarchy;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
