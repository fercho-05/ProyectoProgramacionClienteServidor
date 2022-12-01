
public class DatosClientes {
    private String nombre;
    private String apellidos;
    private int identificacion;
    private String ciudad;
    private String direccion;
    private int telefono;
    private String correo;
    private String usuario;
    private String contraseña;
    private char estado;

    public DatosClientes() {
        this.nombre = "";
        this.apellidos = "";
        this.identificacion = 0;
        this.usuario = "";
        this.contraseña = "";
        this.ciudad = "";
        this.direccion = "";
        this.telefono = 0;
        this.correo = "";
        this.estado = '\0';
    }

    public DatosClientes(String nombre, String apellidos, int identificacion, String ciudad, String direccion, int telefono, String correo, String usuario, String contraseña, char estado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
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

    public int getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public char getEstado() {
        return estado;
    }
    public void setEstado(char estado) {
        this.estado = estado;
    } 
}
