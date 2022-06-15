
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


    
public class Conexion {
  
    private String url="jdbc:mysql://localhost/hotelgrande";
    private String usuario="root";
    private String password="";

    private Connection conexion;
    //Metodo constructor
    public Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Error de conexion.");
        }
        
    }
    //Metodo constructor 
    public Conexion(String url, String usuario, String password) throws ClassNotFoundException {
        this.url = url;
        this.usuario = usuario;
        this.password = password;

        //Cargamos las clases de mariadb que implementan JDBC
        Class.forName("org.mariadb.jdbc.Driver");

    }
    
    public Connection getConexion() {
        if(conexion == null){
            try {
                // Setup the connection with the DB
                conexion = DriverManager
                        .getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                                + "&user=" + usuario + "&password=" + password);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion."); ;
            }
        }
        return conexion;
    }
    
}