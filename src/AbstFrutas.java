


/*
 * @author Fernando
 */

import java.util.ArrayList;



public abstract class AbstFrutas {
    protected String descripcion;
    protected int cantidad;
    protected String proveedor; //Buscar en lista de proovedores
    protected String temporada; //Buscar en lista de temporadas
    protected double precio;
    protected char estado;

    public abstract void agregar(ArrayList<DatosFrutas> almacenFrutas, DatosFrutas f);
    public abstract void editar(ArrayList<DatosFrutas> almacenFrutas, DatosFrutas f);
    public abstract void inactivar(ArrayList<DatosFrutas> almacenFrutas, String f);
}
