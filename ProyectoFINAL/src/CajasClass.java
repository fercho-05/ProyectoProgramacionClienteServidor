
import java.io.*;
import java.net.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Neptune
 */
public class CajasClass {

    //Servidor
    private static final String HOST = "localhost";
    private static final int PUERTO = 5000;
    private ServerSocket sc;
    private Socket cl;
    private DataOutputStream salida;
    private DataInputStream entrada;
    private String mensajeRecibido = "";//NO estamos recibiendo datos.

    public void inicializarServidor() {
        Scanner lectura = new Scanner(System.in);

        try {
            sc = new ServerSocket(PUERTO);
            cl = new Socket();

            System.out.println("ADMIN: Por definir");
            System.out.println("Estamos listos, esperando conexión...");

            cl = sc.accept();

            System.out.println("¡Se conectó un cliente!");

            entrada = new DataInputStream(cl.getInputStream());
            salida = new DataOutputStream(cl.getOutputStream());
            String mensaje = "";
            int mensajenum = 0;
            double mensajenumD = 0.00;
            while (!mensaje.toLowerCase().equals("Salir")) {
//***********************************************************************************************************************
                try {
                    //Validamos que exista el .dat
                    DataInputStream entrada = new DataInputStream(new FileInputStream("Facturacion.dat"));//Lectura

                    try {//En caso de que exista buscamos los datos
                        DatosArchivos dc = new DatosArchivos();
                        while (true) {
                            /*Orden de Datos a Guardar*/
                            //Fecha
                            //ID
                            //Nombre
                            //Apellido
                            //Descripción
                            //Cantidad compra
                            //Precio

                            //Dato 1 = Fecha
                            dc.setFecha(entrada.readUTF());//Leemos fecha
                            //Dato 2 = ID
                            dc.setId(entrada.readInt());
                            //Dato 3 = Nombre
                            dc.setNombre(entrada.readUTF());//leemos datos
                            //Dato 4 = Apellido
                            dc.setApellido(entrada.readUTF());
                            //Dato 5 = Descripcion
                            dc.setDescripcionFruta(entrada.readUTF());
                            //Dato 6 = Cantidad compra
                            dc.setCantidadCompra(entrada.readInt());
                            //Dato 7 = Precio
                            dc.setPrecio(entrada.readDouble());
                            //PreguPrecntamos la operación que desea realizar
                            //Mensaje Saliente
                            //VENTAS---------------------------------------------------------------------------
                            //**************************************************************************************
                            //SALIDA ENVIA FECHA
                            mensaje = dc.getFecha();//1
                            salida.writeUTF(mensaje);//ENVIA
                            //SALIDA ID
                            mensajenum = dc.getId();//2
                            salida.writeInt(mensajenum);//ENVIA
                            //SALIDA NOMBRE
                            mensaje = dc.getNombre();//3
                            salida.writeUTF(mensaje);//ENVIA
                            //SALIDA ENVIA
                            mensaje = dc.getApellido();//4
                            salida.writeUTF(mensaje);//ENVIA
                            //SALIDA 
                            mensaje = dc.getDescripcionFruta();//5
                            salida.writeUTF(mensaje);
                            //SALIDA
                            mensajenum = dc.getCantidadCompra();//6
                            salida.writeInt(mensajenum);
                            //SALIDA
                            mensajenumD = dc.getPrecio();//7
                            salida.writeDouble(mensajenumD);

                            mensaje = "salir";
                            salida.writeUTF(mensaje);
                            //**************************************************************************************
                            //FIN VENTAS------------------------------------------------------------------------
                        }//ENVIO DE DATOS HACÍA CAJA (RECEPTOR)
                    } catch (EOFException eeof) {
                        entrada.close();
                    }
                } catch (FileNotFoundException fnfe) {
                    JOptionPane.showMessageDialog(null, "¡Archivo no encontrado!", "Archivo no encontrado",
                            JOptionPane.ERROR_MESSAGE);
                } catch (IOException eioe) {
                    JOptionPane.showMessageDialog(null, "¡Error en el dispositivo de almacenamiento!",
                            "Error en el dispositivo", JOptionPane.ERROR_MESSAGE);
                }
//***********************************************************************************************************************

                //mensajeRecibido = entrada.readUTF();              
            }

        } catch (IOException ex) {

            System.out.println("¡Error durante la comunicación!");

        }
    }

    public void ArchivoInspeccion() {//VISTA DE COMO OBTENER NO ACTIVO NADA MAS VISTA

        try {
            //Validamos que exista el .dat
            DataInputStream entrada = new DataInputStream(new FileInputStream("Facturacion.dat"));//Lectura
            try {//En caso de que exista buscamos los datos
                DatosArchivos dc = new DatosArchivos();
                while (true) {
                    //Dato 1 = Fecha
                    dc.setFecha(entrada.readUTF());//Leemos fecha
                    //Dato 2 = Cantidad
                    dc.setCantidadCompra(entrada.readInt());//leemos datos
                    //Dato 3 = Precios
                    dc.setPrecio(entrada.readDouble());
                    //If(dato = dato(dentroarchivo))
                    //encontrado = 1;
                }
            } catch (EOFException eeof) {
                entrada.close();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡Archivo no encontrado!", "Archivo no encontrado",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo de almacenamiento!",
                    "Error en el dispositivo", JOptionPane.ERROR_MESSAGE);
        }
    }
}
