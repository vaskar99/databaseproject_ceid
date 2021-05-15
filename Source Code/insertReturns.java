/*
 *  Developed by Vasileios Karachountris and Eva Konstantopoulou for Computer Engineering and
 *  Informatics Department, to be used in the Database Laboratory Project that they submit.
 *  All Rights Reserved.
 */
package mainpackage;

import java.lang.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static mainpackage.CheckConnection.url;

/**
 *
 * @author Vasilis
 */
public class insertReturns extends javax.swing.JFrame
{

    /**
     * Creates new form insertReturns
     */
    public insertReturns()
    {
	initComponents();
	FillPageNumCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnsBack = new javax.swing.JButton();
        pageNum = new javax.swing.JComboBox<>();
        newspapperName = new javax.swing.JTextField();
        selectIssue = new javax.swing.JButton();
        issueNum = new javax.swing.JTextField();
        pageCount = new javax.swing.JTextField();
        datePubl = new javax.swing.JTextField();
        salesNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        insertReturn = new javax.swing.JButton();
        newReturns = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        returnsText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();
        okbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        returnsBack.setText("Back");
        returnsBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnsBackActionPerformed(evt);
            }
        });

        pageNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageNumActionPerformed(evt);
            }
        });

        newspapperName.setEditable(false);
        newspapperName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        selectIssue.setText("SELECT ISSUE");
        selectIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectIssueActionPerformed(evt);
            }
        });

        issueNum.setEditable(false);
        issueNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pageCount.setEditable(false);
        pageCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        datePubl.setEditable(false);
        datePubl.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        salesNum.setEditable(false);
        salesNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Newspapper Name");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Issue Number");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Page Count");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Date Published");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sales");

        insertReturn.setText("INSERT RETURNS");
        insertReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertReturnActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Returns");

        returnsText.setEditable(false);
        returnsText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("Please enter your username here:");

        okbutton.setText("OK");
        okbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pageNum, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(insertReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newReturns, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnsBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(newspapperName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(issueNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pageCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(datePubl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(salesNum, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(returnsText))))))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okbutton)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(okbutton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pageNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectIssue)
                            .addComponent(insertReturn)
                            .addComponent(newReturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(newspapperName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(issueNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pageCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePubl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salesNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(returnsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(returnsBack)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FillPageNumCombo()
    {
	try
	{
	    Connection con = DriverManager.getConnection(url);
	    String value0 = UsernameText.getText();
            String sql = "select page_number from page inner join employee on employee.newspaper_name = page.newspaper_name inner join admin_employee on admin_employee.admin_email = employee.employee_email where employee_login = ? ";
	    PreparedStatement pst = con.prepareStatement(sql);
	    pst.setString(1,value0);
            ResultSet rs = pst.executeQuery();
	    while(rs.next())
	    {
		String name = rs.getString("page_number");
		pageNum.addItem(name);			
	    }
	    con.close();
	}
	catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    //Method to conver String value to int.
    public Integer getIntValue( String stringvalue ) 
    {
	return Integer.valueOf(stringvalue);
    }	
    //Method to convert int input value to String.
    public String getStringValue( int stringvalue ) 
    {
	return String.valueOf(stringvalue);
    }	
    //Method to convert String comboBox value to int.    
    public int getSelectedIntValue( JComboBox comboBox )
    {
	return Integer.parseInt((String)comboBox.getSelectedItem());
    }	    
  
    private void returnsBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_returnsBackActionPerformed
    {//GEN-HEADEREND:event_returnsBackActionPerformed
        new admin_employee().setVisible(true); //Go back to the previous window.
	this.dispose(); // Close previous window.
    }//GEN-LAST:event_returnsBackActionPerformed

    private void pageNumActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pageNumActionPerformed
    {//GEN-HEADEREND:event_pageNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pageNumActionPerformed

    private void selectIssueActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_selectIssueActionPerformed
    {//GEN-HEADEREND:event_selectIssueActionPerformed
	try
	{
	    Connection con = DriverManager.getConnection(url);
	    //Get the text from the ComboBox
	    String comboStringValue = pageNum.getSelectedItem().toString();
	    //Get the text from the ComboBox and convert to int.
	    int comboText = getSelectedIntValue(pageNum);
	    //Call the StoredProcedure returnInfoPage from the databas.
	    CallableStatement cs = con.prepareCall("{ call returnInfoPage(?,?,?,?,?,?)}"); //Call the stored procedure returnInfoPage from server
	    //Set the input from the comboBox
	    cs.setInt(1,comboText);
	    //Get the output variables.
	    cs.registerOutParameter(2,Types.VARCHAR);
	    cs.registerOutParameter(3,Types.INTEGER);
	    cs.registerOutParameter(4,Types.DATE);
	    cs.registerOutParameter(5,Types.INTEGER);
	    cs.registerOutParameter(6,Types.INTEGER);
	    cs.executeUpdate();
	    //Pass the results to String and Integer variables.
	    String news_name = cs.getString(2);
	    String date_publ = cs.getString(4);
	    int page_count = cs.getInt(3);
	    int page_sales = cs.getInt(5);
	    int return_num = cs.getInt(6);
	    //Set the text in the uneditable text boxes.
	    newspapperName.setText(news_name);
	    issueNum.setText(comboStringValue);
	    pageCount.setText(getStringValue(page_count));
	    datePubl.setText(date_publ);
	    salesNum.setText(getStringValue(page_sales));
	    returnsText.setText(getStringValue(return_num));
	    /*
	    System.out.println(news_name);
	    System.out.println(date_publ);
	    System.out.println(page_count);
	    System.out.println(page_sales);
	    */
	    con.close();
	}
	catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_selectIssueActionPerformed

    private void insertReturnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_insertReturnActionPerformed
    {//GEN-HEADEREND:event_insertReturnActionPerformed
        try
	{
	    Connection con = DriverManager.getConnection(url);
	    //Retrieve the input values.
	    int returnValue = getIntValue(newReturns.getText());
	    int comboText = getSelectedIntValue(pageNum);
	    //Call the stored procedure.
	    CallableStatement cs = con.prepareCall("{call insertReturns(?,?)}");
	    //Set input values.
	    cs.setInt(1,comboText);
	    cs.setInt(2,returnValue);
	    cs.execute();
	    //Fix text on the view screen.
	    returnsText.setText(getStringValue(returnValue));
	    //Print success message.
	    JOptionPane.showMessageDialog(null,"Successfully updated returns value!");
	    con.close();
	}
	catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_insertReturnActionPerformed

    private void okbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbuttonActionPerformed
        // TODO add your handling code here:
        UsernameText.getText();
        FillPageNumCombo();
    }//GEN-LAST:event_okbuttonActionPerformed

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
	    java.util.logging.Logger.getLogger(insertReturns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex)
	{
	    java.util.logging.Logger.getLogger(insertReturns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex)
	{
	    java.util.logging.Logger.getLogger(insertReturns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex)
	{
	    java.util.logging.Logger.getLogger(insertReturns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable()
	{
	    public void run()
	    {
		new insertReturns().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UsernameText;
    private javax.swing.JTextField datePubl;
    private javax.swing.JButton insertReturn;
    private javax.swing.JTextField issueNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField newReturns;
    private javax.swing.JTextField newspapperName;
    private javax.swing.JButton okbutton;
    private javax.swing.JTextField pageCount;
    private javax.swing.JComboBox<String> pageNum;
    private javax.swing.JButton returnsBack;
    private javax.swing.JTextField returnsText;
    private javax.swing.JTextField salesNum;
    private javax.swing.JButton selectIssue;
    // End of variables declaration//GEN-END:variables
}