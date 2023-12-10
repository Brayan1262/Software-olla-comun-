
package DAO;
import conexion.ConexionBDDS;
import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.Administrador1;
public class Registrarcliente extends ConexionBDDS{
    //==========MÉTODO REGISTRAR CLIENTE 
    public boolean Registrar(Cliente cli,Administrador1 ad){
        PreparedStatement ps = null;
        Connection con = getConnection();
        String sql = "insert into Clientes (Nombre,Apellido,DNI,Montopago,Precio,Vuelto) values (?,?,?,?,?,?);";
        try {
            ps= con.prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setInt(3, cli.getDNI());
            ps.setDouble(4, cli.getMontopago());
            ps.setDouble(5, ad.getPrecio());
            ps.setDouble(6, ad.getVuelto());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
            }
    }
}
