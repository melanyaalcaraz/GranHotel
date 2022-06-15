
package Controlador;

import Modelo.Categoria;
import Modelo.Habitacion;
import Modelo.Huesped;
import Modelo.Reserva;
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
public class ReservaData {
    
    private Conexion conexion;
    private Connection con = null;
    
    public ReservaData(Conexion con) {
        try{ 
           this.con = con.getConexion();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error de conexion Reserva");
       }
    }
    
    public void reservar(Reserva reser) {
        String sql = "INSERT INTO `reserva`(`idReserva`, `idHabitacion`, `idHuesped`, `fechaInicio`, `fechaFin`, `precioTotal`, `cantPersonas`, `activo`) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? )";
            try{
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, reser.getIdReserva());
                ps.setInt(2, reser.getHabitacion().getIdHabitacion());
                ps.setInt(3, reser.getHuesped().getIdhuesped());
                ps.setDate(3, Date.valueOf(reser.getFechaInicio()));
                ps.setDate(4, Date.valueOf(reser.getFechaFin()));
                ps.setDouble(5, reser.getPrecioTotal());
                ps.setInt(6, reser.getCantPersonas());
                ps.setInt(4, reser.isActivo() ? 1 : 0);
                
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                
                if(rs.next()){
                    reser.setIdReserva(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Inscripcion agregada con exito.");
                }else{
                    JOptionPane.showMessageDialog(null, "No pudo ser añadido correctamente.");
                }
            }    
            catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error al inscribir alumno.");
            }
    
    }
    
    public Reserva modificarReserva(int idReserva, Reserva reserva){  
        String sql="UPDATE `reserva` SET `idReserva`= ? ,`idHabitacion`= ? ,`idHuesped`= ? ,`fechaInicio`= ? ,`fechaFin`= ? ,`precioTotal`= ? ,`cantPersonas`= ? ,`activo`= ? , WHERE 1";
        PreparedStatement ps=null;
       
        try {
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, reserva.getIdReserva());
            ps.setInt(2, reserva.veoIdHabitacion());
            ps.setInt(3, reserva.veoIdHuesped());
            ps.setDate(4, Date.valueOf(reserva.getFechaInicio()));
            ps.setDate(5, Date.valueOf(reserva.getFechaFin()));
            ps.setDouble(6, reserva.getPrecioTotal());
            ps.setInt(7, reserva.getCantPersonas());
            
            int hecho = ps.executeUpdate();
    
            reserva.setIdReserva(idReserva);
            if(hecho==1)
             JOptionPane.showMessageDialog(null, "La reserva fue modificada con exito");
            else
                JOptionPane.showMessageDialog(null, "La reserva no pudo ser modificada, no se encuentra activa");
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error interno, la reserva no pudo ser efectuada");
        }
       return(reserva);
    }
     
    public void anularReserva(int idHuesped,int idHabitacion){
    
        try {    
            String sql = "DELETE FROM reserva WHERE idHuesped =? and idHabitacion =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idHuesped);
            ps.setInt(2, idHabitacion);
               
            ps.executeUpdate();
             
            ps.close();
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar.");
        }
    }
    
    public List<Reserva> obtenerHabitacionesOcupadas(){
        List<Reserva> reservas = new ArrayList<>();
          
        try {
            String sql = "SELECT * FROM reserva;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Reserva reser;
            
            while(rs.next()){
                reser = new Reserva();
                reser.setIdReserva(rs.getInt("id"));
                
                Huesped hu = buscarHuesped(rs.getInt("idHuesped"));
                reser.modificoIdHuesped(hu.getIdhuesped());
                
                Habitacion hab = buscarHabitacion(rs.getInt("idMateria"));
                reser.modificoIdHabitacion(hab.getIdHabitacion());
                reser.setPrecioTotal(rs.getInt("precio"));

                reservas.add(reser);
            }      
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Error al obtener Habitaciones Ocupadas.");
        }
        return reservas;
    }
     
    public List<Habitacion> obtenerHabitacionesLibres(){
        List<Habitacion> habitaciones = new ArrayList<>();
          
        try {
            String sql = "SELECT * FROM habitacion WHERE refaccion=0 and idHabitacion not in"
                    + " (SELECT idHabitacion FROM reserva)";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Habitacion hab;
            
            while(rs.next()){
                hab = new Habitacion();
                hab.setIdHabitacion(rs.getInt("idHabitacion"));
                hab.setNroHabitacion(rs.getInt("nmroHabitacion"));
                hab.setPiso(rs.getInt("piso"));
                hab.setRefaccion(rs.getBoolean("refaccion"));
                
                Categoria cat= buscarCategoria(rs.getInt("idCategoria"));
                //cat.setIdCategoria(idCat);
                hab.setCategoria(cat);
                
                habitaciones.add(hab);
            }      
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener habitaciones sin reserva.");
        }
        
        return habitaciones;  
    }
     
    public List<Reserva> obtenerReservaPorHabitacion(int idHab){
        List<Reserva> reserva = new ArrayList<>();
    
        try {
            String sql = "SELECT * FROM habitacion h , reserva r  WHERE h.estado = 1 and h.refaccion=0 and h.idHabitacion in"
                    + " (SELECT r.idHabitacion FROM reserva where r.idHabitacion=?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHab);
            ResultSet rs = ps.executeQuery();
            Habitacion hab;
            
            while(rs.next()){
                
                Reserva reser = new Reserva();
                reser.setIdReserva(rs.getInt("idReserva"));
                
                Habitacion hab1 = buscarHabitacion(rs.getInt("idHabitacion"));
                reser.modificoIdHabitacion(hab1.getIdHabitacion());
                reserva.add(reser);
                
                reserva.add(reser);
            }      
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener habitaciones sin reserva.");
        }
        
        return reserva;  
    }
    
    public List<Reserva> obtenerReservaPorHuesped(int idHues){
        List<Reserva> reserva = new ArrayList<>();
    
          
        try {
            String sql = "SELECT * FROM huesped h,reserva r  WHERE h.activo = 1 and h.idHuesped in (SELECT r.idHuesped FROM reserva where r.idHuesped=?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHues);
            ResultSet rs = ps.executeQuery();
            
            
            while(rs.next()){
                Reserva reser = new Reserva();
                reser.setIdReserva(rs.getInt("idReserva"));
                
                Huesped hues = buscarHuesped(rs.getInt("idHuesped"));
                reser.modificoIdHuesped(hues.getIdhuesped());
                 reserva.add(reser);
            }      
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener reservas.");
        }
        return reserva;  
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
    
    public List<Huesped> obtenerHuespedsPorHabitacion(int idHabitacion){
        List<Huesped> huespedHabitacion = new ArrayList<>();  

        try {
            String sql = "SELECT idHuesped,nombre,apellido,activo "
                    + "FROM reserva r,huesped hu WHERE r.idHuesped = hu.idHuesped AND idHabitacion = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idHabitacion);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                Huesped hues = new Huesped();
                hues.setIdhuesped(rs.getInt("idHuesped"));
                hues.setNombre(rs.getString("nombre"));
                hues.setApellido(rs.getString("apellido"));
                hues.setActivo(true);
                
                huespedHabitacion.add(hues);
     
            }      
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener habitaciones.");
        }
        return huespedHabitacion;
    }
     
     public Huesped buscarHuesped(int id){
        HuespedData ad = new HuespedData(conexion);
        return ad.buscarHuesped(id);
    }
    
    public Habitacion buscarHabitacion(int id){
        HabitacionData hd = new HabitacionData(conexion);
        return hd.buscarHabitacion(id);
    }
    public Categoria buscarCategoria(int id) {
        CategoriaData cd = new CategoriaData(conexion);
        return cd.buscarCategoria(id);
        
    }
}