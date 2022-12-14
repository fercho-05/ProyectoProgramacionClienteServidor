/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Neptune
 */
public class Facturacion extends javax.swing.JFrame {

    public ArrayList<DatosArchivos> datosarchivos = new ArrayList<>();
    DatosArchivos control = new DatosArchivos();
    private int numeroFactura = 0;

    /**
     * Creates new form Facturacion
     */
    public Facturacion() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Facturación");
        setResizable(false);
        Image fruteria = new ImageIcon(getClass().getResource("iconos\\Icono_FRUTERIA.png")).getImage();
        setIconImage(fruteria);

    }
    private int n = 0;

    //Tenemos que buscar en las otras clases
    //descripción de  las frutas compradas(deberá buscarlo en el catálogode frutas), 
    //nombre   del    cliente   (deberá  buscar  esta  información  en  las estructuras  respectivas). 
    public void Reservar() {//Aqui registraremos la fecha y hora, descripción de las frutas compradas, nombre del cliente 
        if (jtfCantidadCompra.getText().trim().isBlank() || jtfIdentificacion.getText().trim().isBlank()) {//En este caso solo pedimos este ya que es el unico que ocupamos en este
            JOptionPane.showMessageDialog(null, "Faltan Espacios por rellenar");

        } else {
            try {
//-----------------------------------------------------------------------------------------------------------------------------------            
                Date date = new Date();//Esta es la fecha y hora actual.
                DatosArchivos DA = new DatosArchivos();//Estos son los datos que vamos a pedir
//-----------------------------------------------------------------------------------------------------------------------------------
                numeroFactura += 1;
                DA.setId(numeroFactura);
                DA.setNombre(jtfNombre.getText());//Obtenemos el nombre en datos archivos
                DA.setApellido(jtfApellido.getText());//Obtenemos el apellido en datos archivos
                DA.setDescripcionFruta(jtfDescripcionFruta.getText());//Obtenemos la descripcion en datos archivos
                DA.setFecha(date.toString());//Obtenemos la fecha
                DA.setCantidadCompra(M.AInt(jtfCantidadCompra.getText()));//Dijitamos la cantidad a comprar
                DA.setPrecio(M.ADouble(jtfPrecioProducto.getText()));//Obtenemos el precio final
                DA.setPrecioTotal(M.ADouble(jtfTotal.getText()));
                //Reduccion de cantidad disponible
                Frutas.almacenFrutas.get(n).setCantidad(Frutas.almacenFrutas.get(n).getCantidad() - DA.getCantidadCompra());
//-----------------------------------------------------------------------------------------------------------------------------------
                control.agregar(datosarchivos, DA);
//-----------------------------------------------------------------------------------------------------------------------------------
                DataOutputStream salida = new DataOutputStream(new FileOutputStream("Facturacion.dat", true));
//-----------------------------------------------------------------------------------------------------------------------------------
                /* 
                    Id, Fecha, Nombre, Apellido, Descripción, Cantidad compra, Precio, PrecioTotal (8 datos)
                 */
                //Agregamos los datos
                salida.writeInt(DA.getId());//ID
                salida.writeUTF(DA.getFecha());//Convertimos la fecha a String para que no de problemas
                salida.writeUTF(DA.getNombre());//Guardamos Nombre y Apellido
                salida.writeUTF(DA.getApellido());
                salida.writeUTF(DA.getDescripcionFruta());
                salida.writeInt(DA.getCantidadCompra());
                salida.writeDouble(DA.getPrecio());
                salida.writeDouble(DA.getPrecioTotal());

                salida.close();
//-----------------------------------------------------------------------------------------------------------------------------------
                //Compra Realizada
                JOptionPane.showMessageDialog(null, "Su compra se ha realizado, N° Factura: " + numeroFactura);

//-----------------------------------------------------------------------------------------------------------------------------------            
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "¡Ocurrió un error al guardar!",
                        "Error al guardar", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void Limpiar(String v1, String v2) {
        jtfIdentificacion.setText(v1);
        jtfNombre.setText(v2);
        jtfApellido.setText(v2);
        jtfDescripcionFruta.setText(v2);
        jtfPrecioProducto.setText(v2);
        jtfCantidadDisponible.setText(v2);
        jtfTotal.setText(v2);
        jtfCantidadCompra.setText(v2);
    }

    public void Consultar() {
        if (jtfIdentificacion.getText().trim().isBlank() || jtfDescripcionFruta.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(null, "Faltan Espacios por rellenar");
        } else {
            int indiceEncontrado = 0;
            boolean existeC = false, aparecen = false;
//------------CLIENTE----------------------------------------------------------------------------------------------------------------
            //Buscar en el arreglo
            for (int i = 0; i < Cliente.almacenClientes.length; i++) {
                if (Cliente.almacenClientes[i] == null) {
                    break;
                } else if (Cliente.almacenClientes[i].getIdentificacion() == Integer.parseInt(jtfIdentificacion.getText())) {
                    existeC = true;
                    aparecen = true;
                    n = i;
                    break;
                }
                indiceEncontrado++;
            }
            //Mostrar informacion a usuario
            if (existeC) {
                jtfNombre.setText(Cliente.almacenClientes[indiceEncontrado].getNombre());
                jtfApellido.setText(Cliente.almacenClientes[indiceEncontrado].getApellidos());
                jtfCantidadCompra.setEditable(true);
            } else {
                aparecen = false;
                JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado en el sistema.",
                        "Cliente no encontrado", JOptionPane.ERROR_MESSAGE);
            }
//----------------FRUTAS-------------------------------------------------------------------------------------------------------------
            boolean existeF = false;
            int encontradoF = 0;

            //Secundario Descripcion fruta
            for (int i = 0; i < Frutas.almacenFrutas.size(); i++) {
                if (Frutas.almacenFrutas.get(i).getDescripcion().equals(jtfDescripcionFruta.getText())) {
                    existeF = true;
                    aparecen = true;
                    break;
                }
                encontradoF++;
            }

            if (existeF) {
                jtfCantidadDisponible.setText(String.valueOf(Frutas.almacenFrutas.get(encontradoF).getCantidad()));
                jtfPrecioProducto.setText(String.valueOf(Frutas.almacenFrutas.get(encontradoF).getPrecio()));
            } else {

                JOptionPane.showMessageDialog(null, "La fruta no se encuentra registrada en el sistema.",
                        "Fruta no encontrada", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }

    public void Modificar() {
        DatosArchivos DA = new DatosArchivos();
        DA.setId(M.AInt(JO.Captura("Ingrese el numero de Factura: ")));
        control.modificar(datosarchivos, DA);
    }

    public void Anular() {
        if (jtfIdentificacion.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(null, "No ha ingresado la identificación");
        } else {
            File f = new File("Facturacion.dat");

            DatosArchivos DA = new DatosArchivos();
            DA.setId(M.AInt(JO.Captura("Ingrese el numero de Factura que desea anular: ")));
            control.anular(datosarchivos, DA);

        }
    }

    public void Precio() {
        if (jtfCantidadCompra.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campo Cantidad Compra Vacío");
        } else {
            double precioFinal = 0;
            precioFinal = Double.parseDouble(jtfPrecioProducto.getText()) * Double.parseDouble(jtfCantidadCompra.getText());
            jtfTotal.setText(String.valueOf(precioFinal));

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnConsultar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelarReser = new javax.swing.JButton();
        btnPrecio = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfDescripcionFruta = new javax.swing.JTextField();
        jtfIdentificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfCantidadDisponible = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfCantidadCompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfPrecioProducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnConsultar.setText("Consultar");
        btnConsultar.setFocusable(false);
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnConsultar);

        btnReservar.setText("Reservar");
        btnReservar.setFocusable(false);
        btnReservar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReservar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnReservar);

        btnModificar.setText("Modificar");
        btnModificar.setFocusable(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnModificar);

        btnCancelarReser.setText("Anular Factura");
        btnCancelarReser.setFocusable(false);
        btnCancelarReser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarReser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCancelarReser);

        btnPrecio.setText("Precio");
        btnPrecio.setFocusable(false);
        btnPrecio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrecio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPrecio);

        btnRegresar.setText("Regresar");
        btnRegresar.setFocusable(false);
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRegresar);

        jtfNombre.setEditable(false);

        jtfApellido.setEditable(false);

        jLabel1.setText("Nombre del Cliente:");

        jLabel2.setText("Apellido Cliente:");

        jLabel3.setText("Descripción(Fruta):");

        jLabel4.setText("Ingrese la Identificación del cliente:");

        jLabel5.setText("Cantidad Disponible:");

        jtfCantidadDisponible.setEditable(false);

        jLabel6.setText("Cantidad a Comprar:");

        jLabel7.setText("Precio Producto:");

        jtfPrecioProducto.setEditable(false);

        jLabel8.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(103, 103, 103)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jtfIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jtfCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1))
                            .addGap(69, 69, 69)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfPrecioProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDescripcionFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jtfCantidadCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(49, 49, 49)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDescripcionFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCantidadCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        // TODO add your handling code here:
        Reservar();
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        Consultar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        Modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioActionPerformed
        // TODO add your handling code here:
        Precio();
    }//GEN-LAST:event_btnPrecioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarReser;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPrecio;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCantidadCompra;
    private javax.swing.JTextField jtfCantidadDisponible;
    private javax.swing.JTextField jtfDescripcionFruta;
    private javax.swing.JTextField jtfIdentificacion;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecioProducto;
    private javax.swing.JTextField jtfTotal;
    // End of variables declaration//GEN-END:variables
}
