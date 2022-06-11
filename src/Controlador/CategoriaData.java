
package Controlador;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author La Bestia
 */
public class CategoriaData {
    
    private Conexion conexion;
    private Connection con=null;

    public CategoriaData(Conexion con) {
        try{ 
           this.con = con.getConexion();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error de conexion");
       }
    }
    
    public Categoria buscarCategoria(int id){
        String sql = "SELECT * FROM categoria  WHERE idCategoria =?";
        PreparedStatement ps = null;
        Categoria cat = new Categoria();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
             
            if (rs.next()) {
               
                cat.setIdCategoria(rs.getInt("IdCategoria"));
                cat.setCantCamas(rs.getInt("cantCamas"));
                cat.setCantPersonas(rs.getInt("cantPersonas"));
                cat.setTipoCama((char) rs.getInt("tipoCamas"));
                cat.setTipoHabitacion(rs.getInt("tipoHabitacion"));
                
                
                JOptionPane.showMessageDialog(null, "Categoria encontrada.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe una categoria con ese id.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo buscar la categoria por problemas de conexion.");
        }
        return cat;
    }

    public void actualizarPrecio(int idHuesped,int idHabitacion, double precio){
        try {
            String sql = "UPDATE reserva SET precio = ? WHERE idHuesped =? and idHabitacion =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, idHuesped);
            ps.setInt(2, idHabitacion);
            ps.setDouble(3, precio);
            
            ps.executeUpdate(); 
            
            ps.close();
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar precio.");
        }
    }
    
}


