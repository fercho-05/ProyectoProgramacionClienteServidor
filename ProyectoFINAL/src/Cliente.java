



import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Cliente extends javax.swing.JFrame {
    static DatosClientes almacenClientes[] = new DatosClientes[50];
    
    public Cliente() {
        initComponents();
        setTitle("Clientes");
        setLocationRelativeTo(null);
        Image clientes = new ImageIcon(getClass().getResource("iconos\\clasificacion.png")).getImage();
        setIconImage(clientes);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jToolBar1 = new javax.swing.JToolBar();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos");

        jTextField1.setToolTipText("Ingrese su nombre");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setToolTipText("Ingrese sus apellidos");

        jLabel3.setText("Usuario");

        jTextField3.setToolTipText("Ingrese su identificación en números");

        jCheckBox1.setText("Activo");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("Con los datos escritos este botón agregará al cliente");
        btnAgregar.setFocusable(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAgregar);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setToolTipText("Con la identificación escrita este botón buscará al cliente");
        btnConsultar.setFocusable(false);
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnConsultar);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        jButton1.setText("Editar");
        jButton1.setToolTipText("Con los datos escritos este botón editará al cliente");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estado.png"))); // NOI18N
        jButton2.setText("Inactivar");
        jButton2.setToolTipText("Con la identificación escrita este botón inactivará al cliente");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jLabel4.setText("Identificación");

        jLabel5.setText("Contraseña");

        jLabel6.setText("Ciudad");

        jLabel7.setText("Dirección");

        jLabel8.setText("Teléfono");

        jLabel9.setText("Correo electrónico");

        jTextField4.setToolTipText("Ingrese la ciudad de residencia");

        jTextField5.setToolTipText("Ingrese su dirección exacta");

        jTextField6.setToolTipText("Ingrese su teléfono en números");

        jTextField7.setToolTipText("Ingrese su correo electrónico");

        jLabel11.setText("Estado");

        jTextField8.setToolTipText("Cree un usuario");

        jTextField9.setToolTipText("Cree una contraseña");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Ingreso de datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel4))
                            .addGap(122, 122, 122)))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(56, 56, 56))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(7, 7, 7)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        inactivar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        editar();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void agregar() { 
        try{
            boolean existe = false; //Para verificar que no se repita
            boolean existeUser = false;
            if (jTextField1.getText().equals("") || jTextField2.getText().equals("")  || jTextField3.getText().equals("")  
                    || jTextField4.getText().equals("")  || jTextField5.getText().equals("")  || jTextField6.getText().equals("") 
                    || jTextField7.getText().equals("")  || jTextField8.getText().equals("")  || jTextField9.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor, llene todas las casillas para poder agregar un cliente.",
                        "Casillas vacías", JOptionPane.ERROR_MESSAGE);
            }else{
                //Encontrar espacio vacio en el arreglo
                int indiceVacio = 0;
                for (int i = 0; i < almacenClientes.length; i++) {
                    if (almacenClientes[i] == null) {
                        indiceVacio = i;
                        break;
                    }
                }
                //Llenar espacio vacio del arreglo validando que no se repita el cliente por medio de identificacion(Imposible que se tengan dos iguales)
                for (int i = 0; i < almacenClientes.length; i++) {
                    if (almacenClientes[i] == null) {
                        break;
                    }else if(almacenClientes[i].getIdentificacion() == Integer.parseInt(jTextField3.getText())){
                        existe = true;
                    }
                }
                //Validar que no se repita el usuario. Se hace por separado para una mejor comprension
                for (int i = 0; i < almacenClientes.length; i++) {
                    if (almacenClientes[i] == null) {
                        break;
                    }else if(almacenClientes[i].getUsuario().equals(jTextField8.getText())){
                        existeUser = true;
                    }
                }

                if (existe) {
                    JOptionPane.showMessageDialog(null, "El cliente ya se encuentra registrado en el sistema."+"\n"+"Ingrese datos diferentes.",
                            "Cliente encontrado", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                }else{
                    if (existeUser) {
                        JOptionPane.showMessageDialog(null, "El usuario ya se encuentra registrado en el sistema."
                                +"\n"+"Ingrese un usuario diferente.",
                            "Usuario repetido", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        char estado;
                        if (jCheckBox1.isSelected()) {
                                estado = 'A';
                            } else {
                                estado = 'I';
                            }
                        almacenClientes[indiceVacio] = new DatosClientes(jTextField1.getText(),jTextField2.getText(),
                        Integer.parseInt(jTextField3.getText()), jTextField4.getText(), jTextField5.getText(),Integer.parseInt(jTextField6.getText()),
                        jTextField7.getText(), jTextField8.getText(), jTextField9.getText(), estado);

                        JOptionPane.showMessageDialog(null, "Los datos se han agregado correctamente.",
                                    "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                    }
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "¡Error! Asegurese de ingresar los datos en el formato correcto.",
                "Error", JOptionPane.WARNING_MESSAGE);
             limpiar();
        }
    }
    
    public void consultar() {
        int indiceEncontrado = 0;
        if (jTextField3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, llene la casilla Identificación para poder buscar un cliente.",
                    "Casilla vacía", JOptionPane.ERROR_MESSAGE);
        }else{
            //Buscar en el arreglo
            boolean encontrado = false;
            for (int i = 0; i < almacenClientes.length; i++) {
                if (almacenClientes[i] == null) {
                    break;
                }else if (almacenClientes[i].getIdentificacion() == Integer.parseInt(jTextField3.getText())) {
                    encontrado = true;
                    break;
                }
                indiceEncontrado ++;
            }
            //Mostrar informacion a usuario
            if (encontrado) {
                JOptionPane.showMessageDialog(null,"Nombre: "+ almacenClientes[indiceEncontrado].getNombre()
                        +"\n"+"Apellidos: "+almacenClientes[indiceEncontrado].getApellidos()
                        +"\n"+"Identificación: "+almacenClientes[indiceEncontrado].getIdentificacion()
                        +"\n"+"Ciudad: "+almacenClientes[indiceEncontrado].getCiudad()
                        +"\n"+"Dirección: "+almacenClientes[indiceEncontrado].getDireccion()
                        +"\n"+"Teléfono: "+almacenClientes[indiceEncontrado].getTelefono()
                        +"\n"+"Correo: "+almacenClientes[indiceEncontrado].getCorreo()
                        +"\n"+"Usuario: "+almacenClientes[indiceEncontrado].getUsuario()
                        +"\n"+"Contraseña: "+almacenClientes[indiceEncontrado].getContraseña()
                        +"\n"+"Estado(A=Activo/I=Inactivo): "+almacenClientes[indiceEncontrado].getEstado(),
                        "Cliente encontrado", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado en el sistema.",
                        "Cliente no encontrado", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void editar(){
        //Se puede variar la cantidad de casillas necesarias para editar informacion, de momento se solicitan todas
        boolean encontrado = false;
        
        if (jTextField1.getText().equals("") || jTextField2.getText().equals("")  || jTextField3.getText().equals("")  
                || jTextField4.getText().equals("")  || jTextField5.getText().equals("")  || jTextField6.getText().equals("") 
                || jTextField7.getText().equals("")  || jTextField8.getText().equals("")  || jTextField9.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todas las casillas para poder editar un cliente.",
                    "Casillas vacías", JOptionPane.ERROR_MESSAGE);
        }else{
            for (int i = 0; i < almacenClientes.length; i++) {
                if (almacenClientes[i] == null) {
                    break;
                }else if (almacenClientes[i].getIdentificacion() == Integer.parseInt(jTextField3.getText())){
                    char estado;
                    if (jCheckBox1.isSelected()) {
                        estado = 'A';
                    }else {
                        estado = 'I';
                    }
                    almacenClientes[i].setNombre(jTextField1.getText());
                    almacenClientes[i].setApellidos(jTextField2.getText());
                    almacenClientes[i].setCiudad(jTextField4.getText());
                    almacenClientes[i].setDireccion(jTextField5.getText());
                    almacenClientes[i].setTelefono(Integer.parseInt(jTextField6.getText()));
                    almacenClientes[i].setCorreo(jTextField7.getText());
                    almacenClientes[i].setUsuario(jTextField8.getText());
                    almacenClientes[i].setContraseña(jTextField9.getText());
                    almacenClientes[i].setEstado(estado);
                    
                    JOptionPane.showMessageDialog(null, "Cliente editado con éxito.",
                            "Cliente editado", JOptionPane.INFORMATION_MESSAGE);
                    encontrado = true;
                    limpiar();
                    break;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "No se ha encontrado al cliente."+"\n"
                    +"Asegurese de escribir la identificación correcta y que el cliente ya esté registrado."+"\n"
                    +"Recuerde, la identificación no se puede modificar.", "Cliente no encontrado",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void inactivar(){
        boolean encontrado = false;
        
        if (jTextField3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, llene la casilla Identificación para poder inactivar un cliente.",
                    "Casilla vacía", JOptionPane.ERROR_MESSAGE);
        }else{
            for (int i = 0; i < almacenClientes.length; i++) {
                if (almacenClientes[i] == null) {
                    break;
                }else if(almacenClientes[i].getIdentificacion() == Integer.parseInt(jTextField3.getText())){
                    if (almacenClientes[i].getEstado() == 'A') {
                        almacenClientes[i].setEstado('I');
                        JOptionPane.showMessageDialog(null, "Cliente inactivado con éxito.",
                            "Cliente inactivado", JOptionPane.INFORMATION_MESSAGE);
                        encontrado = true;
                        limpiar();
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "El cliente ya se encuentra inactivo.",
                            "Cliente inactivo", JOptionPane.ERROR_MESSAGE);
                        encontrado = true;
                        limpiar();
                        break;
                    }
                }    
            } 
            if (!encontrado) {
            JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado en el sistema.",
                "Cliente no encontrado", JOptionPane.ERROR_MESSAGE);
            }
        }   
    }

    public void limpiar() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jCheckBox1.setSelected(false);
        jTextField1.requestFocus();
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
