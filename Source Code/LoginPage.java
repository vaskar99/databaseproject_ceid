/*
 *  Developed by Vasileios Karachountris Foteini Kotsimpou and Eva Konstantopoulou for Computer Engineering and
 *  Informatics Department, to be used in the Database Laboratory Project that they submit.
 *  All Rights Reserved.
 */
package mainpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static mainpackage.CheckConnection.url;

//import com.microsoft.sqlserver.jdbc.SQLServerDriver;

/**
 *
 * @author Vasilis
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        login = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginActionPerformed(evt);
            }
        });

        username.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                usernameActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password)
                            .addComponent(username)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(reset))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        //Compare username+pass from database to login
        try
        {  
            Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM employee WHERE employee_login=? AND employee_pass=?";
	    String sql1 = "SELECT employee_email FROM admin_employee INNER JOIN employee ON admin_employee.admin_email = employee.employee_email WHERE employee_login=?";
	    String sql2 = "SELECT employee_email FROM chief_editor INNER JOIN employee ON chief_editor.chief_editor_email = employee.employee_email WHERE employee_login=?";
	    String sql3 = "SELECT employee_email FROM journalist INNER JOIN employee ON journalist.journalist_email = employee.employee_email WHERE employee_login=?";
	    String sql4 = "SELECT employee_email FROM publisher INNER JOIN employee ON publisher.publisher_email = employee.employee_email WHERE employee_login=?";
	      
            PreparedStatement pst = con.prepareStatement(sql);	    
	    PreparedStatement pst1 = con.prepareStatement(sql1);
	    PreparedStatement pst2 = con.prepareStatement(sql2);
	    PreparedStatement pst3 = con.prepareStatement(sql3);
	    PreparedStatement pst4 = con.prepareStatement(sql4);
	    pst.setString(1, username.getText());
            pst.setString(2, password.getText());
	    pst1.setString(1, username.getText());
	    pst2.setString(1, username.getText());
	    pst3.setString(1, username.getText());
	    pst4.setString(1, username.getText());
	    String username1 = username.getText();
	    ResultSet rs = pst.executeQuery();
	    ResultSet rs1 = pst1.executeQuery();
	    ResultSet rs2 = pst2.executeQuery();
	    ResultSet rs3 = pst3.executeQuery();
	    ResultSet rs4 = pst4.executeQuery();
	    if(rs.next())
            {
		JOptionPane.showMessageDialog(null, "Username and Password Matched");
		if(rs3.next())
		{
		    new Journalist().setVisible(true);
		    this.dispose();//to close the current jframe
		}
		else if(rs1.next())
		{
		    new admin_employee().setVisible(true);
		    this.dispose();
		}
		else if(rs4.next())
		{
		    new publisher().setVisible(true);
		    this.dispose();
                }
		else if(rs2.next())
		{
		    new chief_editor().setVisible(true);
		    this.dispose();
                }
		
		
                /*btnlogin.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent e)
		    {
			this.dispose();
			new FrmMain().setVisible(true); // Main Form to show after the Login Form..
		    }
                });*/
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Username and Password NOT Correct");
               username.setText("");
               password.setText("");
            }
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_loginActionPerformed
    
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        //Reseting the values
        username.setText("");
        password.setText("");        
    }//GEN-LAST:event_resetActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new LoginPage().setVisible(true);
            }
        });
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton reset;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
