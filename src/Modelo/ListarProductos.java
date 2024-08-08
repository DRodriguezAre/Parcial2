
package Modelo;
import Conexion.ConexionMysql;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.Connection; 
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarProductos {
    ConexionMysql con=new ConexionMysql(); 
    Connection cn=con.conectar();
    
    public void MostrarTable(JTable tabla){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Seleccion");
        modelo.addColumn("Cantidad");
        String consultasql="SELECT*FROM producto"; 
        Statement st;
        try{
            st=(Statement)cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while(rs.next()){
                Object[] lista={rs.getString(1),rs.getInt(2)};
                modelo.addRow(lista);    
            }
            tabla.setModel(modelo);
        }catch (Exception e){
            System.out.println("ERROR AL LISTAR LOS DATOS"+e);
        } 
        
    }
}
