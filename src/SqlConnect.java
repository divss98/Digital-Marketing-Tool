import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahe
 */
public class SqlConnect {
    public static Connection ConnDB() {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","divya123");
        return conn;
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    
}
}
