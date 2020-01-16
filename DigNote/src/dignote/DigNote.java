/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dignote;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

class Koneksi{
    Connection con;
    public Connection getConnect() throws SQLException{
        String url = "jdbc:mysql://localhost:127.0.0.1/work";
        String user = "root";
        String pass = "";
        try {
            con = DriverManager.getConnection(url, user, pass);
        }   catch(Exception e) {
        }
        return con;
    }
}
/**
 *
 * @author Ade Eki Nurhakim
 */
public class DigNote {
    public static void main(String[] args) throws SQLException {
        new Koneksi().getConnect();
        
    }
    
}
