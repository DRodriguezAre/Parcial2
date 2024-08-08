package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class ConexionMysql {
    Connection cn;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Parcial2","root",""); 
            System.out.println("Conexion exitosa");
        } catch (Exception e ) {
            System.out.println("Error de conexion"+e);
        }
        return cn; 
    }
}
