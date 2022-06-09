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
import java.util.logging.Level;
import java.util.logging.Logger;
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
         //debemos decidir si la busqueda es por huesped activo o no y si es por dni creo es mejor 
         try {
              PreparedStatement ps= con.prepareStatement(sql);
              ps.setInt(1, idHuesped);
           
              ResultSet rs= ps.executeQuery();
              //System.out.println("rs next"+ rs.next());
            
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
        
     
     public Huesped modificarHuesped(int idHuesped, Huesped huesped)
     {  String sql="UPDATE nombre=?, apellido=?, dni=?, domicilio=?, correo=?, celular=? WHERE idHuesped=? AND activo=1";
        
       PreparedStatement ps=null;
       
        try {
            ps=con.prepareStatement(sql);
            
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setString(6, huesped.getTelefono());
            int hecho=ps.executeUpdate();
            
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
     { String sql="UPDATE huesped set activo=0 WHERE id=? AND activo=1";
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
    }
