/*
 * @author Fernando
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DatosTemporadas extends AbstTemporadas {
    public DatosTemporadas(String descripcion, String mesCosecha, char estado) {
        this.descripcion = descripcion;
        this.mesCosecha = mesCosecha;
        this.estado = estado;
    }

    public DatosTemporadas() {
        this.descripcion = "";
        this.mesCosecha = "";
        this.estado = '\0';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMesCosecha() {
        return mesCosecha;
    }

    public void setMesCosecha(String mesCosecha) {
        this.mesCosecha = mesCosecha;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public void agregar(ArrayList<DatosTemporadas> almacenTemporadas, DatosTemporadas t) {
        boolean existe = false;
        for (int i = 0; i < almacenTemporadas.size(); i++) {
            if (almacenTemporadas.get(i).getDescripcion().equals(t.getDescripcion())) {
                existe = true;
                break;
            }
        }
        if (existe) {
            JOptionPane.showMessageDialog(null, "La temporada ya se encuentra registrada en el sistema." + "\n" + "Ingrese datos diferentes.",
                    "Temporada encontrada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            almacenTemporadas.add(t);
            JOptionPane.showMessageDialog(null, "Los datos se han agregado correctamente.",
                    "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void editar(ArrayList<DatosTemporadas> almacenTemporadas, DatosTemporadas t) {
        boolean existe = false;
        int encontrado = 0;
        for (int i = 0; i < almacenTemporadas.size(); i++) {
            if (almacenTemporadas.get(i).getDescripcion().equals(t.getDescripcion())) {
                existe = true;
                break;
            }
            encontrado++;
        }
        if (existe) {
            almacenTemporadas.get(encontrado).setMesCosecha(t.getMesCosecha());
            almacenTemporadas.get(encontrado).setEstado(t.getEstado());
            JOptionPane.showMessageDialog(null, "Temporada editada con éxito.",
                    "Temporada editada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado la Temporada." + "\n"
                    + "Asegurese de escribir la descripción/nombre correcto y que la temporada ya esté registrada." + "\n"
                    + "Recuerde, la descripción/nombre no se puede modificar.", "Temporada no encontrada",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void inactivar(ArrayList<DatosTemporadas> almacenTemporadas, String t) {
        boolean existe = false;
        int encontrado = 0;
        for (int i = 0; i < almacenTemporadas.size(); i++) {
            if (almacenTemporadas.get(i).getDescripcion().equals(t)) {
                existe = true;
                break;
            }
            encontrado++;
        }
        if (existe) {
            if (almacenTemporadas.get(encontrado).getEstado() == 'A') {
                almacenTemporadas.get(encontrado).setEstado('I');
                JOptionPane.showMessageDialog(null, "Temporada inactivada con éxito.",
                        "Temporada inactivado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "La temporada ya se encuentra inactiva.",
                        "Temporada inactiva", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "La temporada no se encuentra registrada en el sistema.",
                    "Temporada no encontrada", JOptionPane.ERROR_MESSAGE);
        }
    }
}
