
package Controlador;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.Date;
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
    
    public void añadirCategoria (Categoria categoria){
        String sql = "INSERT INTO `categoria`(`idCategoria`, `cantPersonas`, `cantCamas`, `tipoCamas`, `tipoHabitacion`, `precio`, `activo`) VALUES (' ? , ? , ? , ? , ? , ? , ? ')";
            try{
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, categoria.getIdCategoria());
                ps.setInt(2, categoria.getCantPersonas());
                ps.setInt(3, categoria.getCantCamas());
                ps.setInt(4, categoria.getTipoCama());
                ps.setString(5, categoria.getTipoHabitacion());
                ps.setDouble(6, categoria.getPrecio());
                ps.setInt(7, categoria.isActivo() ? 1 : 0);
                
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                
                if(rs.next()){
                    categoria.setIdCategoria(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Categoria agregada con exito.");
                }else{
                    JOptionPane.showMessageDialog(null, "No pudo ser añadido correctamente.");
                }
            }    
            catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error de comunicacion CategoriaData.");
            }
    
    }
    
    public Categoria modificarCategoria(Categoria categoria){
         String sql="UPDATE `categoria` SET `idCategoria`= ? ,`cantPersonas`= ? ,`cantCamas`= ? ,`tipoCamas`= ? ,`tipoHabitacion`= ? ,`precio`= ? ,`activo`= ? WHERE 1";
        PreparedStatement ps=null;
       
        try {
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, categoria.getIdCategoria());
            ps.setInt(2, categoria.getCantPersonas());
            ps.setInt(3, categoria.getCantCamas());
            ps.setInt(4, categoria.getTipoCama());
            ps.setString(5, categoria.getTipoHabitacion());
            ps.setDouble(6, categoria.getPrecio());
            ps.setBoolean(7, categoria.isActivo());
            
            int hecho = ps.executeUpdate();
    
            categoria.setIdCategoria(categoria.getIdCategoria());
            if(hecho==1)
             JOptionPane.showMessageDialog(null, "La categoria fue modificada con exito");
            else
                JOptionPane.showMessageDialog(null, "La categoria no pudo ser modificada, no se encuentra activa");
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion Categoria Data");
        }
       return(categoria);
    }
    
    public Categoria buscarCategoria(int id){
        String sql = "SELECT * FROM categoria  WHERE idCategoria =?";
        PreparedStatement ps = null;
        Categoria categoria = new Categoria();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
             
            if (rs.next()) {
               
                categoria.setIdCategoria(rs.getInt("IdCategoria"));
                categoria.setCantCamas(rs.getInt("cantCamas"));
                categoria.setCantPersonas(rs.getInt("cantPersonas"));
                categoria.setTipoCama(rs.getInt("tipoCamas"));
                categoria.setTipoHabitacion(rs.getString("tipoHabitacion"));
                
                
                JOptionPane.showMessageDialog(null, "Categoria encontrada.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe una categoria con ese id.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo buscar la categoria por problemas de conexion.");
        }
        return categoria;
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


