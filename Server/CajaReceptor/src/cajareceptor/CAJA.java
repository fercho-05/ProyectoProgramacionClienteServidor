/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajareceptor;

import java.io.*;
import java.net.Socket;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Neptune
 */
public class CAJA {

    private static final String HOST = "localhost";
    private static final int PUERTO = 5000;//Puerto a utilizar
    private Socket sc;
    private DataOutputStream salida;//Flujo salida
    private DataInputStream entrada;//Flujo entrada
    private String mensajeRecibido = "";
    private int mensajeRecibidoNumInt = 0;
    private double mensajeRecibidoNumDouble = 0.00;
    private double preciofinal = 0;

    public void inicializarCliente() {
        try {
            Scanner lectura = new Scanner(System.in);
            sc = new Socket(HOST, PUERTO);
            salida = new DataOutputStream(sc.getOutputStream());
            entrada = new DataInputStream(sc.getInputStream());
            String mensaje = "";

            while (!(mensaje.toLowerCase().equals("SALIR") || mensaje.toUpperCase().equals("salir"))) {
                /*Intrucciones*/
                //Crear un arhivo con nombre diferente pero que sea .dat aqui dentro
                //En ese archivo almacenan los datos recibidos de CajaClass
                //Todo eso dentro de este while
                //Respetar el orden de los datos recibidos, si no empieza con errores repetidos

                //Variable x tipo double. x = 0.00, x += mensajeRecibido PRECIO; 
                //mensajeRecibido = entrada.readUTF();
                //System.out.println(mensajeRecibido);//Recibimos el mensaje de la operacion que deseamos realizar
                try {
//-----------------------------------------------------------------------------------------------------------------------------------            
                    DatosCaja DA = new DatosCaja();//Estos son los datos que vamos a pedir
//-----------------------------------------------------------------------------------------------------------------------------------
                    mensajeRecibido = entrada.readUTF();//Fecha
                    DA.setFecha(mensajeRecibido);//Obtenemos la fecha//Obtenemos el nombre en datos archivos
                    //**************************************************************************************
                    mensajeRecibidoNumInt = entrada.readInt();//ID
                    DA.setId(mensajeRecibidoNumInt);
                    //**************************************************************************************
                    mensajeRecibido = entrada.readUTF();//Nombre
                    DA.setNombre(mensajeRecibido);//Dijitamos la cantidad a comprar
                    //**************************************************************************************
                    mensajeRecibido = entrada.readUTF();//Apellido
                    DA.setApellido(mensajeRecibido);
                    //**************************************************************************************
                    mensajeRecibido = entrada.readUTF();//Descripcion
                    DA.setDescripcion(mensajeRecibido);
                    //**************************************************************************************
                    mensajeRecibidoNumInt = entrada.readInt();//Cantidad Compra
                    DA.setCantidad(mensajeRecibidoNumInt);
                    //**************************************************************************************
                    mensajeRecibidoNumDouble = entrada.readDouble();//Precio
                    DA.setPrecio(mensajeRecibidoNumDouble);

//-----------------------------------------------------------------------------------------------------------------------------------
                    DataOutputStream salida = new DataOutputStream(new FileOutputStream("CAJAS.dat", true));
//-----------------------------------------------------------------------------------------------------------------------------------
                    //VALIDACIONES PARA NO REPETIR DATOS
                    //Sugerencia con encontrado y un if (mas facil)
//-----------------------------------------------------------------------------------------------------------------------------------
                    //Agregamos los datos
                    /*Orden de Datos a Guardar*/
                    //Fecha
                    //ID
                    //Nombre
                    //Apellido
                    //Descripción
                    //Cantidad compra
                    //Precio
                    //Dato 1 = Fecha

                    salida.writeUTF(DA.getFecha());//Convertimos la fecha a String para que no de problemas
                    salida.writeInt(DA.getId());
                    salida.writeUTF(DA.getNombre());//Guardamos Nombre y Apellido
                    salida.writeUTF(DA.getApellido());
                    salida.writeUTF(DA.getDescripcion());
                    salida.writeDouble(DA.getCantidad());
                    salida.writeDouble(DA.getPrecio());
                    //salida.writeDouble(DA.getPrecioTOTALVENTAS());
//-----------------------------------------------------------------------------------------------------------------------------------
                    //Fin agregado de datos
                    salida.close();//FIN TODO
                    /*Fin Validaciones*/
                    mensajeRecibido = entrada.readUTF();

                    //Compra Realizada
                    JOptionPane.showMessageDialog(null, "¡Datos Guardados en Cajas!",
                            "Exito", JOptionPane.INFORMATION_MESSAGE);
                    //JOptionPane.showMessageDialog(null, "Su compra se ha realizado");//No necesario
//-----------------------------------------------------------------------------------------------------------------------------------            
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "¡Ocurrió un error al guardar!",
                            "Error al guardar", JOptionPane.ERROR_MESSAGE);
                }

            }
            System.out.println("¡HAS SALIDO DEL PROGRAMA!");

        } catch (IOException ex) {
            System.out.println("¡Error durante la conexión!");
        }
    }

}
