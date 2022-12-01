/*
 * @author Fernando
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DatosProveedores extends AbstProveedores {
    public DatosProveedores(int identificacion, String nombre, String apellidos, 
            String ciudad, String direccion, int telefono, String correo, char estado) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }
    
    public DatosProveedores() {
        this.identificacion = 0;
        this.nombre = "";
        this.apellidos = "";
        this.ciudad = "";
        this.direccion = "";
        this.telefono = 0;
        this.correo = "";
        this.estado = '\0';
    }

    public int getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
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

    @Override
    public void agregar(ArrayList<DatosProveedores> almacenProveedores, DatosProveedores p){
        boolean existe = false;
        for (int i = 0; i < almacenProveedores.size(); i++) {
                if (almacenProveedores.get(i).getIdentificacion() == p.getIdentificacion()) {
                    existe = true;
                    break;
                }
            }
            if (existe) {
                JOptionPane.showMessageDialog(null, "El proveedor ya se encuentra registrado en el sistema."+"\n"+"Ingrese datos diferentes.",
                        "Proveedor encontrado", JOptionPane.INFORMATION_MESSAGE);
            }else{
                almacenProveedores.add(p);
                JOptionPane.showMessageDialog(null, "Los datos se han agregado correctamente.",
                            "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
            }   
    }
    @Override
    public void editar(ArrayList<DatosProveedores> almacenProveedores, DatosProveedores p){
        boolean existe = false; 
        int encontrado = 0;
        for (int i = 0; i < almacenProveedores.size(); i++) {
                if (almacenProveedores.get(i).getIdentificacion() == p.getIdentificacion()) {
                    existe = true;
                    break;
                }
                encontrado ++;
        }
        if (existe) {
            almacenProveedores.get(encontrado).setNombre(p.getNombre());
            almacenProveedores.get(encontrado).setApellidos(p.getApellidos());
            almacenProveedores.get(encontrado).setCiudad(p.getCiudad());
            almacenProveedores.get(encontrado).setDireccion(p.getDireccion());
            almacenProveedores.get(encontrado).setTelefono(p.getTelefono());
            almacenProveedores.get(encontrado).setCorreo(p.getCorreo());
            almacenProveedores.get(encontrado).setEstado(p.getEstado());
            JOptionPane.showMessageDialog(null, "Proveedor editado con éxito.",
                "Proveedor editado", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No se ha encontrado al proveedor."+"\n"
                +"Asegurese de escribir la identificación correcta y que el proveedor ya esté registrado."+"\n"
                +"Recuerde, la identificación no se puede modificar.", "Proveedor no encontrado",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    @Override
    public void inactivar(ArrayList<DatosProveedores> almacenProveedores, int p){
        boolean existe = false; 
        int encontrado = 0;
        for (int i = 0; i < almacenProveedores.size(); i++) {
                if (almacenProveedores.get(i).getIdentificacion() == p) {
                    existe = true;
                    break;
                }
                encontrado ++;
        }
        if (existe) {
            if (almacenProveedores.get(encontrado).getEstado() == 'A') {
                almacenProveedores.get(encontrado).setEstado('I');
                JOptionPane.showMessageDialog(null, "Proveedor inactivado con éxito.",
                    "Proveedor inactivado", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "El proveedor ya se encuentra inactivo.",
                    "Proveedor inactivo", JOptionPane.ERROR_MESSAGE);
            }  
        }else{
            JOptionPane.showMessageDialog(null, "El proveedor no se encuentra registrado en el sistema.",
                "Proveedor no encontrado", JOptionPane.ERROR_MESSAGE);
        }
    } 
}
