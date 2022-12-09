/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajareceptor;

import java.io.*;
import java.net.Socket;
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

    public void inicializarCliente() {
        try {
            Scanner lectura = new Scanner(System.in);
            sc = new Socket(HOST, PUERTO);
            salida = new DataOutputStream(sc.getOutputStream());
            entrada = new DataInputStream(sc.getInputStream());
            String mensaje = "";

            while (!mensaje.toLowerCase().equals("SALIR")) {
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
                    mensajeRecibido = entrada.readUTF();//PRIMER MENSAJE
                    DA.setFecha(mensajeRecibido);//Obtenemos la fecha//Obtenemos el nombre en datos archivos
                //**************************************************************************************
                    mensajeRecibido = entrada.readUTF();//Segundo Mensaje
                    DA.setNombre(mensajeRecibido);
                //**************************************************************************************
                    mensajeRecibidoNumInt = entrada.readInt();//Tercer Mensaje
                    DA.setCantidad(Integer.parseInt(String.valueOf(mensajeRecibidoNumInt)));//Dijitamos la cantidad a comprar
                //**************************************************************************************
                    mensajeRecibidoNumDouble = entrada.readDouble();//Cuarto Mensaje FINAL
                    DA.setPrecio(mensajeRecibidoNumDouble);
                    
//-----------------------------------------------------------------------------------------------------------------------------------
                    DataOutputStream salida = new DataOutputStream(new FileOutputStream("CAJAS.dat", true));
//-----------------------------------------------------------------------------------------------------------------------------------
                    //VALIDACIONES PARA NO REPETIR DATOS
                    //Sugerencia con encontrado y un if (mas facil)
//-----------------------------------------------------------------------------------------------------------------------------------
                    //Agregamos los datos
                    /*
                    salida.writeUTF(date.toString());//Convertimos la fecha a String para que no de problemas
                    salida.writeUTF(DA.getNombre() + DA.getApellido());//Guardamos Nombre y Apellido
                    salida.writeUTF(DA.getDescripcionFruta());
                    salida.writeDouble(DA.getprecio());
                    salida.writeDouble(DA.getprecioTOTALVENTAS());
                    */
//-----------------------------------------------------------------------------------------------------------------------------------
                    //Fin agregado de datos
                    salida.close();//FIN TODO
                    /*Fin Validaciones*/

                    //Compra Realizada
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
