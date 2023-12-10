/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class ConexionBDDS {
    Connection con; 
    public ConexionBDDS()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/clientes","root","");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"No se pudo establecer conexion con la base de datos error:"+ e);
        }
    }
    public Connection getConnection ()
    {
        return con;
    }
}





