
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
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jFieldPassword = new javax.swing.JPasswordField();
        JLabelPassword = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jLabelPassIcon = new javax.swing.JLabel();
        jLabelLoginIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 25, 28));

        jPanel2.setBackground(new java.awt.Color(31, 36, 42));
        jPanel2.setPreferredSize(new java.awt.Dimension(920, 690));
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jLabelLogo.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabelLogo.setForeground(new java.awt.Color(169, 224, 49));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_protect_80px.png"))); // NOI18N
        jLabelLogo.setText("SecuriTree ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabelLogo)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabelLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldUsername.setBackground(new java.awt.Color(31, 36, 42));
        jTextFieldUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jTextFieldUsername.setCaretColor(new java.awt.Color(169, 224, 49));
        jTextFieldUsername.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextFieldUsernameMouseMoved(evt);
            }
        });
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jFieldPassword.setBackground(new java.awt.Color(31, 36, 42));
        jFieldPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jFieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        jFieldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jFieldPassword.setCaretColor(new java.awt.Color(169, 224, 49));

        JLabelPassword.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JLabelPassword.setForeground(new java.awt.Color(169, 224, 49));
        JLabelPassword.setText("Password:");

        jLabelUsername.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(169, 224, 49));
        jLabelUsername.setText("Username:");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(169, 224, 49));
        lblTitle.setText("Welcome to SecuriTree!");

        lblInfo.setForeground(new java.awt.Color(169, 224, 49));
        lblInfo.setText("Please enter your login credential to begin.");

        jButtonLogin.setBackground(new java.awt.Color(152, 201, 45));
        jButtonLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(21, 25, 28));
        jButtonLogin.setText("Login");
        jButtonLogin.setBorder(null);
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.setFocusPainted(false);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabelPassIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_lock_26px.png"))); // NOI18N

        jLabelLoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_user_shield_26px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabelLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelPassIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(JLabelPassword)
                    .addComponent(lblInfo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(jFieldPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelUsername, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitle)
                .addGap(64, 64, 64)
                .addComponent(lblInfo)
                .addGap(18, 18, 18)
                .addComponent(jLabelUsername)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldUsername)
                    .addComponent(jLabelLoginIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(JLabelPassword)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFieldPassword)
                    .addComponent(jLabelPassIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String currentDir=System.getProperty("user.dir");
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:derby:"+currentDir+"\\securitreedb","SecuriTree","Password");
            java.sql.Statement stmt=con.createStatement();
            String DBQ="Select * from SecuriTree.registered_users where USERNAME='"+jTextFieldUsername.getText()+"' AND PASSWORD = '"+jFieldPassword.getText()+"'";
            
            ResultSet rs=stmt.executeQuery(DBQ);
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Login Success");
                this.dispose();
                Dashboard d = new Dashboard();
                d.setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(null,"Login Failed Please try again.");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jTextFieldUsernameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsernameMouseMoved

    }//GEN-LAST:event_jTextFieldUsernameMouseMoved

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed

    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelPassword;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JPasswordField jFieldPassword;
    private javax.swing.JLabel jLabelLoginIcon;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPassIcon;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
