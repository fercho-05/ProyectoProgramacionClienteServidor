
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Empleado extends javax.swing.JFrame {
    DatosEmpleado almacenEmpleados[] = new DatosEmpleado[20];
    
    public Empleado() {
        initComponents();
        setTitle("Empleados");
        setLocationRelativeTo(null);
        Image empleados = new ImageIcon(getClass().getResource("iconos\\coordinador.png")).getImage();
        setIconImage(empleados);
        setResizable(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        tfnombre = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        tfUsuario = new javax.swing.JTextField();
        jCheckBoxActivo = new javax.swing.JCheckBox();
        jToolBar1 = new javax.swing.JToolBar();
        btnConsultar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelNombre.setText("Nombre");

        jLabelApellido.setText("Apellidos");

        jLabelUsuario.setText("Usuario");

        tfnombre.setToolTipText("Ingrese su nombre");
        tfnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfnombreFocusGained(evt);
            }
        });
        tfnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnombreActionPerformed(evt);
            }
        });

        tfApellido.setToolTipText("Ingrese sus apellidos");
        tfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoActionPerformed(evt);
            }
        });

        tfUsuario.setToolTipText("Cree un usuario");
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });

        jCheckBoxActivo.setText("Activo");

        jToolBar1.setRollover(true);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        btnConsultar.setText("Agregar");
        btnConsultar.setToolTipText("Con los datos escritos este botón agregará al empleado");
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnConsultar);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnAgregar.setText("Consultar");
        btnAgregar.setToolTipText("Con el usuario escrito este botón buscará al empleado");
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAgregar);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estado.png"))); // NOI18N
        jButton1.setText("Inactivar");
        jButton1.setToolTipText("Con el usuario escrito este botón inactivará al empleado");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Ingreso de datos");

        jLabel2.setText("Contraseña");

        jTextField1.setToolTipText("Cree una contraseña");

        jLabel11.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxActivo)
                            .addComponent(jLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabelNombre)
                                    .addGap(104, 104, 104))
                                .addComponent(jLabelApellido)
                                .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfnombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelApellido)
                        .addGap(3, 3, 3)
                        .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jLabelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxActivo)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        agregar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        consultar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tfnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnombreActionPerformed

    private void tfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidoActionPerformed

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
  
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inactivar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfnombreFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnombreFocusGained

    public void agregar() {   //Se pueden separar funciones en metodos como BuscarIndice o Validar si existe
        boolean existe = false; //Para verificar que no se repita
        //Se puede agregar una validacion extra para que el usuario no se repita y agregar excepciones (todos los metodos)
        if (tfnombre.getText().equals("") || tfApellido.getText().equals("") || tfUsuario.getText().equals(""))  {
            JOptionPane.showMessageDialog(null, "Por favor, llene todas las casillas para poder agregar un empleado.",
                    "Casillas vacías", JOptionPane.ERROR_MESSAGE);
        }else{
            //Encontrar espacio vacio en el arreglo
            int indiceVacio = 0;
            for (int i = 0; i < almacenEmpleados.length; i++) {
                if (almacenEmpleados[i] == null) {
                    indiceVacio = i;
                    break;
                }
            }
            //Llenar espacio vacio del arreglo validando que no se repita el cliente por medio de usuario(Imposible que se tengan dos iguales)
            for (int i = 0; i < almacenEmpleados.length; i++) {
                if (almacenEmpleados[i] == null) {
                    break;
                }else if(almacenEmpleados[i].getUsuario().equals(tfUsuario.getText())){
                    existe = true;
                }
            }
            
            if (existe) {
                JOptionPane.showMessageDialog(null, "El empleado ya se encuentra registrado en el sistema."+"\n"+"Ingrese datos diferentes.",
                        "Empleado encontrado", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            }else{
                char estado;
                if (jCheckBoxActivo.isSelected()) {
                        estado = 'A';
                    } else {
                        estado = 'I';
                    }
                almacenEmpleados[indiceVacio] = new DatosEmpleado(tfnombre.getText(),tfApellido.getText(),tfUsuario.getText(), 
                        jTextField1.getText(), estado);
                JOptionPane.showMessageDialog(null, "Los datos se han agregado correctamente.",
                            "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            }
        }
    }

    public void consultar() {
        int indiceEncontrado = 0;
        if (tfUsuario.getText().equals(""))  {
            JOptionPane.showMessageDialog(null, "Por favor, llene la casilla Usuario para poder buscar un empleado.",
                    "Casilla vacía", JOptionPane.ERROR_MESSAGE);
        }else{
            boolean encontrado = false;
            for (int i = 0; i < almacenEmpleados.length; i++) {
                if (almacenEmpleados[i] == null) {
                    break;
                }else if (almacenEmpleados[i].getUsuario().equals(tfUsuario.getText())) {
                    encontrado = true;
                    break;
                }
                indiceEncontrado ++;
            }
            //Mostrar informacion a usuario
            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Nombre: "+almacenEmpleados[indiceEncontrado].getNombre()
                        +"\n"+"Apellidos: "+almacenEmpleados[indiceEncontrado].getApellidos()
                        +"\n"+"Usuario: "+almacenEmpleados[indiceEncontrado].getUsuario()
                        +"\n"+"Contraseña: "+almacenEmpleados[indiceEncontrado].getContraseña()
                        +"\n"+"Estado(A=Activo/I=Inactivo): "+almacenEmpleados[indiceEncontrado].getEstado(),
                        "Empleado encontrado", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "El empleado no se encuentra registrado en el sistema.",
                        "Empleado no encontrado", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void inactivar(){
        boolean encontrado = false;
        
        if (tfUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, llene la casilla Usuario para poder inactivar un empleado.",
                    "Casilla vacía", JOptionPane.ERROR_MESSAGE);
        }else{
            for (int i = 0; i < almacenEmpleados.length; i++) {
                if (almacenEmpleados[i] == null) {
                    break;
                }else if(almacenEmpleados[i].getUsuario().equals(tfUsuario.getText())){
                    if (almacenEmpleados[i].getEstado() == 'A') {
                        almacenEmpleados[i].setEstado('I');
                        JOptionPane.showMessageDialog(null, "Empleado inactivado con éxito.",
                            "Empleado inactivado", JOptionPane.INFORMATION_MESSAGE);
                        encontrado = true;
                        limpiar();
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "El empleado ya se encuentra inactivo.",
                            "Empleado inactivo", JOptionPane.ERROR_MESSAGE);
                        encontrado = true;
                        limpiar();
                        break;
                    }
                }    
            }
            
            if (!encontrado) {
            JOptionPane.showMessageDialog(null, "El empleado no se encuentra registrado en el sistema.",
                "Empleado no encontrado", JOptionPane.ERROR_MESSAGE);
            }
        }   
    }
    
    public void limpiar() {
        tfnombre.setText("");
        tfApellido.setText("");
        tfUsuario.setText("");
        jCheckBoxActivo.setSelected(false);
        tfnombre.requestFocus();
    }

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfUsuario;
    private javax.swing.JTextField tfnombre;
    // End of variables declaration//GEN-END:variables
}
