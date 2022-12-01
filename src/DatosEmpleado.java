
public class DatosEmpleado{
    private String nombre;
    private String apellidos;
    private String usuario;
    private String contraseña;
    private char estado;
    
    public DatosEmpleado(){
        this.nombre = "";
        this.apellidos = "";
        this.usuario = "";
        this.contraseña = "";
        this.estado = 0;
    }

    public DatosEmpleado(String nombre, String apellidos, String usuario, String contraseña, char estado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = estado;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public char getEstado() {
        return estado;
    }
    public void setEstado(char estado) {
        this.estado = estado;
    }

    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
    

    

    
    
    
    
 
    
    

                
    

