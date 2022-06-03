
package Modelo;

/**
 *
 * @author Martin
 */
public class Categoria {
    private int idCategoria;
    private int cantPersonas;
    private int cantCamas;
    private int tipoCama;
    private int tipoHabitacion;

    public Categoria() {
    }

    public Categoria(int cantPersonas, int cantCamas, int tipoCama, int tipoHabitacion) {
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

    public int getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(char tipoCama) {
        this.tipoCama = tipoCama;
    }

    public int getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(int tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    
}
