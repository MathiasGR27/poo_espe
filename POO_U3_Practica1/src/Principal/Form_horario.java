package Principal;

import Control.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Form_horario extends javax.swing.JInternalFrame {

    Conexion cch= new Conexion();
    Connection conh= cch.conexion();

    public Form_horario() {
        initComponents();
        mostrarDatoshorario();
    }

    public void mostrarDatoshorario(){
        
     String titulos3[]={"Codigolab","NombreLab","HoraEntrada","HoraSalida","Capacidadlab","EncargadoLab"};
     String registrosh[]=new String [6];
     DefaultTableModel modelo3 = new DefaultTableModel(null,titulos3);
     String SQL=" select * from horario"; 
     
     try{
         Statement st=(Statement) conh.createStatement();
         ResultSet rs=st.executeQuery(SQL);
         while(rs.next()){
         registrosh[0]=rs.getString("cod_lab");
         registrosh[1]=rs.getString("nombre_lab");
         registrosh[2]=rs.getString("hora_ingreso");
         registrosh[3]=rs.getString("hora_salida");
         registrosh[4]=rs.getString("capacidad_lab");
         registrosh[5]=rs.getString("ing_encargado");
          modelo3.addRow(registrosh);
     }
         tablahorarios.setModel(modelo3);
     }catch (Exception e ){
         JOptionPane.showMessageDialog(null,"Error al mostrar los datos"+e);
     }
    }
    
    public void limpiarDatos(){
        txtcodigolab.setText("");
        cbonombrelab.setSelectedItem(null); 
        txthoraentrada.setText("");
        txthorasalida.setText("");
        txtcapacidadlab.setText("");
        txtencargadolab.setText("");
    }
    
    public void insertarDatos(){
         try {
            String SQL="insert into horario(codigolab,nombrelab,horaentrada,horasalida,capacidadlab,encargadolab)values(?,?,?,?,?)";
            PreparedStatement pst=(PreparedStatement) conh.prepareStatement(SQL);
            pst.setString(1, txtcodigolab.getText());
            int seleccion2=cbonombrelab.getSelectedIndex();
            pst.setString(2,cbonombrelab.getItemAt(seleccion2));
            pst.setString(3, txthoraentrada.getText());
            pst.setString(4, txthorasalida.getText());
            pst.setString(5,txtcapacidadlab.getText());     
            pst.setString(5,txtencargadolab.getText());    
            //aqui ejecutamos la consulta
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
                 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error de insercion");
        }
    }
    
     public void guardarDatos(){
        try {
        String codigo = txtcodigolab.getText().trim();
        String horaentrada = txthoraentrada.getText().trim();
        String horasalida = txthorasalida.getText().trim();
        String capacidad = txtcapacidadlab.getText().trim();
        String encargado = txtencargadolab.getText().trim();

         if (codigo.isEmpty()|| horaentrada.isEmpty() || horasalida.isEmpty() || capacidad.isEmpty() || encargado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos antes de guardar");
            return;
        }

         String nombrelab = cbonombrelab.getSelectedItem().toString();

        String SQL = "INSERT INTO horario (cod_lab, nombre_lab, hora_ingreso, hora_salida, capacidad_lab, ing_encargado) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst=(PreparedStatement) conh.prepareStatement(SQL);
        pst.setString(1, txtcodigolab.getText());
        int seleccion2=cbonombrelab.getSelectedIndex();
        pst.setString(2,cbonombrelab.getItemAt(seleccion2));
        pst.setString(3, txthoraentrada.getText());
        pst.setString(4, txthorasalida.getText());
        pst.setString(5,txtcapacidadlab.getText());     
        pst.setString(6,txtencargadolab.getText()); 
         //aqui ejecutamos la consulta
        pst.execute();
         JOptionPane.showMessageDialog(null, "Registro exitoso");
        // Limpiamos los campos después de guardar
        limpiarDatos();
        // Mostramos nuevamente los datos actualizados en la tabla
        mostrarDatoshorario();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El valor del promedio debe ser numérico");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al guardar el registro: " + e.getMessage());
    }
    }

     public void eliminarDatos(){
        int filaSeleccionada = tablahorarios.getSelectedRow();
        try {
        String cod_lab = (String) tablahorarios.getValueAt(filaSeleccionada, 0);
        String SQL = "DELETE FROM horario WHERE cod_lab ="+tablahorarios.getValueAt(filaSeleccionada, 0);
        Statement st=(Statement) conh.createStatement();
            int n=st.executeUpdate(SQL);
            if(n>=0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en eliminar registro"+e.getMessage());
        }
    }
     
     public void actualizarDatos(){
           try {
         int filaSeleccionada = tablahorarios.getSelectedRow();
         if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona un registro para actualizar");
            return;
        }

        String cod_lab = (String) tablahorarios.getValueAt(filaSeleccionada, 0);

        String codigo = txtcodigolab.getText().trim();
        String horaentrada = txthoraentrada.getText().trim();
        String horasalida = txthorasalida.getText().trim();
        String capacidad = txtcapacidadlab.getText().trim();
        String encargado = txtencargadolab.getText().trim();

         if (codigo.isEmpty()|| horaentrada.isEmpty() || horasalida.isEmpty() || capacidad.isEmpty() || encargado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos antes de guardar");
            return;
        }

        String nombrelab = cbonombrelab.getSelectedItem().toString();
        
         
        String SQL = "UPDATE horario SET nombre_lab=?,hora_ingreso=?, hora_salida=? , capacidad_lab=?, ing_encargado=? WHERE cod_lab=?";
        
        String dao=(String)tablahorarios.getValueAt(filaSeleccionada,0);
        PreparedStatement pst=(PreparedStatement) conh.prepareStatement(SQL);
        pst.setString(1, nombrelab);
        pst.setString(2, horaentrada);
        pst.setString(4, horasalida);
        pst.setString(3, capacidad);
        pst.setString(5, encargado);
        pst.setString(6, cod_lab);

        // Ejecutamos la consulta
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente el registro");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El valor del promedio debe ser numérico");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error en la actualización: " + e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar3 = new javax.swing.JButton();
        btnNuevo3 = new javax.swing.JButton();
        btnEliminar3 = new javax.swing.JButton();
        btnActualizar3 = new javax.swing.JButton();
        txthoraentrada = new javax.swing.JTextField();
        txthorasalida = new javax.swing.JTextField();
        txtencargadolab = new javax.swing.JTextField();
        cbonombrelab = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtcodigolab = new javax.swing.JTextField();
        txtcapacidadlab = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablahorarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("Horario");

        jLabel2.setText("HoraEntrada");

        jLabel3.setText("NombreLab");

        jLabel4.setText("HoraSalida");

        jLabel5.setText("EncargadoLab");

        btnGuardar3.setText("Guardar");
        btnGuardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar3ActionPerformed(evt);
            }
        });

        btnNuevo3.setText("Nuevo");
        btnNuevo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo3ActionPerformed(evt);
            }
        });

        btnEliminar3.setText("Eliminar");
        btnEliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar3ActionPerformed(evt);
            }
        });

        btnActualizar3.setText("Actualizar");
        btnActualizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar3ActionPerformed(evt);
            }
        });

        cbonombrelab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LABA1", "LABA2", "LABA3" }));
        cbonombrelab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonombrelabActionPerformed(evt);
            }
        });

        jLabel6.setText("codLab");

        jLabel7.setText("CapacidadLab");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnGuardar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addComponent(txtcapacidadlab, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txthoraentrada)
                                    .addComponent(txthorasalida)
                                    .addComponent(txtencargadolab)
                                    .addComponent(txtcodigolab, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbonombrelab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(btnNuevo3)
                    .addContainerGap(264, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtcodigolab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbonombrelab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthoraentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthorasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcapacidadlab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtencargadolab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar3)
                    .addComponent(btnEliminar3)
                    .addComponent(btnActualizar3))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(220, Short.MAX_VALUE)
                    .addComponent(btnNuevo3)
                    .addGap(31, 31, 31)))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        tablahorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablahorarios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar3ActionPerformed
        // TODO add your handling code here:
        guardarDatos();
    }//GEN-LAST:event_btnGuardar3ActionPerformed

    private void btnNuevo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo3ActionPerformed
        // TODO add your handling code here:
        limpiarDatos();
    }//GEN-LAST:event_btnNuevo3ActionPerformed

    private void btnEliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar3ActionPerformed
        // TODO add your handling code here:
        eliminarDatos();
    }//GEN-LAST:event_btnEliminar3ActionPerformed

    private void btnActualizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar3ActionPerformed
        // TODO add your handling code here:
       actualizarDatos();
    }//GEN-LAST:event_btnActualizar3ActionPerformed

    private void cbonombrelabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonombrelabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbonombrelabActionPerformed

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
            java.util.logging.Logger.getLogger(Form_horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_horario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar3;
    private javax.swing.JButton btnEliminar3;
    private javax.swing.JButton btnGuardar3;
    private javax.swing.JButton btnNuevo3;
    private javax.swing.JComboBox<String> cbonombrelab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablahorarios;
    private javax.swing.JTextField txtcapacidadlab;
    private javax.swing.JTextField txtcodigolab;
    private javax.swing.JTextField txtencargadolab;
    private javax.swing.JTextField txthoraentrada;
    private javax.swing.JTextField txthorasalida;
    // End of variables declaration//GEN-END:variables
}
