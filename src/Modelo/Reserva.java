/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Anto
 */
public class Reserva {

    private int idReserva;
    private Habitacion habitacion;
    private Huesped huesped;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precioTotal;
    private int cantPersonas;
    private boolean activo;

    public Reserva() {
    }

    public Reserva(Habitacion habitacion, Huesped huesped, LocalDate fechaInicio, LocalDate fechaFin, double precioTotal, int cantPersonas, boolean activo) {
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
        this.cantPersonas = cantPersonas;
        this.activo = activo;
    }
    
    
    public Reserva(int idReserva, Habitacion habitacion, Huesped huesped, LocalDate fechaInicio, LocalDate fechaFin, double precioTotal, int cantPersonas, boolean activo) {
        this.idReserva = idReserva;
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
        this.cantPersonas = cantPersonas;
        this.activo = activo;
    }

    public Reserva(Habitacion habitacion, Huesped huesped, LocalDate fechaInicio, LocalDate fechaFin, double precioTotal) {
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    public void modificoIdHuesped(int idhuesped)
    {  huesped.setIdhuesped(idhuesped);
    }

    public int veoIdHuesped()
    { return(huesped.getIdhuesped());
    }
    
    public int veoIdHabitacion()
    { return(habitacion.getIdHabitacion());
    }
    
    public void modificoIdHabitacion(int idHabitacion)
    { habitacion.setIdHabitacion(idHabitacion);
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }
 
    public boolean isActivo() {
        return activo;
    }
        
    public void setActivo(boolean activo){
        this.activo = activo;
    }
}