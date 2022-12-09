/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajareceptor;

/**
 *
 * @author Neptune
 */
public class DatosCaja {
    private String fecha;
    private String nombre;
    private int cantidad;
    private double precio, precioTOTALVENTAS;
    
    public DatosCaja(){
        this.fecha = "";
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0.00;
        this.precioTOTALVENTAS = 0.00;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioTOTALVENTAS() {
        return precioTOTALVENTAS;
    }

    public void setPrecioTOTALVENTAS(double precioTOTALVENTAS) {
        this.precioTOTALVENTAS = precioTOTALVENTAS;
    }
    
    
}
