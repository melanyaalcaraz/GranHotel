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
public class Habitacion {
    
    private int idHabitacion;
    private Categoria categoria;
    private int nroHabitacion;
    private int piso;
    private boolean refaccion;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, Categoria categoria, int nroHabitacion, int piso, boolean refaccion) {
        this.idHabitacion = idHabitacion;
        this.categoria = categoria;
        this.nroHabitacion = nroHabitacion;
        this.piso = piso;
        this.refaccion = refaccion;
    }

    public Habitacion(Categoria categoria, int nroHabitacion, int piso, boolean refaccion) {
        this.categoria = categoria;
        this.nroHabitacion = nroHabitacion;
        this.piso = piso;
        this.refaccion = refaccion;
    }
    

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }
    

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public boolean isRefaccion() {
        return refaccion;
    }

    public void setRefaccion(boolean refaccion) {
        this.refaccion = refaccion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void modificoIdCategoria(int idCategoria) {
        categoria.setIdCategoria(idCategoria);
    }

    public int obtengoIdCategoria() {
        return (categoria.getIdCategoria());
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idH"+ idHabitacion  + categoria  + nroHabitacion + piso + "}";
    }

}