/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Brayan
 */
public class conexionBDDS {
    
    private Connection conectar;
    
    public conexionBDDS(){
        String host = "localhost";
        String puerto = "3306"; 
        String base = "ollacomun";
        String usuario = "root";
        String password = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        String databaseUrl = "jdbc:mysql://"+host+":"+puerto+"/"+base+"?useSSL=false";

        try{
            Class.forName(driver);
        conectar = DriverManager.getConnection(databaseUrl,usuario,password);
        System.out.println("Base de datos conectada");
        }catch(Exception ex){
    
        }   
    }
    public Connection getConexionBDDS(){
        return conectar;
    }
}

