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

    /*Orden de Datos a Guardar*/
    //Fecha
    //ID
    //Nombre
    //Apellido
    //Descripción
    //Cantidad compra
    //Precio
    private String fecha;
    private int id;
    private String nombre;
    private String apellido;
    private String descripcion;
    private int cantidad;
    private double precio, precioTOTALVENTAS;

    public DatosCaja() {
        this.fecha = "";
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.descripcion = "";
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
