/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VistaEvaLab3;

import Control.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.lang.String;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author ESPE
 */
public class Exam_profesor extends JFrame {
    
    private Conexion conexionExam; 
    private JTextField cajaTextocedulap;
    private JTextField cajaTextonombrep;
    private JTextField cajaTextoapellidop;
    private JTextField cajaTextotitulop;
    private JTextField cajaTextoemailp;
    private JComboBox<String> cajaboxestadop;
    private JTextArea textarea1;
    private JTable tabla;
    private DefaultTableModel tableModel;
    private JTable table;  // Agrega esta variable
    private JButton botonact;
    private Workbook libro;
    private Sheet hoja;
    private int filaIndex = 1; 
    //Creamos una ventana grafica con Jframe
 public JPanel panel;
 
    public Exam_profesor(){ 
     /*JMenuBar menuBar = MenuLab2Eva2.crearMenu();
     setJMenuBar(menuBar);*/   
    conexionExam = new Conexion();
    this.setSize(1300,700);
    setTitle(" EXAMEN U3 ");
    //PARA QUE SE CIERRE EL SISTEMA
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    //CENTRAR LA VENTANA
    //setBounds(500,200,500,500);
    setLocationRelativeTo(null);
    iniciarcomponentes();
    // Verificar si el archivo Excel ya existe
        File archivoExcel = new File("Datos_Profesores.xlsx");
        if (archivoExcel.exists()) {
            // Si el archivo existe, ábrelo para edición
            try (FileInputStream fis = new FileInputStream(archivoExcel)) {
                libro = new XSSFWorkbook(fis);
                hoja = libro.getSheetAt(0); // Obtén la primera hoja
                
                int lastRowNum = hoja.getLastRowNum();
                filaIndex = lastRowNum + 1;
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Si el archivo no existe, crea uno nuevo y agrega los encabezados
            libro = new XSSFWorkbook();
            hoja = libro.createSheet("Datos_Profesores");
            
            // Crear la primera fila con los encabezados de las columnas
            Row filaEncabezados = hoja.createRow(0);
            String[] encabezados = { "Cedula_Prof", "Nombre_Prof", "Apellido_Prof", "Titulo_Prof", "Email_Prof", "Estado_Prof" };
            for (int i = 0; i < encabezados.length; i++) {
                Cell celdaEncabezado = filaEncabezados.createCell(i);
                celdaEncabezado.setCellValue(encabezados[i]);
            }
        }
    }

    public void iniciarcomponentes(){
        colocarPanel();
        ColocarEtiquetas();
        ColocarBotones();
        ColocarCajaTexto();
        Colocarcombobox();
        colocarTabla();
        ColocarcajaTextArea();
    }
    
    public void colocarPanel(){
        panel= new JPanel();
        //dar color al panel
        panel.setBackground(Color.YELLOW);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }
    
    public void ColocarEtiquetas(){
        JLabel labelp = new JLabel("EXAMEN U3",SwingConstants.CENTER);
        panel.add(labelp);
        panel.setLayout(null);
        labelp.setBounds(100, 10, 350, 50);
        labelp.setForeground(Color.WHITE);//Letra
        labelp.setBackground(Color.BLACK);//Cuadro
        labelp.setOpaque(true);
        
        JLabel label2p =new JLabel();
        label2p.setText("Cedula_Prof : ");
        panel.add(label2p);
        //Ubicar
        label2p.setHorizontalAlignment(HEIGHT);
        //Fuente
        label2p.setForeground(Color.BLACK);
        label2p.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label2p.setBounds(30, 60, 200, 50);
        
        JLabel label3p =new JLabel();
        label3p.setText("Nombre_Prof : ");
        panel.add(label3p);
        //Ubicar
        label3p.setHorizontalAlignment(HEIGHT);
        //Fuente
        label3p.setForeground(Color.BLACK);
        label3p.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label3p.setBounds(30, 125, 200, 50);
        
        JLabel label4p =new JLabel();
        label4p.setText("Apellido_Prof : ");
        panel.add(label4p);
        //Ubicar
        label4p.setHorizontalAlignment(HEIGHT);
        //Fuente
        label4p.setForeground(Color.BLACK);
        label4p.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label4p.setBounds(30, 200, 200, 50);
        
        JLabel label5p =new JLabel();
        label5p.setText("Titulo_Prof : ");
        panel.add(label5p);
        //Ubicar
        label5p.setHorizontalAlignment(HEIGHT);
        //Fuente
        label5p.setForeground(Color.BLACK);
        label5p.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label5p.setBounds(30, 280, 200, 50);
        
        JLabel label6p =new JLabel();
        label6p.setText("Email_Prof : ");
        panel.add(label6p);
        //Ubicar
        label6p.setHorizontalAlignment(HEIGHT);
        //Fuente
        label6p.setForeground(Color.BLACK);
        label6p.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label6p.setBounds(30, 340, 200, 50);
        
        JLabel label7p =new JLabel();
        label7p.setText("Estado_Prof : ");
        panel.add(label7p);
        //Ubicar
        label7p.setHorizontalAlignment(HEIGHT);
        //Fuente
        label7p.setForeground(Color.BLACK);
        label7p.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label7p.setBounds(30, 420, 200, 50);
       
   
}
    public void ColocarBotones(){
        
        JButton boton1p=new JButton("Nuevo");
        ImageIcon nuevo=new ImageIcon("Nuevo.PNG");
        boton1p.setBounds(30, 500, 100, 50);
        panel.add(boton1p);
        boton1p.setEnabled(true);
        boton1p.setMnemonic('a');
        boton1p.setIcon(new ImageIcon(nuevo.getImage().getScaledInstance(boton1p.getWidth(),boton1p.getHeight(),Image.SCALE_SMOOTH)));
        boton1p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cajaTextocedulap.setText("");
                cajaTextonombrep.setText("");
                cajaTextoapellidop.setText("");
                cajaTextotitulop.setText("");
                cajaTextoemailp.setText("");
                cajaboxestadop.setSelectedIndex(0);
                textarea1.setText("");
                
            }
        });
        
        JButton boton2p=new JButton("Guardar");
        ImageIcon guardar=new ImageIcon("Guardar.PNG");
        boton2p.setBounds(150, 500, 100, 50);
        panel.add(boton2p);
        boton2p.setEnabled(true);
        boton2p.setMnemonic('e');
        boton2p.setIcon(new ImageIcon(guardar.getImage().getScaledInstance(boton2p.getWidth(),boton2p.getHeight(),Image.SCALE_SMOOTH)));
        boton2p.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String cedula = cajaTextocedulap.getText();
        String nombre = cajaTextonombrep.getText();
        String apellido = cajaTextoapellidop.getText();
        String titulo = cajaTextotitulop.getText();
        String mail = cajaTextoemailp.getText();
        String estado = cajaboxestadop.getSelectedItem().toString(); 
        
        String[] rowData = { cedula, apellido, nombre,titulo, mail, estado};
        tableModel.addRow(rowData);
        agregarDatos( cedula, apellido, nombre,titulo,mail, estado);

        Row fila = hoja.createRow(filaIndex);
        Cell celda = fila.createCell(0);
        celda.setCellValue(cedula);
        celda = fila.createCell(1);
        celda.setCellValue(nombre);
        celda = fila.createCell(2);
        celda.setCellValue(apellido);
        celda = fila.createCell(3);
        celda.setCellValue(mail);
        celda = fila.createCell(4);
        celda.setCellValue(titulo);
        celda = fila.createCell(5);
        celda.setCellValue(estado);

        filaIndex++;

        // Guardar el archivo de Excel
        try {
            FileOutputStream archivoSalida = new FileOutputStream("Datos_Pofesores.xlsx");
            libro.write(archivoSalida);
            archivoSalida.close();
            
            JOptionPane.showMessageDialog(null, "Datos guardados en Excel");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos en Excel: " + ex.getMessage());
        }
    }
});
       
        JButton boton3p=new JButton("Actualizar");
        ImageIcon actualizar=new ImageIcon("Actualizar.PNG");
        boton3p.setBounds(270, 500, 100, 50);
        panel.add(boton3p);
        boton3p.setEnabled(true);
        boton3p.setMnemonic('r');
        boton3p.setIcon(new ImageIcon(actualizar.getImage().getScaledInstance(boton3p.getWidth(),boton3p.getHeight(),Image.SCALE_SMOOTH)));
        boton3p.addActionListener(new ActionListener() {
            @Override
    public void actionPerformed(ActionEvent e) {
        int filaSeleccionada = table.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila para editar.");
        } else {
            // Obtener valores de la fila seleccionada
            String codigo = (String) table.getValueAt(filaSeleccionada, 0);
            String cedula = (String) table.getValueAt(filaSeleccionada, 1);

            // Actualizar los valores con los datos editados en los campos de texto
            table.setValueAt(cajaTextocedulap.getText(), filaSeleccionada, 0);
            table.setValueAt(cajaTextonombrep.getText(), filaSeleccionada, 1);
            table.setValueAt(cajaTextoapellidop.getText(), filaSeleccionada, 2);
            table.setValueAt(cajaTextoemailp.getText(), filaSeleccionada, 3);
            table.setValueAt(cajaTextotitulop.getText(), filaSeleccionada, 4);
            table.setValueAt(cajaboxestadop.getSelectedItem(), filaSeleccionada, 5);

            // Actualizar los datos en la hoja de Excel
            Row fila = hoja.getRow(filaSeleccionada + 1); // +1 para omitir la fila de encabezado
            if (fila != null) {
                fila.getCell(0).setCellValue(cajaTextocedulap.getText());
                fila.getCell(1).setCellValue(cajaTextonombrep.getText());
                fila.getCell(3).setCellValue(cajaTextoapellidop.getText());
                fila.getCell(3).setCellValue(cajaTextoemailp.getText());
                fila.getCell(4).setCellValue(cajaTextotitulop.getText());
                fila.getCell(5).setCellValue((String) cajaboxestadop.getSelectedItem());
            }

            try {
                FileOutputStream archivoSalida = new FileOutputStream("Datos_Estudiantes.xlsx");
                libro.write(archivoSalida);
                archivoSalida.close();

                JOptionPane.showMessageDialog(null, "Datos actualizados y guardados en Excel");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar los datos en Excel: " + ex.getMessage());
            }
        }
    }
});
    
      
        JButton boton4p=new JButton("Eliminar");
        ImageIcon eliminar=new ImageIcon("Eliminar.JPG");
         boton4p.setBounds(390, 500, 100, 50);
        panel.add(boton4p);
        boton4p.setEnabled(true);
        boton4p.setMnemonic('f');
        boton4p.setIcon(new ImageIcon(eliminar.getImage().getScaledInstance(boton4p.getWidth(),boton4p.getHeight(),Image.SCALE_SMOOTH)));
        boton4p.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int filaSeleccionada = table.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar.");
    } else {
        String cedula = (String) table.getValueAt(filaSeleccionada, 0); // Columna de la cédula

        // Eliminar fila de la base de datos
        eliminarDatos(cedula);

        // Eliminar fila de la tabla en la interfaz
        tableModel.removeRow(filaSeleccionada);
    }
    }
});
        
        JButton boton5p=new JButton("Salir");
        ImageIcon salir=new ImageIcon("Salir.PNG");
        boton5p.setBounds(520, 500, 100, 50);
        panel.add(boton5p);
        boton5p.setEnabled(true);
        boton5p.setMnemonic('t');
        boton5p.setIcon(new ImageIcon(salir.getImage().getScaledInstance(boton5p.getWidth(),boton5p.getHeight(),Image.SCALE_SMOOTH)));  
        boton5p.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Cerrar la ventana y terminar el programa
        dispose(); // Cierra la ventana actual
        System.exit(0); // Finaliza el programa
    }
});
    }
    
    public void ColocarCajaTexto(){
        
    cajaTextocedulap=new JTextField();
    cajaTextocedulap.setBounds(160, 70, 250, 30);
    panel.add(cajaTextocedulap);
    cajaTextocedulap.setText("");
    
    cajaTextonombrep=new JTextField();
    cajaTextonombrep.setBounds(160, 130, 250, 30);
    panel.add(cajaTextonombrep);
    cajaTextonombrep.setText("");
    
    cajaTextoapellidop=new JTextField();
    cajaTextoapellidop.setBounds(160, 205, 250, 30);
    panel.add(cajaTextoapellidop);
    cajaTextoapellidop.setText("");
    
    cajaTextotitulop=new JTextField();
    cajaTextotitulop.setBounds(160, 280, 250, 30);
    panel.add(cajaTextotitulop);
    cajaTextotitulop.setText("");
    
    cajaTextoemailp=new JTextField();
    cajaTextoemailp.setBounds(160, 355, 250, 30);
    panel.add(cajaTextoemailp);
    cajaTextoemailp.setText("");

    }
    
     public void Colocarcombobox(){
    
    cajaboxestadop = new JComboBox();
    cajaboxestadop.setBounds(160, 430, 250, 30);
    panel.add(cajaboxestadop);
    cajaboxestadop.addItem("Activo");
    cajaboxestadop.addItem("Inactivo");
    cajaboxestadop.addActionListener((ActionEvent e) -> {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedOption);
        });
 	
    }
     
    public void ColocarcajaTextArea() {
    textarea1 = new JTextArea();
       textarea1.setBounds(415, 200, 200, 100);
       panel.add(textarea1);
       textarea1.setText("Comandos:");
       textarea1.append("\nNuevo: ALT + a ");
       textarea1.append("\nGuardar: ALT + e ");
       textarea1.append("\nActualizar: ALT + r ");
       textarea1.append("\nEliminar: ALT + f ");
       textarea1.append("\nSalir: ALT + t ");
       
    
       JScrollPane barra=new JScrollPane();
       //vertical
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //HORIZONTAL
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        barra.setBounds(0, 650, 1300, 15);
        //barra.setViewportView(panel);
        panel.add(barra);
        panel.setLayout(null);
        panel.setSize(400,300);
        panel.setVisible(true);
}
     
    public void colocarTabla() {
    String[] columnNames_prof = {"Cedula_prof", "Nombre_prof", "Apellido_prof",  "Titulo_prof", "Email_prof", "Estado_prof"};
    DefaultTableModel tableModel = new DefaultTableModel(columnNames_prof,0);
        //tabla de datos
         table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(630,70,610,500);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane); 
         mostrarDatos();
     
}
      private void agregarDatos(String cedula_prof, String nombre_prof, String apellido_prof, String titulo_prof, String email_prof, String estado_prof) {
    String SQL = "INSERT INTO `exam_prof` (cedula_prof, nombre_prof, apellido_prof, titulo_prof, email_prof, estado_prof) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

    try {
        Connection con = conexionExam.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, cedula_prof);
        ps.setString(2, nombre_prof);
        ps.setString(3, apellido_prof);
        ps.setString(4, titulo_prof);
        ps.setString(5, email_prof);
        ps.setString(6, estado_prof);

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Datos agregados correctamente");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + ex.getMessage());
    }
}
    private void limpiarCampos() {
        cajaTextocedulap.setText("");
        cajaTextonombrep.setText("");
        cajaTextoapellidop.setText("");
        cajaTextotitulop.setText("");
        cajaTextoemailp.setText("");
        cajaboxestadop.setSelectedIndex(0);
        textarea1.setText("");
    }
    private void mostrarDatos() {
        String[] titulos = {"Cedula_prof", "Nombre_prof", "Apellido_prof",  "Titulo_prof", "Email_prof", "Estado_prof"};
        String registro_prof[] = new String[6];
        tableModel = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `exam_prof`";
        try {
            Connection con = conexionExam.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                registro_prof[0] = rs.getString("cedula_prof");
                registro_prof[1] = rs.getString("nombre_prof");
                registro_prof[2] = rs.getString("apellido_prof");
                registro_prof[3] = rs.getString("titulo_prof");
                registro_prof[4] = rs.getString("email_prof");
                registro_prof[5] = rs.getString("estado_prof");
                tableModel.addRow(registro_prof);
            }
            // Set the table model to the table
            table.setModel(tableModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e.getMessage());
        }
    }
    public void eliminarDatos(String cedula_prof) {
    String SQL = "DELETE FROM `exam_prof` WHERE cedula_prof = ?";
    
    try {
        Connection con = conexionExam.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, cedula_prof);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + ex.getMessage());
    }
}
    private void habilitarCamposEdicion() {
    cajaTextocedulap.setEditable(false); 
    cajaTextonombrep.setEditable(true);
    cajaTextoapellidop.setEditable(true);
    cajaTextotitulop.setEditable(true);
    cajaTextoemailp.setEditable(true);
    cajaboxestadop.setEnabled(true);
    botonact.setEnabled(true);
    
}
    private void deshabilitarCamposEdicion() {
    cajaTextocedulap.setEditable(true); 
    cajaTextonombrep.setEditable(false);
    cajaTextoapellidop.setEditable(false);
    cajaTextotitulop.setEditable(true);
    cajaTextoemailp.setEditable(false);
    cajaboxestadop.setEnabled(false);
    botonact.setEnabled(false);
                
            }
      
     private void actualizarDatos(String cedula, String apellido, String nombre, String email, String titulo, String estado) {
               String SQL = "UPDATE `exam_prof` SET nombre_prof = ?, apellido_prof = ?, titulo_prof = ?, "
            + "email_prof = ?, estado_prof = ?  WHERE cedula_prof = ?";

    try {
        Connection con = conexionExam.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, apellido);
        ps.setString(2, nombre);
        ps.setString(3, email);
        ps.setString(4, titulo);
        ps.setString(5, estado);
        ps.setString(6, cedula);

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + ex.getMessage());
     }
   } 
}

          
 
   
   


