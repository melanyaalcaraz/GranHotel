/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.CategoriaData;
import Controlador.Conexion;
import Controlador.HabitacionData;
import Controlador.HuespedData;

import Modelo.Categoria;
import Modelo.Habitacion;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Martin
 */
public class GranHotel {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException

     */
     public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        Conexion con = new Conexion();
        
        Huesped h1= new Huesped("Maria", "Perez", 12, "abejas", "@correo", "1234",true);
        Huesped h2= new Huesped("Lucia", "Celi", 415, "luciernagas", "@correo1", "4321",true);
        Huesped h3= new Huesped("Benjamin", "Bilotta", 784, "mariposas", "@correo3", "741258", true);
        
        HuespedData huespedd= new HuespedData(con);
               huespedd.guardarHuesped(h1);
               huespedd.guardarHuesped(h2);
               huespedd.guardarHuesped(h3);
//        
//        
//         System.out.println("Busca por ID");
 //              System.out.println(""+huespedd.buscarHuesped(1));
//               System.out.println(""+huespedd.buscarHuesped(5));// no existe este huesped solo para probar
//               System.out.println(""+huespedd.buscarHuesped(2));
//               System.out.println(""+huespedd.buscarHuesped(3));
//               
//               System.out.println("");
//               System.out.println("");
//               System.out.println("Busca por DNI");
//           System.out.println(""+huespedd.buscarHuespedPorDni(54333333));
//               System.out.println("un dni que no esta: "+ huespedd.buscarHuespedPorDni(123456));
//               
//               System.out.println("");
//               System.out.println("");
//               System.out.println("Modificar Huesped");
//               
//               System.out.println(""+huespedd.buscarHuesped(2));
//             Huesped h4= new Huesped("Luciano", "Casco", 26467307, "est israel", "cascasen@quesio156", "15225320",true);
//              System.out.println("huesped modificado"+huespedd.modificarHuesped(2, h2));
//
//
//              huespedd.eliminarHuesped(6);
//
 //              huespedd.activarHuesped(3);
//
//
//                System.out.println("");
//                System.out.println("");
//                System.out.println("listar huespedes");
//                huespedd.listarHuespedes().forEach(huesped-> {System.out.println("hueped"+huesped);});
        
        
        
        HabitacionData hd = new HabitacionData(con);
        //Categoria cat1= new Categoria(1,1,5,3,1);
        //Categoria cat2= new Categoria(2,1,5,3,1);
        //Categoria cat3= new Categoria(3,1,5,3,1);
        //Habitacion  hab1 = new Habitacion(true,cat1,1,1,false);
        //Habitacion  hab2 = new Habitacion(true,cat2,2,1,false);
        //Habitacion  hab3 = new Habitacion(false,cat3,25,1,true);
        //Habitacion  hab4 = new Habitacion(true,cat3,4,1,false);
        
//        hd.agregarHabitacion(hab1);
//        hd.agregarHabitacion(hab2);
//        hd.agregarHabitacion(hab3);
//        hd.agregarHabitacion(hab4);
//        hd.modificarHabitacion(3, hab3);
//        hd.eliminarHabitacion(10);
//        System.out.println(hd.buscarHabitacion(3));
//          hd.habilitarHabitacion(3, hab3);
//         hd.deshabilitarHabitacion(3, hab3);
        
//        List <Habitacion> lista = hd.obtenerHabitacionesXCategoria(3);
//        //Habitacion con categoria 3 se encuentra en refaccion
//        int total = 0;
//        for(Habitacion h : lista){
//            if(h.obtengoIdCategoria() ==1){
//                    System.out.println("Categoria 1 - tipo cama: Simple ");
//                }else if(h.obtengoIdCategoria()==2){
//                    System.out.println("Categoria 2 - tipo cama: Queen ");
//                }else{
//                     System.out.println("Categoria 3 - tipo cama: King size");
//                }
//            System.out.println("Id Habitacion: "+ h.getIdHabitacion());
//            System.out.println("Numero Habitacion: " + h.getNroHabitacion());
//            System.out.println("----------");
//            total+=1;
//         }
//        System.out.println("El total de habitaciones: "+ total);


//        List <Habitacion> re = hd.obtenerHabitacionesNOhabilitadas();
//        //Habitacion con categoria 3 se encuentra en refaccion
//        int total = 0;
//        System.out.println("Habitaciones en refaccion: ");
//        for(Habitacion h : re){
//            
//            System.out.println("Id Habitacion: "+ h.getIdHabitacion());
//            System.out.println("Numero Habitacion: " + h.getNroHabitacion());
//            System.out.println("----------");
//            total+=1;
//         }
//            System.out.println("El total de habitaciones en refaccion: "+ total);

            
//         List <Habitacion> habi = hd.obtenerHabitacionesHabilitadas();
//        
//        int total1 = 0;
//        for(Habitacion h : habi){
//            System.out.println("Id Habitacion: "+ h.getIdHabitacion());
//            System.out.println("Numero Habitacion: " + h.getNroHabitacion());
//            System.out.println("----------");
//            total1+=1;
//         }
//            System.out.println("El total de habitaciones habilitadas: "+ total1);
        
//            CategoriaData c = new CategoriaData(con);
//            System.out.println(c.buscarCategoria(1));
//        
//        
        
    }
    
}
