/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author huseyinkaradana
 */
public class db {
    Connection conn = null;
    
    public static Connection java_db() {
        String path="C:\\Users\\huseyinkaradana\\Documents\\NetBeansProjects\\AracKiralama\\src\\Database\\arackiralama.accdb"; 
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url = "jdbc:ucanaccess://"+path;
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
