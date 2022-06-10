/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Huesped;
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
 * @author Martin
 */
public class HuespedData {
  
    Connection con=null;

    public HuespedData(Conexion con) {
       try{ this.con = con.getConexion();
       }catch(Exception e)
       { JOptionPane.showMessageDialog(null, "Error de conexion");
       }
    }
    
    public void guardarHuesped(Huesped huesped)  
    { String str="INSERT INTO huesped( nombre, apellido, dni, domicilio, correo, celular, activo) VALUES (?,?,?,?,?,?,?)";
      
        try {
            PreparedStatement ps= con.prepareStatement(str, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setString(6, huesped.getTelefono());
            ps.setBoolean(7, huesped.isActivo());
            
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            
            if(rs.next())
            { huesped.setIdhuesped(rs.getInt(1));
              JOptionPane.showMessageDialog(null, "El huesped fue guardado con exito");
            }
            else
                JOptionPane.showMessageDialog(null, "El huesped no fue guardado");
           
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error interno, no se pudo guardar el huesped");
        }
    }     
    
    
     public Huesped buscarHuesped(int idHuesped)
     { 
         Huesped huesped= new Huesped();
         String sql= "SELECT *FROM huesped WHERE idHuesped=? AND activo=1;";
         
         try {
              PreparedStatement ps= con.prepareStatement(sql);
              ps.setInt(1, idHuesped);
           
              ResultSet rs= ps.executeQuery();
            
              if(rs.next())
              { huesped.setIdhuesped(idHuesped);
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setTelefono(rs.getString("celular"));
                huesped.setActivo(rs.getBoolean("activo"));
               }
            else
            {  JOptionPane.showMessageDialog(null, "No existe huesped con ese ID");
            }
        
           ps.close();
        
         } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error interno, el huesped no pudo ser localizado");
        }
     
         return(huesped);
     }
        
       public Huesped buscarHuespedPorDni(int dni)
     { 
         Huesped huesped= new Huesped();
         String sql= "SELECT *FROM huesped WHERE dni=? AND activo=1;";
        
         try {
              PreparedStatement ps= con.prepareStatement(sql);
              ps.setInt(1, dni);
           
              ResultSet rs= ps.executeQuery();
                         
              if(rs.next())
              { huesped.setIdhuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(dni);
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setTelefono(rs.getString("celular"));
                huesped.setActivo(rs.getBoolean("activo"));
               }
            else
            {  JOptionPane.showMessageDialog(null, "No existe huesped con ese DNI");
            }
        
           ps.close();
        
         } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error interno, el huesped no pudo ser localizado");
        }
     
         return(huesped);
     }
     
     public Huesped modificarHuesped(int idHuesped, Huesped huesped)
     {  String sql="UPDATE huesped SET nombre = ?, apellido = ?, dni = ?, domicilio = ?, correo = ?, celular = ? WHERE idHuesped=? AND activo=true";
        
       PreparedStatement ps=null;
       
        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setString(6, huesped.getTelefono());
            ps.setInt(7, idHuesped);
            int hecho=ps.executeUpdate();
    
            huesped.setIdhuesped(idHuesped);
            if(hecho==1)
             JOptionPane.showMessageDialog(null, "El huesped fue modificado");
            else
                JOptionPane.showMessageDialog(null, "El huesped no pudo ser modificado, no se encuentra activo");
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error interno, el huesped no pudo ser modificado");
        }
       return(huesped);
     }
     
     public void eliminarHuesped(int idHuesped)
     { String sql="UPDATE huesped SET activo=0 WHERE idHuesped=? AND activo=true";
       PreparedStatement ps=null;
       
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            int hecho=ps.executeUpdate();
            
            if(hecho==1)
             JOptionPane.showMessageDialog(null, "El huesped fue eliminado");
            else
                JOptionPane.showMessageDialog(null, "El huesped no existe");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error interno,el huesped no pudo ser eliminado");
        }
     }
     
      public void activarHuesped(int idHuesped) {
          String sql = "UPDATE huesped SET activo = 1 WHERE idHuesped = ? AND activo=0";
          PreparedStatement ps =null;
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            int hecho=ps.executeUpdate();
            
            if(hecho==1)
             JOptionPane.showMessageDialog(null, "El huesped fue activado");
            else
                JOptionPane.showMessageDialog(null, "El huesped no existe");
            
            ps.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error interno, no se pudo activar el huesped.");
        }
    }
     public List<Huesped> listarHuespedes() {

        List<Huesped> huespedes = new ArrayList<>();

        try {
            String sql = "SELECT * FROM huesped WHERE activo = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Huesped huesped= new Huesped();
                huesped.setIdhuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setTelefono(rs.getString("celular"));
                huesped.setActivo(rs.getBoolean("activo"));
                
                huespedes.add(huesped);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  "Error interno al armar la lista de huespedes");
        }
        return huespedes;
    }
   }
    
    
