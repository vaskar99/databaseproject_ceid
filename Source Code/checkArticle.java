/*
 *  Developed by Vasileios Karachountris and Eva Konstantopoulou for Computer Engineering and
 *  Informatics Department, to be used in the Database Laboratory Project that they submit.
 *  All Rights Reserved.
 */
package mainpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static mainpackage.CheckConnection.url;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Vasilis
 */
public class checkArticle extends javax.swing.JFrame
{

    /**
     * Creates new form checkArticle
     */
    public checkArticle()
    {
	initComponents();
        FillTable();
    }
private void FillTable()
    {
	try
	{
	    Connection con = DriverManager.getConnection(url);
            String value = UsernameText.getText();
            System.out.println(value);
	    String sql ="SELECT article_path, title, pages, status, summary, key_word, chief_editor_email, category_id, page_number, approve_date, editor_email, page_start FROM article INNER JOIN employee ON article.editor_email = employee.employee_email WHERE employee_login= ? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,value);
	    ResultSet rs = pst.executeQuery();
	    //Fill JTable with the info from the database.
	    ArticleTable.setModel(DbUtils.resultSetToTableModel(rs));
	    
	    //DefaultTableModel tableModel = new DefaultTableModel(data, columns);
	    //ArticleTable.setModel(tableModel);
	    
	    
	}
	catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,e);
        }
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

        jLabel1 = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ArticleTable = new javax.swing.JTable();
        FillButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Please enter your username:");

        ArticleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "Path", "Title", "Pages", "Status", "Summary", "KeyWord", "Chief Editor Email", "Category id", "Page Number", "Approve Date", "Editor Email", "Starting page"
            }
        ));
        jScrollPane1.setViewportView(ArticleTable);

        FillButton.setText("Fill");
        FillButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                FillButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("All the information about your articles and their progress:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(FillButton))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillButton))
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillButtonActionPerformed
        // TODO add your handling code here:
        FillTable();
    }//GEN-LAST:event_FillButtonActionPerformed

    
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
	try
	{
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
	    {
		if ("Nimbus".equals(info.getName()))
		{
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex)
	{
	    java.util.logging.Logger.getLogger(checkArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex)
	{
	    java.util.logging.Logger.getLogger(checkArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex)
	{
	    java.util.logging.Logger.getLogger(checkArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex)
	{
	    java.util.logging.Logger.getLogger(checkArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable()
	{
	    public void run()
	    {
		new checkArticle().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ArticleTable;
    private javax.swing.JButton FillButton;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}