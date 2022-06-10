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
    private boolean estado;
    private Categoria categoria;
    private int nroHabitacion;
    private int piso;
    private boolean refaccion;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, boolean estado, Categoria categoria, int nroHabitacion, int piso, boolean refaccion) {
        this.idHabitacion = idHabitacion;
        this.estado = estado;
        this.categoria = categoria;
        this.nroHabitacion = nroHabitacion;
        this.piso = piso;
        this.refaccion = refaccion;
    }

    public Habitacion(boolean estado, Categoria categoria, int nroHabitacion, int piso, boolean refaccion) {
        this.estado = estado;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", estado=" + estado + ", idCategoria=" + categoria + ", nroHabitacion=" + nroHabitacion + ", piso=" + piso + '}';
    }

}