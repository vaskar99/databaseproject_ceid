/*
 *  Developed by Vasileios Karachountris and Eva Konstantopoulou for Computer Engineering and
 *  Informatics Department, to be used in the Database Laboratory Project that they submit.
 *  All Rights Reserved.
 */
package mainpackage;
import javax.swing.*;

public class CheckConnection 
{

    public static String url="jdbc:sqlserver://DESKTOP-MF2TMKM:1433;databaseName=dlab1;user=admin1;password=EvaeisaiGTP*;encrypt=true;trustServerCertificate=true;loginTimeout=30;";
    // Connect to your database.
    // Replace server name, username, and password with your credentials

    
    public CheckConnection()
    {
	try
	{
	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");       
	    
	}
	catch(Exception e) 
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }    
    
    
    
}
