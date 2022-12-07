/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Date;

/**
 *
 * @author Neptune
 */
public class DatosArchivos {

    private String Nombre;
    private String Apellido;
    private Date Fecha;
    private String DescripcionFruta;
    private int CantidadCompra;
    

    public DatosArchivos(Date Fecha) {
        this.Nombre = "";
        this.Apellido = "";
        this.Fecha = Fecha;
        this.DescripcionFruta = "";
        this.CantidadCompra = 0;
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

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
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
    
    

    

}
