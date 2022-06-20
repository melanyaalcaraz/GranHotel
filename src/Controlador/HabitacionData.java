/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import Modelo.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Anto
 */
public class HabitacionData {

    private Connection con = null;
   // private Conexion conexion;

    public HabitacionData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion.");
        }

    }

    public void agregarHabitacion(Habitacion habitacion) {

        String sql = "INSERT INTO habitacion(idCategoria, nmroHabitacion, piso, refaccion) "
                + "VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habitacion.obtengoIdCategoria());
            ps.setInt(2, habitacion.getNroHabitacion());
            ps.setInt(3, habitacion.getPiso());
            ps.setInt(4, habitacion.isRefaccion() ? 1 : 0);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitacion añadida con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no fue añadida.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo añadir la habitacion.");
        }

    }
    
    public Habitacion modificarHabitacion(int id, Habitacion habitacion) {

        String sql = "UPDATE habitacion SET idCategoria=?, nmroHabitacion =?, piso=?, refaccion=? WHERE idHabitacion=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.obtengoIdCategoria());
            ps.setInt(2, habitacion.getNroHabitacion());
            ps.setInt(3, habitacion.getPiso());
            ps.setBoolean(4, habitacion.isRefaccion());
            ps.setInt(5, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar la habitacion.");
        }
        return habitacion;
    }

    public void eliminarHabitacion(int id) {

        try {
            String sql = "UPDATE habitacion SET refaccion = 1 WHERE idHabitacion = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Se eliminó la habitacion.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la habitacion.");
        }
    }

    public Habitacion buscarHabitacion(int id) {
         Habitacion h1 = new Habitacion();
        
        String sql = "SELECT c.idCategoria, h.nmroHabitacion, h.piso, h.refaccion FROM habitacion h , categoria c "
                + " WHERE h.idCategoria= c.idCategoria and h.idHabitacion =?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
               Conexion con = new Conexion();
                h1.setIdHabitacion(id);
                h1.setNroHabitacion(rs.getInt("nmroHabitacion"));
                h1.setPiso(rs.getInt("piso"));
                h1.setRefaccion(rs.getBoolean("refaccion"));

                Categoria cat= buscarCategoria(rs.getInt("idCategoria"));
                cat.getIdCategoria();
                h1.setCategoria(cat);
                
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una habitacion con ese id.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo buscar la habitacion por problemas de conexion.");
        }
        return h1;
    }

    public Categoria buscarCategoria(int id) {
        Conexion con = new Conexion();
        CategoriaData cd = new CategoriaData(con);
        
        return cd.buscarCategoria(id);
    }

    public List<Habitacion> obtenerHabitacionesXCategoria(int idCat) {
        List<Habitacion> hab = new ArrayList<>();
        Habitacion h1 = new Habitacion();
        String sql = "SELECT idHabitacion, idCategoria, nmroHabitacion, piso FROM habitacion  WHERE idCategoria =? and refaccion=0";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCat);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                h1.setIdHabitacion(rs.getInt("idHabitacion"));
                h1.setNroHabitacion(rs.getInt("nmroHabitacion"));
                h1.setPiso(rs.getInt("piso"));
                
                Categoria cat= buscarCategoria(rs.getInt("idCategoria"));
                cat.setIdCategoria(idCat);
                h1.setCategoria(cat);
                
                hab.add(h1);
                
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener habitaciones.");
        }
        return hab;
    }
     public List<Habitacion> obtenerHabitacionesNOhabilitadas() {
        List<Habitacion> hab = new ArrayList<>();

        String sql = "SELECT idHabitacion, idCategoria, nmroHabitacion, piso FROM habitacion  WHERE refaccion=1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Habitacion h1 = new Habitacion();
                h1.setIdHabitacion(rs.getInt("idHabitacion"));
                h1.setNroHabitacion(rs.getInt("nmroHabitacion"));
                h1.setPiso(rs.getInt("piso"));
                
                Categoria cat= buscarCategoria(rs.getInt("idCategoria"));
                h1.setCategoria(cat);
                
                hab.add(h1);
                
            } 
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener habitaciones.");
        }
        return hab;
    }
     
     public List<Habitacion> obtenerHabitacionesHabilitadas() {
        List<Habitacion> hab = new ArrayList<>();

        String sql = "SELECT idHabitacion, idCategoria, nmroHabitacion, piso FROM habitacion  WHERE refaccion=0";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Habitacion h1 = new Habitacion();
                h1.setIdHabitacion(rs.getInt("idHabitacion"));
                h1.setNroHabitacion(rs.getInt("nmroHabitacion"));
                h1.setPiso(rs.getInt("piso"));
                
                Categoria cat= buscarCategoria(rs.getInt("idCategoria"));
                h1.setCategoria(cat);
                
                hab.add(h1);
                
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener habitaciones.");
        }
        return hab;
    }
     
     public void habilitarHabitacion(int id) {
        String sql = "UPDATE habitacion SET refaccion=1 WHERE idHabitacion=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
           
            ps.setInt(1, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Habitacion habilitada.");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo habilitar la habitacion.");
        }
    }
      public void deshabilitarHabitacion(int id) {

        String sql = "UPDATE habitacion SET refaccion=0 WHERE idHabitacion=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Habitacion en refaccion.");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo habilitar la habitacion.");
        }
        
    }
      
       public List<Habitacion> listarHabitaciones() {

        List<Habitacion> habitaciones = new ArrayList<>();

        try {
            String sql = "SELECT * FROM habitacion WHERE refaccion = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Categoria c = new Categoria();
            
            while (rs.next()) {
                
                c = buscarCategoria(rs.getInt("idCategoria"));
                
                
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setCategoria(c);
                habitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setRefaccion(rs.getBoolean("activo"));
                
                habitaciones.add(habitacion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  "Error interno al armar la lista de habitaciones");
        }
        return habitaciones;
    }
    
    

}
