/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author abhig
 */
public class ConnectionProvider {
    public static Connection getConnect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","MySQL@2108");
            return connect;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
