
package Modelo;

/**
 *
 * @author Martin
 */
public class Categoria {
    private int idCategoria;
    private int cantPersonas;
    private int cantCamas;
    private String tipoCama;
    private int tipoHabitacion;
    private double precio;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(int idCategoria, int cantPersonas, int cantCamas, String tipoCama, int tipoHabitacion, double precio, boolean activo) {
        this.idCategoria = idCategoria;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCama = tipoCama;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
        this.activo = activo;
    }

    public Categoria(int cantPersonas, int cantCamas, String tipoCama, int tipoHabitacion) {
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCama = tipoCama;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public int getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(int tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
