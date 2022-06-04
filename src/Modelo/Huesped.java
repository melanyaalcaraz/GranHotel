/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Martin
 */
public class Huesped {
    private int idhuesped;
    private String nombre;
    private String Apellido;
    private int dni;
    private String domicilio;
    private String correo;
    private double telefono;
    private boolean activo;

    public Huesped() {
    }

    public Huesped(int idhuesped, String nombre, String Apellido, int dni, String domicilio, String correo, double telefono, boolean activo) {
        this.idhuesped = idhuesped;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.telefono = telefono;
        this.activo = activo;
    }

    
    
    public Huesped(String nombre, String Apellido, int dni, String domicilio, String correo, double telefono, boolean activo) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.telefono = telefono;
        this.activo = activo;
    }

    public int getIdhuesped() {
        return idhuesped;
    }

    public void setIdhuesped(int idhuesped) {
        this.idhuesped = idhuesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
