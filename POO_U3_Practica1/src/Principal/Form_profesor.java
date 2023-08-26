package Principal;

import Control.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Form_profesor extends javax.swing.JInternalFrame {

    Conexion ccp= new Conexion();
    Connection conp= ccp.conexion();

    public Form_profesor() {
        initComponents();
        mostrarDatosprofesores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablap = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        titulop = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardarp = new javax.swing.JButton();
        btnNuevop = new javax.swing.JButton();
        btnEliminarp = new javax.swing.JButton();
        btnActualizarp = new javax.swing.JButton();
        txtApellidop = new javax.swing.JTextField();
        txtNombrep = new javax.swing.JTextField();
        txttitulop = new javax.swing.JTextField();
        cboEstadop = new javax.swing.JComboBox<>();
        txtcedulap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtemailp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        tablap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablap);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("Sistema de Profesores");

        jLabel2.setText("Apellidop");

        jLabel3.setText("emailp");

        jLabel4.setText("Nombrep");

        titulop.setText("titulop");

        jLabel6.setText("Estado");

        btnGuardarp.setText("Guardar");
        btnGuardarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarpActionPerformed(evt);
            }
        });

        btnNuevop.setText("Nuevo");
        btnNuevop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevopActionPerformed(evt);
            }
        });

        btnEliminarp.setText("Eliminar");
        btnEliminarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarpActionPerformed(evt);
            }
        });

        btnActualizarp.setText("Actualizar");
        btnActualizarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarpActionPerformed(evt);
            }
        });

        cboEstadop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        jLabel5.setText("cedulap");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(titulop)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtApellidop)
                                        .addComponent(txttitulop)
                                        .addComponent(cboEstadop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcedulap)
                                        .addComponent(txtemailp))
                                    .addComponent(txtNombrep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnGuardarp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(btnNuevop)
                    .addContainerGap(264, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcedulap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtemailp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulop)
                    .addComponent(txttitulop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboEstadop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarp)
                    .addComponent(btnEliminarp)
                    .addComponent(btnActualizarp))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(220, Short.MAX_VALUE)
                    .addComponent(btnNuevop)
                    .addGap(31, 31, 31)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void mostrarDatosprofesores(){
        
     String titulos1[]={"Cedula","Nombres","Apellidos","email","titulo","Estado"};
     String registrosp[]=new String [6];
     DefaultTableModel modelo2 = new DefaultTableModel(null,titulos1);
     String SQL=" select * from profesores"; 
     
     try{
         Statement st=(Statement) conp.createStatement();
         ResultSet rs=st.executeQuery(SQL);
         while(rs.next()){
         registrosp[0]=rs.getString("cedula_p");
         registrosp[1]=rs.getString("nombre_p");
         registrosp[2]=rs.getString("apellido_p");
         registrosp[3]=rs.getString("titulo_p");
         registrosp[4]=rs.getString("email_p");
         registrosp[5]=rs.getString("estado_p");
          modelo2.addRow(registrosp);
     }
         tablap.setModel(modelo2);
     }catch (Exception e ){
         JOptionPane.showMessageDialog(null,"Error al mostrar los datos"+e);
     }
     
    }
    
    public void limpiarDatos(){
        txtcedulap.setText("");
        txtNombrep.setText("");
        txtApellidop.setText("");
        txtemailp.setText("");
        txttitulop.setText(""); 
        cboEstadop.setSelectedItem(null);   
    }
    
   public void insertarDatos(){
        try {
            String SQL="insert into estudiantes(cedulap,nombrep,apellidop,emailp,titulop,estadop)values(?,?,?,?,?)";
            PreparedStatement pst=(PreparedStatement) conp.prepareStatement(SQL);
            pst.setString(1, txtcedulap.getText());
            pst.setString(2, txtNombrep.getText());
            pst.setString(3, txtApellidop.getText());
            pst.setString(4, txtemailp.getText());
            pst.setString(5,txttitulop.getText());     
            int seleccion2=cboEstadop.getSelectedIndex();
            pst.setString(6,cboEstadop.getItemAt(seleccion2));
            //aqui ejecutamos la consulta
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
                 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error de insercion");
        }
    }
   
   public void guardarDatos(){
       try {
        String cedula = txtcedulap.getText().trim();
        String nombre = txtNombrep.getText().trim();
        String apellido = txtApellidop.getText().trim();
        String email = txtemailp.getText().trim();
        String titulo = txttitulop.getText().trim();

        if (cedula.isEmpty()|| nombre.isEmpty() || apellido.isEmpty() || email.isEmpty() || titulo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos antes de guardar");
            return;
        }

        String estado = cboEstadop.getSelectedItem().toString();

        String SQL = "INSERT INTO profesores (cedula_p, nombre_p, apellido_p, titulo_p, email_p, estado_p) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst=(PreparedStatement) conp.prepareStatement(SQL);
        pst.setString(1, txtcedulap.getText());
        pst.setString(2, txtNombrep.getText());
        pst.setString(3, txtApellidop.getText());
        pst.setString(4, txtemailp.getText());
        pst.setString(5,txttitulop.getText());     
        int seleccion2=cboEstadop.getSelectedIndex();
        pst.setString(6,cboEstadop.getItemAt(seleccion2));
         //aqui ejecutamos la consulta
        pst.execute();
         JOptionPane.showMessageDialog(null, "Registro exitoso");
        // Limpiamos los campos después de guardar
        limpiarDatos();
        // Mostramos nuevamente los datos actualizados en la tabla
        mostrarDatosprofesores();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El valor del promedio debe ser numérico");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al guardar el registro: " + e.getMessage());
    }
   }
    
     public void eliminarDatos(){
         int filaSeleccionada = tablap.getSelectedRow();
        try {
        String cedulpa_p = (String) tablap.getValueAt(filaSeleccionada, 0);
        String SQL = "DELETE FROM profesores WHERE cedula_p ="+tablap.getValueAt(filaSeleccionada, 0);
        Statement st=(Statement) conp.createStatement();
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
         int filaSeleccionada = tablap.getSelectedRow();
         if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona un registro para actualizar");
            return;
        }

        String cedula_p = (String) tablap.getValueAt(filaSeleccionada, 0);

        String cedula = txtcedulap.getText().trim();
        String nombre = txtNombrep.getText().trim();
        String apellido = txtApellidop.getText().trim();
        String email = txtemailp.getText().trim();
        String titulo = txttitulop.getText().trim();

         if (cedula.isEmpty()|| nombre.isEmpty() || apellido.isEmpty() || email.isEmpty() || titulo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos antes de guardar");
            return;
        }

        String estado = cboEstadop.getSelectedItem().toString();
        
         
        String SQL = "UPDATE profesores SET nombre_p=?,apellido_p=?, email_p=? , titulo_p=?, estado_p=? WHERE cedula_p=?";
        
        String dao=(String)tablap.getValueAt(filaSeleccionada,0);
        PreparedStatement pst=(PreparedStatement) conp.prepareStatement(SQL);
        pst.setString(1, nombre);
        pst.setString(2, apellido);
        pst.setString(4, email);
        pst.setString(3, titulo);
        pst.setString(5, estado);
        pst.setString(6, cedula_p);

        // Ejecutamos la consulta
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente el registro");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El valor del promedio debe ser numérico");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error en la actualización: " + e.getMessage());
    } 
    }
    private void btnGuardarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarpActionPerformed
        guardarDatos();        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarpActionPerformed

    private void btnNuevopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevopActionPerformed
        // TODO add your handling code here:
       limpiarDatos();
    }//GEN-LAST:event_btnNuevopActionPerformed

    private void btnEliminarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarpActionPerformed
        // TODO add your handling code here:
        eliminarDatos();
    }//GEN-LAST:event_btnEliminarpActionPerformed

    private void btnActualizarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarpActionPerformed
        // TODO add your handling code here:
      actualizarDatos();
    }//GEN-LAST:event_btnActualizarpActionPerformed

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
            java.util.logging.Logger.getLogger(Form_profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_profesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarp;
    private javax.swing.JButton btnEliminarp;
    private javax.swing.JButton btnGuardarp;
    private javax.swing.JButton btnNuevop;
    private javax.swing.JComboBox<String> cboEstadop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablap;
    private javax.swing.JLabel titulop;
    private javax.swing.JTextField txtApellidop;
    private javax.swing.JTextField txtNombrep;
    private javax.swing.JTextField txtcedulap;
    private javax.swing.JTextField txtemailp;
    private javax.swing.JTextField txttitulop;
    // End of variables declaration//GEN-END:variables
}
