/*
 * @author Fernando
 */
import java.util.ArrayList;

public abstract class AbstProveedores { 
    protected int identificacion;
    protected String nombre;
    protected String apellidos;
    protected String ciudad;
    protected String direccion;
    protected int telefono;
    protected String correo;
    protected char estado;

    public abstract void agregar(ArrayList<DatosProveedores> almacenProveedores, DatosProveedores p);
    public abstract void editar(ArrayList<DatosProveedores> almacenProveedores, DatosProveedores p);
    public abstract void inactivar(ArrayList<DatosProveedores> almacenProveedores, int p); 
}
