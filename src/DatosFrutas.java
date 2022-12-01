/*
 * @author Fernando
 */
import java.util.ArrayList; 
import javax.swing.JOptionPane;

public class DatosFrutas extends AbstFrutas {
    public DatosFrutas(String descripcion, int cantidad, String proveedor, String temporada, double precio, char estado) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
        this.temporada = temporada;
        this.precio = precio;
        this.estado = estado;
    }
    
    public DatosFrutas() {
        this.descripcion = "";
        this.cantidad = 0;
        this.proveedor = "";
        this.temporada = "";
        this.precio = 0.0;
        this.estado = '\0';
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return proveedor;
    }
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTemporada() {
        return temporada;
    }
    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public char getEstado() {
        return estado;
    }
    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    @Override
    public void agregar(ArrayList<DatosFrutas> almacenFrutas, DatosFrutas f){
        boolean existe = false;
        for (int i = 0; i < almacenFrutas.size(); i++) {
                if (almacenFrutas.get(i).getDescripcion().equals(f.getDescripcion())) {
                    existe = true;
                    break;
                }
            }
            if (existe) {
                JOptionPane.showMessageDialog(null, "La fruta ya se encuentra registrada en el sistema."+"\n"+"Ingrese datos diferentes.",
                        "Fruta encontrada", JOptionPane.INFORMATION_MESSAGE);
            }else{
                almacenFrutas.add(f);
                JOptionPane.showMessageDialog(null, "Los datos se han agregado correctamente.",
                            "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
            }   
    }
    @Override
    public void editar(ArrayList<DatosFrutas> almacenFrutas, DatosFrutas f){
        boolean existe = false; 
        int encontrado = 0;
        for (int i = 0; i < almacenFrutas.size(); i++) {
                if (almacenFrutas.get(i).getDescripcion().equals(f.getDescripcion())) {
                    existe = true;
                    break;
                }
                encontrado ++;
        }
        if (existe) {
            almacenFrutas.get(encontrado).setCantidad(f.getCantidad());
            almacenFrutas.get(encontrado).setProveedor(f.getProveedor());
            almacenFrutas.get(encontrado).setTemporada(f.getTemporada());
            almacenFrutas.get(encontrado).setPrecio(f.getPrecio());
            almacenFrutas.get(encontrado).setEstado(f.getEstado());
            JOptionPane.showMessageDialog(null, "Fruta editada con éxito.",
                "Fruta editada", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No se ha encontrado la fruta."+"\n"
                +"Asegurese de escribir la descripción/nombre correcto y que la fruta ya esté registrada."+"\n"
                +"Recuerde, la descripción/nombre no se puede modificar.", "Fruta no encontrada",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    @Override
    public void inactivar(ArrayList<DatosFrutas> almacenFrutas, String f){
        boolean existe = false; 
        int encontrado = 0;
        for (int i = 0; i < almacenFrutas.size(); i++) {
                if (almacenFrutas.get(i).getDescripcion().equals(f)) {
                    existe = true;
                    break;
                }
                encontrado ++;
        }
        if (existe) {
            if (almacenFrutas.get(encontrado).getEstado() == 'A') {
                almacenFrutas.get(encontrado).setEstado('I');
                JOptionPane.showMessageDialog(null, "Fruta inactivada con éxito.",
                    "Fruta inactivado", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "La fruta ya se encuentra inactiva.",
                    "Fruta inactiva", JOptionPane.ERROR_MESSAGE);
            }  
        }else{
            JOptionPane.showMessageDialog(null, "La fruta no se encuentra registrada en el sistema.",
                "Fruta no encontrada", JOptionPane.ERROR_MESSAGE);
        }
    }
}
