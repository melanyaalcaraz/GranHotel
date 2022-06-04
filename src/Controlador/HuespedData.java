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
            ps.setDouble(6, huesped.getTelefono());
            ps.setInt(7, huesped.isActivo()? 1 : 0);
            
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            
            if(rs.next())
            { huesped.setIdhuesped(rs.getInt(1));
              JOptionPane.showMessageDialog(null, "El huesped fue añadido con exito");
            }
            else
                JOptionPane.showMessageDialog(null, "El huesped no fue añadido");
           
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
     public Huesped buscarHuesped(int idHuesped)
     { 
         Huesped huesped= new Huesped();
         String sql= "SELECT nombre, apellido, dni, domicilio, correo, celular, activo FROM huesped WHERE idHuesped=? AND activo=1";
         //debemos decidir si la busqueda es por huesped activo o no y si es por dni creo es mejor 
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
              huesped.setTelefono(rs.getDouble("celular"));
              huesped.setActivo(rs.getBoolean("acivo"));
            }
            else
                JOptionPane.showMessageDialog(null, "No existe cliente con ese ID");
        
           ps.close();
        
         } catch (SQLException ex) {
            Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
     
         return(huesped);
     }
        
    }
