/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signup_form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author DBSS075
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Connection con= null;
    ResultSet rs = null;
    PreparedStatement pst = null;
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

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        admin_username = new javax.swing.JTextField();
        admin_password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        login = new javax.swing.JPanel();
        login_admin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        member_username = new javax.swing.JTextField();
        member_password = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        login2 = new javax.swing.JPanel();
        login_member = new javax.swing.JLabel();
        signup_member = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(97, 212, 195));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\DBSS075\\Downloads\\sign (2).png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 72)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" E-Pharmacy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        admin_username.setBackground(new java.awt.Color(36, 47, 65));
        admin_username.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        admin_username.setForeground(new java.awt.Color(255, 255, 255));
        admin_username.setText("Enter Username");
        admin_username.setBorder(null);
        admin_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                admin_usernameFocusGained(evt);
            }
        });
        admin_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_usernameMouseClicked(evt);
            }
        });
        admin_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(admin_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 350, -1));

        admin_password.setBackground(new java.awt.Color(36, 47, 65));
        admin_password.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        admin_password.setForeground(new java.awt.Color(255, 255, 255));
        admin_password.setText("***********");
        admin_password.setBorder(null);
        admin_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                admin_passwordFocusGained(evt);
            }
        });
        admin_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_passwordMouseClicked(evt);
            }
        });
        admin_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(admin_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 350, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 350, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 350, 10));

        login.setBackground(new java.awt.Color(97, 212, 195));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_admin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        login_admin.setForeground(new java.awt.Color(51, 51, 51));
        login_admin.setText("Login");
        login_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_adminMouseClicked(evt);
            }
        });
        login.add(login_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 30));

        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 100, 50));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 120, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("ADMIN LOGIN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jPanel3.setBackground(new java.awt.Color(36, 47, 65));
        jPanel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Username");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        member_username.setBackground(new java.awt.Color(36, 47, 65));
        member_username.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        member_username.setForeground(new java.awt.Color(255, 255, 255));
        member_username.setText("Enter Username");
        member_username.setBorder(null);
        member_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member_usernameMouseClicked(evt);
            }
        });
        member_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_usernameActionPerformed(evt);
            }
        });
        jPanel3.add(member_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 350, -1));

        member_password.setBackground(new java.awt.Color(36, 47, 65));
        member_password.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        member_password.setForeground(new java.awt.Color(255, 255, 255));
        member_password.setText("***********");
        member_password.setBorder(null);
        member_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member_passwordMouseClicked(evt);
            }
        });
        member_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_passwordActionPerformed(evt);
            }
        });
        jPanel3.add(member_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 350, 30));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 350, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 350, 10));

        login2.setBackground(new java.awt.Color(97, 212, 195));
        login2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login2MouseClicked(evt);
            }
        });
        login2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_member.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        login_member.setForeground(new java.awt.Color(51, 51, 51));
        login_member.setText("Login");
        login_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_memberMouseClicked(evt);
            }
        });
        login2.add(login_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 30));

        jPanel3.add(login2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 100, 50));

        signup_member.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        signup_member.setForeground(new java.awt.Color(204, 204, 204));
        signup_member.setText("Not A Member? Sign Up");
        signup_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_memberMouseClicked(evt);
            }
        });
        jPanel3.add(signup_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 310, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("MEMBER LOGIN");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 390, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Password");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 500, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admin_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_usernameActionPerformed

    private void admin_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_passwordActionPerformed

    private void member_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_member_usernameActionPerformed

    private void member_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_member_passwordActionPerformed

    private void admin_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_usernameMouseClicked
        // TODO add your handling code here:
        admin_username.setText("");
    }//GEN-LAST:event_admin_usernameMouseClicked

    private void admin_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_admin_passwordFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_admin_passwordFocusGained

    private void admin_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_admin_usernameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_usernameFocusGained

    private void admin_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_passwordMouseClicked
        // TODO add your handling code here:
        admin_password.setText("");
    }//GEN-LAST:event_admin_passwordMouseClicked

    private void member_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_usernameMouseClicked
        // TODO add your handling code here:
        member_username.setText("");
    }//GEN-LAST:event_member_usernameMouseClicked

    private void member_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_passwordMouseClicked
        // TODO add your handling code here:
        member_password.setText("");
    }//GEN-LAST:event_member_passwordMouseClicked

    private void login_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_adminMouseClicked
        // TODO add your handling code here:
        String a = admin_username.getText();
        String b = admin_password.getText();
        Home hh = new Home();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=signup;user=sa;password=1sampai10";
            con = DriverManager.getConnection(url);
            String sql = "select * from login where User_Name = ? and User_Password = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, admin_username.getText());
            pst.setString(2, admin_password.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Username and Password Matched");
                this.dispose();
                hh.show();
            }else if(a.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter Username");
                
            }else if(b.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter Password");
                
            }else{
                JOptionPane.showMessageDialog(null, "Username or Password Incorect");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_login_adminMouseClicked

    private void signup_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_memberMouseClicked
        // TODO add your handling code here:Signup ss = new Signup();
        Signup ss = new Signup();
        try {
            this.dispose();
            ss.show();
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_signup_memberMouseClicked

    private void login2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login2MouseClicked
        // TODO add your handling code here:
        String a = member_username.getText();
        String b = member_password.getText();
        Home hh = new Home();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=signup;user=sa;password=1sampai10";
            con = DriverManager.getConnection(url);
            String sql = "select * from login_user where User_Name = ? and User_Password = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, member_username.getText());
            pst.setString(2, member_password.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Username and Password Matched");
                this.dispose();
                hh.show();
            }else if(a.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter Username");
                
            }else if(b.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter Password");
                
            }else{
                JOptionPane.showMessageDialog(null, "Username or Password Incorect");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_login2MouseClicked

    private void login_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_memberMouseClicked
        // TODO add your handling code here:
        String a = member_username.getText();
        String b = member_password.getText();
        Home_Member hh = new Home_Member();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=signup;user=sa;password=1sampai10";
            con = DriverManager.getConnection(url);
            String sql = "select * from login_user where User_User_Name = ? and User_User_Password = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, member_username.getText());
            pst.setString(2, member_password.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Username and Password Matched");
                this.dispose();
                hh.show();
            }else if(a.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter Username");
                
            }else if(b.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter Password");
                
            }else{
                JOptionPane.showMessageDialog(null, "Username or Password Incorect");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_login_memberMouseClicked

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
    private javax.swing.JPasswordField admin_password;
    private javax.swing.JTextField admin_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel login;
    private javax.swing.JPanel login2;
    private javax.swing.JLabel login_admin;
    private javax.swing.JLabel login_member;
    private javax.swing.JPasswordField member_password;
    private javax.swing.JTextField member_username;
    private javax.swing.JLabel signup_member;
    // End of variables declaration//GEN-END:variables
}