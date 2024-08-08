
package Modelo;
import Conexion.ConexionMysql;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Registro {
    ConexionMysql con=new ConexionMysql();
    Connection cn= con.conectar();
    public void registrarbd (Producto p){
         try{
             PreparedStatement ps=cn.prepareStatement
        ("INSERT INTO producto(Seleccion,cantidad)VALUES(?,?)");
             ps.setString(1, p.getSeleccion());
             ps.setInt(2, p.getCantidad());
             ps.executeUpdate();
             
             
         } catch (Exception e){
             JOptionPane.showMessageDialog(null,"ERROR AL REGISTRAR DATOS"+e);
         }
    }
}
