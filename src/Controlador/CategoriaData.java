
package Controlador;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
        String sql = "INSERT INTO categoria(idCategoria, cantPersonas, cantCamas, tipoCamas, tipoHabitacion, precio, activo) VALUES (?,?,?,?,?,?,?)";
            try{
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, categoria.getIdCategoria());
                ps.setInt(2, categoria.getCantPersonas());
                ps.setInt(3, categoria.getCantCamas());
                ps.setString(4, categoria.getTipoCama());
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
    
    public Categoria modificarCategoria(int idCategoria, Categoria categoria){
         String sql="UPDATE categoria SET cantPersonas= ? ,cantCamas= ? ,tipoCamas= ? ,tipoHabitacion= ? ,precio= ? ,activo= ? WHERE idCategoria = ? ";
        PreparedStatement ps=null;
       
        try {
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, categoria.getCantPersonas());
            ps.setInt(2, categoria.getCantCamas());
            ps.setString(3, categoria.getTipoCama());
            ps.setString(4, categoria.getTipoHabitacion());
            ps.setDouble(5, categoria.getPrecio());
            ps.setBoolean(6, categoria.isActivo());
            
            ps.setInt(7, idCategoria);
            
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
    
    public void eliminarCategoria(int id){
        try {
            String sql = "UPDATE `categoria` SET `idCategoria`= ? WHERE`activo`= 0";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se eliminó la categoria.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo eliminar la categoria.");
        }
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
               
                categoria.setIdCategoria(id);
                categoria.setCantCamas(rs.getInt("cantCamas"));
                categoria.setCantPersonas(rs.getInt("cantPersonas"));
                categoria.setTipoCama(rs.getString("tipoCamas"));
                categoria.setTipoHabitacion(rs.getString("tipoHabitacion"));
                categoria.setPrecio(rs.getDouble("precio"));
                categoria.setActivo(rs.getBoolean("activo"));
                
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
    
    public List<Categoria> listarCategorias() {

        List<Categoria> categorias = new ArrayList<>();

        try {
            String sql = "SELECT * FROM categoria WHERE activo = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Categoria cat= new Categoria();
                cat.setIdCategoria(rs.getInt("idCategoria"));
                cat.setCantPersonas(rs.getInt("cantPersonas"));
                cat.setCantCamas(rs.getInt("cantCamas"));
                cat.setTipoCama(rs.getString("tipoCama"));
                cat.setTipoHabitacion(rs.getString("tipoHabitacion"));
                cat.setPrecio(rs.getDouble("precio"));
                cat.setActivo(rs.getBoolean("activo"));
                
                categorias.add(cat);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  "Error interno al armar la lista de huespedes");
        }
        return categorias;
    }
    
}


