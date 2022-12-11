/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Neptune
 */
public class DatosArchivos {

    private int id;
    private String fecha;
    private String Nombre, Apellido, DescripcionFruta;
    private int CantidadCompra;
    private double precio;

    public DatosArchivos(int id, String fecha, String Nombre, String Apellido, String DescripcionFruta, int CantidadCompra, double precio) {
        this.id = id;
        this.fecha = "";
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DescripcionFruta = DescripcionFruta;
        this.CantidadCompra = CantidadCompra;
        this.precio = precio;
    }

    public DatosArchivos() {
        this.id = 0;
        this.fecha = "";
        this.Nombre = "";
        this.Apellido = "";
        this.DescripcionFruta = "";
        this.CantidadCompra = 0;
        this.precio = 0.00;
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

    public void agregar(ArrayList<DatosArchivos> datosarchivos, DatosArchivos p) {
        boolean existe = false;
        for (int i = 0; i < datosarchivos.size(); i++) {
            if (datosarchivos.get(i).getId() == p.getId()) {
                existe = true;
                break;
            }
        }
        if (existe) {
            JOptionPane.showMessageDialog(null, "El proveedor ya se encuentra registrado en el sistema." + "\n" + "Ingrese datos diferentes.",
                    "Proveedor encontrado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            datosarchivos.add(p);
            JOptionPane.showMessageDialog(null, "Los datos se han agregado correctamente.",
                    "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
