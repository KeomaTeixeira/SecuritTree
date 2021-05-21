
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keoma
 */
public class LockDoor extends javax.swing.JFrame {

    /**
     * Creates new form LockDoor
     */
    public LockDoor() {
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
        jLabelDoorId = new javax.swing.JLabel();
        jTextFieldDoorId = new javax.swing.JTextField();
        jLabelDoorLock = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 25, 28));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(169, 224, 49));
        lblTitle.setText("SECURITREE - Security Dashboard");

        lblInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(169, 224, 49));
        lblInfo.setText("Lock Door");

        jLabelDoorId.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelDoorId.setForeground(new java.awt.Color(169, 224, 49));
        jLabelDoorId.setText("Door ID:");

        jTextFieldDoorId.setBackground(new java.awt.Color(31, 36, 42));
        jTextFieldDoorId.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextFieldDoorId.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldDoorId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jTextFieldDoorId.setCaretColor(new java.awt.Color(169, 224, 49));
        jTextFieldDoorId.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextFieldDoorIdMouseMoved(evt);
            }
        });
        jTextFieldDoorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDoorIdActionPerformed(evt);
            }
        });

        jLabelDoorLock.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelDoorLock.setForeground(new java.awt.Color(169, 224, 49));
        jLabelDoorLock.setText("Please Enter the ID of the door to lock.");

        jLabelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_back_96px.png"))); // NOI18N

        jButtonBack.setBackground(new java.awt.Color(152, 201, 45));
        jButtonBack.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(21, 25, 28));
        jButtonBack.setText("Back");
        jButtonBack.setBorder(null);
        jButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBack.setFocusPainted(false);
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonSubmit.setBackground(new java.awt.Color(152, 201, 45));
        jButtonSubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonSubmit.setForeground(new java.awt.Color(21, 25, 28));
        jButtonSubmit.setText("Lock Door");
        jButtonSubmit.setBorder(null);
        jButtonSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSubmit.setFocusPainted(false);
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(229, 229, 229))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelBack, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(lblInfo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabelDoorId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDoorId, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(293, Short.MAX_VALUE)
                    .addComponent(jLabelDoorLock)
                    .addGap(283, 283, 283)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblInfo)
                .addGap(161, 161, 161)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDoorId, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabelDoorId))
                .addGap(18, 18, 18)
                .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jLabelBack, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(217, 217, 217)
                    .addComponent(jLabelDoorLock)
                    .addContainerGap(397, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDoorIdMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldDoorIdMouseMoved

    }//GEN-LAST:event_jTextFieldDoorIdMouseMoved

    private void jTextFieldDoorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDoorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDoorIdActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.dispose();
        Manage M = new Manage();
        M.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        String currentDir=System.getProperty("user.dir");
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            java.sql.Statement stmt=con.createStatement();
            String DBQ = "UPDATE system_data SET doors_status = 'closed'  WHERE doors_id = '"+jTextFieldDoorId.getText()+"'";
            int rs=stmt.executeUpdate(DBQ);
            
        int i = stmt.executeUpdate(DBQ);
        if (i > 0) {
            JOptionPane.showMessageDialog(null,"Door Locked!");
            jTextFieldDoorId.setText("");
        } else {
            JOptionPane.showMessageDialog(null,"Error Please Enter Correct Door ID!");
        }


        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(LockDoor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LockDoor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LockDoor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LockDoor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LockDoor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelDoorId;
    private javax.swing.JLabel jLabelDoorLock;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDoorId;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}