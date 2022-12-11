/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Neptune
 */
public class DatosArchivos {

    public ArrayList<DatosArchivos> datos = new ArrayList<>();

    private int id;
    private String fecha;
    private String Nombre, Apellido, DescripcionFruta;
    private int CantidadCompra;
    private double precio, precioTotal;

    public DatosArchivos(int id, String fecha, String Nombre, String Apellido, String DescripcionFruta, int CantidadCompra, double precio, double precioTotal) {
        this.id = id;
        this.fecha = "";
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DescripcionFruta = DescripcionFruta;
        this.CantidadCompra = CantidadCompra;
        this.precio = precio;
        this.precioTotal = precioTotal;
    }

    public DatosArchivos() {
        this.id = 0;
        this.fecha = "";
        this.Nombre = "";
        this.Apellido = "";
        this.DescripcionFruta = "";
        this.CantidadCompra = 0;
        this.precio = 0.00;
        this.precioTotal = 0.00;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcionFruta() {
        return DescripcionFruta;
    }

    public void setDescripcionFruta(String DescripcionFruta) {
        this.DescripcionFruta = DescripcionFruta;
    }

    public int getCantidadCompra() {
        return CantidadCompra;
    }

    public void setCantidadCompra(int CantidadCompra) {
        this.CantidadCompra = CantidadCompra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void agregar(ArrayList<DatosArchivos> datosarchivos, DatosArchivos p) {
        boolean existe = false;
        for (int i = 0; i < datosarchivos.size(); i++) {
            if (datosarchivos.get(i).getId() == p.getId()) {
                existe = true;
                break;
            }
        }
        if (!existe) {

            datosarchivos.add(p);
            JOptionPane.showMessageDialog(null, "Los datos se han agregado correctamente.",
                    "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
        }
    }
//---------------------------------------------------------------------------------------------------------------------------------------

    public void modificar(ArrayList<DatosArchivos> infoArchivo, DatosArchivos p) {
        int cont = 0;
        boolean existe = false;
//--------------------------------------------------------------------------------------------------------------------------------------
        for (int i = 0; i < infoArchivo.size(); i++) {//Tengo que recorrer el array antes pero enfocado al archivo si es que existe
            if (infoArchivo.get(i).getId() == p.getId()) {//get id hace referencia a numero de factura
                existe = true;
                break;
            }
            cont++;
        }
        if (existe) {
            int d = M.AInt(JO.Captura("Nombre: " + infoArchivo.get(cont).getNombre() + "\n Compro: "
                    + infoArchivo.get(cont).getDescripcionFruta() + "\n Cantidad Comprada: "
                    + infoArchivo.get(cont).getCantidadCompra() + "\n Dijite la nueva cantidad comprada:"));

            //Actualizamos Cantidad Compra
            infoArchivo.get(cont).setCantidadCompra(d);
            //Actualizamos precio
            infoArchivo.get(cont).setPrecioTotal(infoArchivo.get(cont).getPrecio() * d);
            File f = new File("Facturacion.dat");
            try {
                if (f.exists()) {//Si existe eliminamos
                    f.delete();
                }
                //Generamos el Arhivo con los datos cambiados
                DataOutputStream salida = new DataOutputStream(new FileOutputStream("Facturacion.dat", true));
                /* 
                Id, Fecha, Nombre, Apellido, Descripción, Cantidad compra, Precio
                 */
                for (int i = 0; i < infoArchivo.size(); i++) {//Recorremos el Array
                    salida.writeUTF(infoArchivo.get(i).getFecha());
                    salida.writeInt(infoArchivo.get(i).getId());
                    salida.writeUTF(infoArchivo.get(i).getNombre());
                    salida.writeUTF(infoArchivo.get(i).getApellido());
                    salida.writeUTF(infoArchivo.get(i).getDescripcionFruta());
                    salida.writeInt(infoArchivo.get(i).getCantidadCompra());
                    salida.writeDouble(infoArchivo.get(i).getPrecio());

                }
                JO.MuestraI("Datos Modificados");

            } catch (FileNotFoundException fnfe) {
                JOptionPane.showMessageDialog(null, "¡Archivo no encontrado!", "Archivo no encontrado",
                        JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "¡Error en el dispositivo de almacenamiento!",
                        "Error en el dispositivo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JO.MuestraE("No existe");
        }
    }

    public void anular(ArrayList<DatosArchivos> infoArchivo, DatosArchivos p) {
        int cont = 0;
        boolean existe = false;
//--------------------------------------------------------------------------------------------------------------------------------------
        for (int i = 0; i < infoArchivo.size(); i++) {//Tengo que recorrer el array antes pero enfocado al archivo si es que existe
            if (infoArchivo.get(i).getId() == p.getId()) {//get id hace referencia a numero de factura
                existe = true;
                break;
            }
            cont++;
        }
        if (existe) {
            infoArchivo.remove(infoArchivo.get(cont));
            JO.MuestraI("Datos Eliminados");
            File f = new File("Facturacion.dat");
            try {
                if (f.exists()) {//Si existe eliminamos
                    f.delete();
                }
                //Generamos el Arhivo con los datos cambiados
                DataOutputStream salida = new DataOutputStream(new FileOutputStream("Facturacion.dat", true));
                /* 
                Id, Fecha, Nombre, Apellido, Descripción, Cantidad compra, Precio
                 */
                for (int i = 0; i < infoArchivo.size(); i++) {//Recorremos el Array
                    salida.writeUTF(infoArchivo.get(i).getFecha());
                    salida.writeInt(infoArchivo.get(i).getId());
                    salida.writeUTF(infoArchivo.get(i).getNombre());
                    salida.writeUTF(infoArchivo.get(i).getApellido());
                    salida.writeUTF(infoArchivo.get(i).getDescripcionFruta());
                    salida.writeInt(infoArchivo.get(i).getCantidadCompra());
                    salida.writeDouble(infoArchivo.get(i).getPrecio());

                }
                JO.MuestraI("Datos Modificados");

            } catch (FileNotFoundException fnfe) {
                JOptionPane.showMessageDialog(null, "¡Archivo no encontrado!", "Archivo no encontrado",
                        JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "¡Error en el dispositivo de almacenamiento!",
                        "Error en el dispositivo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JO.MuestraE("No existe");
        }
    }
}
