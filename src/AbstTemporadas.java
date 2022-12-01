/*
 * @author Fernando
 */
import java.util.ArrayList;

public abstract class AbstTemporadas {
    protected String descripcion;
    protected String mesCosecha;
    protected char estado;
    
    public abstract void agregar(ArrayList<DatosTemporadas> almacenTemporadas, DatosTemporadas t);
    public abstract void editar(ArrayList<DatosTemporadas> almacenTemporadas, DatosTemporadas t);
    public abstract void inactivar(ArrayList<DatosTemporadas> almacenTemporadas, String t);
}
