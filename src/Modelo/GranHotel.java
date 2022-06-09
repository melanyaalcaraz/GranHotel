/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Controlador.Conexion;
import Controlador.HuespedData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Martin
 */
public class GranHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
       // Huesped h1= new Huesped("Francisco", "Casco", 54333333, "su casa123", "elmostro@quesio156", "15430961",true);
       //  Huesped h2= new Huesped("Martin", "Casco", 26444444, "mi casa1234", "yomostro@quesio156", "1522430961",true);
        // Huesped h3=new Huesped("Bauti", "martinez", 50555555, "la estancia444", "paparapa@yaesta", "158888888", true);
        
        Conexion con;
        
      
       
        try {
            con = new Conexion();
              HuespedData hd= new HuespedData(con);
             //  hd.guardarHuesped(h1);
              // hd.guardarHuesped(h2);
              // hd.guardarHuesped(h3);
               
               System.out.println("huesped 1 "+hd.buscarHuesped(1));
               System.out.println("huesped no existente "+hd.buscarHuesped(5));// no existe este huesped solo para probar
               System.out.println("huesped 2 "+hd.buscarHuesped(2));
               System.out.println("huesped 3 "+hd.buscarHuesped(3));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GranHotel.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
       
          
         
          
          
        
    }
    
}
