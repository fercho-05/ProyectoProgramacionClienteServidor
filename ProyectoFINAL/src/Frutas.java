
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @author Fernando
 */
public class Frutas extends javax.swing.JFrame {

    public static ArrayList<DatosFrutas> almacenFrutas = new ArrayList<>();
    DatosFrutas control = new DatosFrutas();

    public Frutas() {
        initComponents();
        setTitle("Frutas");
        setLocationRelativeTo(null);
        Image frutas = new ImageIcon(getClass().getResource("iconos\\frutas.png")).getImage();
        setIconImage(frutas);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField5 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-agregar.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.setToolTipText("Con los datos escritos este botón agregará la fruta");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        jButton2.setText("Editar");
        jButton2.setToolTipText("Con los datos escritos este botón editará la fruta");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estado.png"))); // NOI18N
        jButton3.setText("Inactivar");
        jButton3.setToolTipText("Con la descripción escrita este botón inactivará la fruta");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        jButton4.setText("Consultar");
        jButton4.setToolTipText("Con la descripción/nombre escrita este botón buscará la fruta");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Ingreso de datos");

        jTextField2.setToolTipText("Ingrese la cantidad disponible");

        jLabel6.setText("Temporada");

        jLabel7.setText("Precio");

        jTextField4.setToolTipText("Ingrese su identificación en números");

        jCheckBox1.setText("Activo");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jTextField5.setToolTipText("Ingrese la ciudad de residencia");

        jTextField3.setToolTipText("Ingrese su dirección exacta");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Descripción/Nombre");

        jLabel2.setText("Cantidad");

        jLabel4.setText("Proveedor");

        jLabel11.setText("Estado");

        jTextField1.setToolTipText("Ingrese una descripción o un nombre");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jCheckBox1)))
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        editar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        inactivar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        consultar();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void agregar() {
        try{
            boolean existeProv = false;
            boolean existeTemp = false;
            if (jTextField1.getText().trim().isBlank() || jTextField2.getText().trim().isBlank() || jTextField3.getText().trim().isBlank()
                    || jTextField4.getText().trim().isBlank() || jTextField5.getText().trim().isBlank()) {
                JOptionPane.showMessageDialog(null, "Por favor, llene todas las casillas para poder agregar una fruta.",
                        "Casillas vacías", JOptionPane.ERROR_MESSAGE);
            } else {
                char estado;
                if (jCheckBox1.isSelected()) {
                    estado = 'A';
                } else {
                    estado = 'I';
                }
                DatosFrutas fruta = new DatosFrutas(jTextField1.getText(), Integer.parseInt(jTextField2.getText()), jTextField4.getText(),
                        jTextField5.getText(), Double.parseDouble(jTextField3.getText()), estado);
                //Validar proveedor
                for (int i = 0; i < Proveedores.almacenProveedores.size(); i++) {
                    if (Proveedores.almacenProveedores.get(i).getNombre().equals(fruta.getProveedor())) {
                        existeProv = true;
                        if (Proveedores.almacenProveedores.get(i).getEstado() == 'I') {
                            existeProv = false;
                        }
                        break;
                    }
                }
                //Validar temporada
                for (int i = 0; i < Temporadas.almacenTemporadas.size(); i++) {
                    if (Temporadas.almacenTemporadas.get(i).getDescripcion().equals(fruta.getTemporada())) {
                        existeTemp = true;
                        if (Temporadas.almacenTemporadas.get(i).getEstado() == 'I') {
                            existeTemp = false;
                        }
                        break;
                    }
                }
                if (existeTemp && existeProv) {
                    control.agregar(almacenFrutas, fruta);
                    limpiar();
                }else if (!existeProv){
                    JOptionPane.showMessageDialog(null, "El proveedor ingresado no se encuentra en el sistema o puede estar inactivo.",
                        "Proveedor no encontrado", JOptionPane.ERROR_MESSAGE);
                }else if (!existeTemp){
                    JOptionPane.showMessageDialog(null, "La temporada ingresada no se encuentra en el sistema o puede estar inactiva.",
                        "Temporada no encontrada", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "¡Error! Asegurese de ingresar los datos en el formato correcto.",
                "Error", JOptionPane.WARNING_MESSAGE);
             limpiar();
        }
    }

    public void editar() {
        if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("")
                || jTextField4.getText().equals("") || jTextField5.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todas las casillas para poder editar una fruta.",
                    "Casillas vacías", JOptionPane.ERROR_MESSAGE);
        } else {
            char estado;
            if (jCheckBox1.isSelected()) {
                estado = 'A';
            } else {
                estado = 'I';
            }
            DatosFrutas fruta = new DatosFrutas(jTextField1.getText(), Integer.parseInt(jTextField2.getText()), jTextField4.getText(),
                    jTextField5.getText(), Double.parseDouble(jTextField3.getText()), estado);

            control.editar(almacenFrutas, fruta);
            limpiar();
        }
    }

    public void inactivar() {
        if (jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, llene la casilla Descripción/nombre para poder inactivar una fruta.",
                    "Casillas vacías", JOptionPane.ERROR_MESSAGE);
        } else {
            control.inactivar(almacenFrutas, jTextField1.getText());
            limpiar();
        }
    }

    public void consultar() {
        boolean existe = false;
        int encontrado = 0;
        if (jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, llene la casilla Descripción/nombre para poder buscar una fruta.",
                    "Casillas vacías", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < almacenFrutas.size(); i++) {
                if (almacenFrutas.get(i).getDescripcion().equals(jTextField1.getText())) {
                    existe = true;
                    break;
                }
                encontrado++;
            }

            if (existe) {
                JOptionPane.showMessageDialog(null, "Descripción/Nombre: " + almacenFrutas.get(encontrado).getDescripcion()
                        + "\n" + "Cantidad: " + almacenFrutas.get(encontrado).getCantidad()
                        + "\n" + "Precio: " + almacenFrutas.get(encontrado).getPrecio()
                        + "\n" + "Proveedor: " + almacenFrutas.get(encontrado).getProveedor()
                        + "\n" + "Temporada: " + almacenFrutas.get(encontrado).getTemporada()
                        + "\n" + "Estado(A=Activo/I=Inactivo): " + almacenFrutas.get(encontrado).getEstado(),
                        "Fruta encontrada", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "La fruta no se encuentra registrada en el sistema.",
                        "Fruta no encontrada", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void limpiar() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jCheckBox1.setSelected(false);
        jTextField1.requestFocus();
    }

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
            java.util.logging.Logger.getLogger(Frutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
