/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VistaEvaLab3;

import Control.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
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
import java.io.FileNotFoundException;
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

public class Exam_estudiante extends JFrame {
    
        private Conexion conexionExam;
    private JTextField cajaTextocodigo;
    private JTextField cajaTextocedula;
    private JTextField cajaTextoapellido;
    private JTextField cajaTextonombre;
    private JTextField cajaTextoemail;
    private JTextField cajaTextotelefono;
    private JTextField cajaTextodireccion;
    private JComboBox<String> cajaboxmateria;
    private JComboBox<String> cajaboxestado;
    private JTextArea textarea1;
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton botonact;
    private Workbook libro;
    private Sheet hoja;
    private int filaIndex = 1; 

    public JPanel panel;

    public Exam_estudiante() {
        conexionExam = new Conexion();
        this.setSize(1300, 700);
        setTitle("EXAMEN U3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        iniciarcomponentes();
       // Verificar si el archivo Excel ya existe
        File archivoExcel = new File("Datos_Estudiantes.xlsx");
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
            hoja = libro.createSheet("Datos_Estudiantes");
            
            // Crear la primera fila con los encabezados de las columnas
            Row filaEncabezados = hoja.createRow(0);
            String[] encabezados = { "Codigo", "Cedula", "Apellido", "Nombre", "Mail", "Telefono", "Direccion", "Materia", "Estado" };
            for (int i = 0; i < encabezados.length; i++) {
                Cell celdaEncabezado = filaEncabezados.createCell(i);
                celdaEncabezado.setCellValue(encabezados[i]);
            }
        }
    }

    public void iniciarcomponentes() {
        colocarPanel();
        ColocarEtiquetas();
        ColocarBotones();
        ColocarCajaTexto();
        Colocarcombobox();
        colocarTabla();
        ColocarcajaTextArea();
    }

    public void colocarPanel() {
        panel = new JPanel();
        panel.setBackground(Color.BLUE);
        this.getContentPane().add(panel);
    }
    
    public void ColocarEtiquetas(){
        JLabel label = new JLabel(" EXAMEN U3 ",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(100, 10, 350, 50);
        label.setForeground(Color.WHITE);//Letra
        label.setBackground(Color.BLACK);//Cuadro
        label.setOpaque(true);
        
        JLabel label2 =new JLabel();
        label2.setText("Codigo : ");
        panel.add(label2);
        //Ubicar
        label2.setHorizontalAlignment(HEIGHT);
        //Fuente
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label2.setBounds(40, 60, 200, 50);
        
        JLabel label3 =new JLabel();
        label3.setText("Cedula : ");
        panel.add(label3);
        //Ubicar
        label3.setHorizontalAlignment(HEIGHT);
        //Fuente
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label3.setBounds(40, 100, 200, 50);
        
        JLabel label4 =new JLabel();
        label4.setText("Apellido : ");
        panel.add(label4);
        //Ubicar
        label4.setHorizontalAlignment(HEIGHT);
        //Fuente
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label4.setBounds(40, 140, 200, 50);
        
        JLabel label5 =new JLabel();
        label5.setText("Nombre : ");
        panel.add(label5);
        //Ubicar
        label5.setHorizontalAlignment(HEIGHT);
        //Fuente
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label5.setBounds(40, 180, 200, 50);
        
        JLabel label6 =new JLabel();
        label6.setText("Mail : ");
        panel.add(label6);
        //Ubicar
        label6.setHorizontalAlignment(HEIGHT);
        //Fuente
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label6.setBounds(40, 220, 200, 50);
        
        JLabel label7 =new JLabel();
        label7.setText("Telefono : ");
        panel.add(label7);
        //Ubicar
        label7.setHorizontalAlignment(HEIGHT);
        //Fuente
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label7.setBounds(40, 260, 200, 50);
        
        JLabel label8 =new JLabel();
        label8.setText("Direccion : ");
        panel.add(label8);
        //Ubicar
        label8.setHorizontalAlignment(HEIGHT);
        //Fuente
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label8.setBounds(40, 300, 200, 50);
        
        JLabel label9 =new JLabel();
        label9.setText("Materia : ");
        panel.add(label9);
        //Ubicar
        label9.setHorizontalAlignment(HEIGHT);
        //Fuente
        label9.setForeground(Color.WHITE);
        label9.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label9.setBounds(40, 340, 200, 50);
        
        JLabel label10 =new JLabel();
        label10.setText("Estado : ");
        panel.add(label10);
        //Ubicar
        label10.setHorizontalAlignment(HEIGHT);
        //Fuente
        label10.setForeground(Color.WHITE);
        label10.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label10.setBounds(40, 380, 200, 50);
   
}
    public void ColocarBotones(){
        
        JButton boton1=new JButton("Nuevo");
        ImageIcon nuevo=new ImageIcon("Nuevo.PNG");
        boton1.setBounds(30, 500, 100, 50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        boton1.setIcon(new ImageIcon(nuevo.getImage().getScaledInstance(boton1.getWidth(),boton1.getHeight(),Image.SCALE_SMOOTH)));
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cajaTextocodigo.setText("");
                cajaTextocedula.setText("");
                cajaTextoapellido.setText("");
                cajaTextonombre.setText("");
                cajaTextoemail.setText("");
                cajaTextotelefono.setText("");
                cajaTextodireccion.setText("");
                cajaboxmateria.setSelectedIndex(0);
                cajaboxestado.setSelectedIndex(0);
                textarea1.setText("");
                
            }
        });
       
        JButton boton2=new JButton("Guardar");
        ImageIcon guardar=new ImageIcon("Guardar.PNG");
        boton2.setBounds(150, 500, 100, 50);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('e');
        boton2.setIcon(new ImageIcon(guardar.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
        boton2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String codigo = cajaTextocodigo.getText();
        String cedula = cajaTextocedula.getText();
        String apellido = cajaTextoapellido.getText();
        String nombre = cajaTextonombre.getText();
        String mail = cajaTextoemail.getText();
        String telefono = cajaTextotelefono.getText();
        String direccion = cajaTextodireccion.getText();
        String materia = cajaboxmateria.getSelectedItem().toString();
        String estado = cajaboxestado.getSelectedItem().toString(); 
        
        String[] rowData = {codigo, cedula, apellido, nombre, mail, telefono, direccion, materia, estado};
        tableModel.addRow(rowData);
        agregarDatos(codigo, cedula, apellido, nombre, mail, telefono, direccion, materia, estado);
       
        Row fila = hoja.createRow(filaIndex);
        Cell celda = fila.createCell(0);
        celda.setCellValue(codigo);
        celda = fila.createCell(1);
        celda.setCellValue(cedula);
        celda = fila.createCell(2);
        celda.setCellValue(apellido);
        celda = fila.createCell(3);
        celda.setCellValue(nombre);
        celda = fila.createCell(4);
        celda.setCellValue(mail);
        celda = fila.createCell(5);
        celda.setCellValue(telefono);
        celda = fila.createCell(6);
        celda.setCellValue(direccion);
        celda = fila.createCell(7);
        celda.setCellValue(materia);
        celda = fila.createCell(8);
        celda.setCellValue(estado);
        
        filaIndex++;

        // Guardar el archivo de Excel
          try {
        FileOutputStream archivoSalida = new FileOutputStream("Datos_Estudiantes.xlsx");
        libro.write(archivoSalida);
        JOptionPane.showMessageDialog(null, "Datos guardados en Excel");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar los datos en Excel: " + ex.getMessage());
    }
}
});
        JButton boton3=new JButton("Actualizar");
        ImageIcon actualizar=new ImageIcon("Actualizar.PNG");
        boton3.setBounds(270, 500, 100, 50);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('r');
        boton3.setIcon(new ImageIcon(actualizar.getImage().getScaledInstance(boton3.getWidth(),boton3.getHeight(),Image.SCALE_SMOOTH)));
        boton3.addActionListener(new ActionListener() {
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
            table.setValueAt(cajaTextocodigo.getText(), filaSeleccionada, 0);
            table.setValueAt(cajaTextocedula.getText(), filaSeleccionada, 1);
            table.setValueAt(cajaTextoapellido.getText(), filaSeleccionada, 2);
            table.setValueAt(cajaTextonombre.getText(), filaSeleccionada, 3);
            table.setValueAt(cajaTextoemail.getText(), filaSeleccionada, 4);
            table.setValueAt(cajaTextotelefono.getText(), filaSeleccionada, 5);
            table.setValueAt(cajaTextodireccion.getText(), filaSeleccionada, 6);
            table.setValueAt(cajaboxmateria.getSelectedItem(), filaSeleccionada, 7);
            table.setValueAt(cajaboxestado.getSelectedItem(), filaSeleccionada, 8);

            // Actualizar los datos en la hoja de Excel
            Row fila = hoja.getRow(filaSeleccionada + 1); // +1 para omitir la fila de encabezado
            if (fila != null) {
                fila.getCell(0).setCellValue(cajaTextocodigo.getText());
                fila.getCell(1).setCellValue(cajaTextocedula.getText());
                fila.getCell(2).setCellValue(cajaTextoapellido.getText());
                fila.getCell(3).setCellValue(cajaTextonombre.getText());
                fila.getCell(4).setCellValue(cajaTextoemail.getText());
                fila.getCell(5).setCellValue(cajaTextotelefono.getText());
                fila.getCell(6).setCellValue(cajaTextodireccion.getText());
                fila.getCell(7).setCellValue((String) cajaboxmateria.getSelectedItem());
                fila.getCell(8).setCellValue((String) cajaboxestado.getSelectedItem());

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
       
        
        JButton boton4=new JButton("Eliminar");
        ImageIcon eliminar=new ImageIcon("Eliminar.JPG");
         boton4.setBounds(390, 500, 100, 50);
        panel.add(boton4);
        boton4.setEnabled(true);
        boton4.setMnemonic('f');
        boton4.setIcon(new ImageIcon(eliminar.getImage().getScaledInstance(boton4.getWidth(),boton4.getHeight(),Image.SCALE_SMOOTH)));
        boton4.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int filaSeleccionada = table.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar.");
        } else {
            String codigo = (String) table.getValueAt(filaSeleccionada, 0); // Columna de la cédula

            // Eliminar fila de la base de datos
            eliminarDatos(codigo);

            // Eliminar fila de la tabla en la interfaz
            tableModel.removeRow(filaSeleccionada);
        }
    }

        });

        
        
        JButton boton5=new JButton("Salir");
        ImageIcon salir=new ImageIcon("Salir.PNG");
        boton5.setBounds(520, 500, 100, 50);
        panel.add(boton5);
        boton5.setEnabled(true);
        boton5.setMnemonic('t');
        boton5.setIcon(new ImageIcon(salir.getImage().getScaledInstance(boton5.getWidth(),boton5.getHeight(),Image.SCALE_SMOOTH)));
        boton5.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Cerrar la ventana y terminar el programa
        dispose(); // Cierra la ventana actual
        System.exit(0); // Finaliza el programa
    }
});
}
    public void ColocarCajaTexto(){
        
    cajaTextocodigo=new JTextField();
    cajaTextocodigo.setBounds(150, 70, 250, 30);
    panel.add(cajaTextocodigo);
    cajaTextocodigo.setText("");
    
    cajaTextocedula=new JTextField();
    cajaTextocedula.setBounds(150, 110, 250, 30);
    panel.add(cajaTextocedula);
    cajaTextocedula.setText("");
    
    cajaTextoapellido=new JTextField();
    cajaTextoapellido.setBounds(150, 150, 250, 30);
    panel.add(cajaTextoapellido);
    cajaTextoapellido.setText("");
    
    cajaTextonombre=new JTextField();
    cajaTextonombre.setBounds(150, 190, 250, 30);
    panel.add(cajaTextonombre);
    cajaTextonombre.setText("");
    
    cajaTextoemail=new JTextField();
    cajaTextoemail.setBounds(150, 230, 250, 30);
    panel.add(cajaTextoemail);
    cajaTextoemail.setText("");
    
    cajaTextotelefono=new JTextField();
    cajaTextotelefono.setBounds(150, 270, 250, 30);
    panel.add(cajaTextotelefono);
    cajaTextotelefono.setText("");
    
    cajaTextodireccion=new JTextField();
    cajaTextodireccion.setBounds(150, 310, 250, 30);
    panel.add(cajaTextodireccion);
    cajaTextodireccion.setText("");
    }
    
     public void Colocarcombobox(){
        
    cajaboxmateria = new JComboBox();
    cajaboxmateria.setBounds(150, 350, 250, 30);
    panel.add(cajaboxmateria);
    cajaboxmateria.addItem("POO");
    cajaboxmateria.addItem("MODELOS DISCRETOS");
    cajaboxmateria.addItem("SISTEMAS OPERATIVOS");
    cajaboxmateria.addActionListener((ActionEvent e) -> {
    JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedOption);
    }); 
    
    cajaboxestado = new JComboBox();
    cajaboxestado.setBounds(150, 390, 250, 30);
    panel.add(cajaboxestado);
    cajaboxestado.addItem("Aprobado");
    cajaboxestado.addItem("Reprobado");
    cajaboxestado.addActionListener((ActionEvent e) -> {
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
    String[] columnNames = { "Codigo", "Cedula", "Apellido", "Nombre", "Email", "Telefono", "Direccion", "Materia", "Estado"};
    DefaultTableModel tableModel = new DefaultTableModel(columnNames,0);
        //tabla de datos
         table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(630,70,610,500);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane); 
         mostrarDatos();
}
    
    private void agregarDatos(String codigo, String cedula, String apellido, String nombre, String email, String telefono, String direccion, String materia, String estado) {
          String SQL = "INSERT INTO `exam_estu` (codigo, cedula, apellido, nombre, email, telefono, direccion, materia, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection con = conexionExam.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, codigo);
            ps.setString(2, cedula);
            ps.setString(3, apellido);
            ps.setString(4, nombre);
            ps.setString(5, email);
            ps.setString(6, telefono);
            ps.setString(7, direccion);
            ps.setString(8, materia);
            ps.setString(9, estado);
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos agregados ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + ex.getMessage());
        }
    }   
    
    private void limpiarCampos() {
        cajaTextocodigo.setText("");
        cajaTextocedula.setText("");
        cajaTextoapellido.setText("");
        cajaTextonombre.setText("");
        cajaTextoemail.setText("");
        cajaTextotelefono.setText("");
        cajaTextodireccion.setText("");
        cajaboxmateria.setSelectedIndex(0);
        cajaboxestado.setSelectedIndex(0);
        textarea1.setText("");
    }
    
    private void mostrarDatos() {
        String[] titulos = {"código", "cedula", "apellido", "nombre", "email", "telefono", "direccion", "materia", "estado"};
        String registroestu[] = new String[9];
        tableModel = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `exam_estu`";
        try {
            Connection con = conexionExam.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                registroestu[0] = rs.getString("codigo");
                registroestu[1] = rs.getString("cedula");
                registroestu[2] = rs.getString("apellido");
                registroestu[3] = rs.getString("nombre");
                registroestu[4] = rs.getString("email");
                registroestu[5] = rs.getString("telefono");
                registroestu[6] = rs.getString("direccion");
                registroestu[7] = rs.getString("materia");
                registroestu[8] = rs.getString("estado");
                tableModel.addRow(registroestu);
            }
            // Set the table model to the table
            table.setModel(tableModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e.getMessage());
        }
    }
    
    public void eliminarDatos(String codigo) {
    String SQL = "DELETE FROM `exam_estu` WHERE codigo = ?";
    
    try {
        Connection con = conexionExam.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, codigo);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + ex.getMessage());
    }
}
    
    
    private void habilitarCamposEdicion() {
    cajaTextocodigo.setEditable(false); // No permitir editar el codigo
    cajaTextocedula.setEditable(true);
    cajaTextoapellido.setEditable(true);
    cajaTextonombre.setEditable(true);
    cajaTextoemail.setEditable(true);
    cajaTextotelefono.setEditable(true);
    cajaTextodireccion.setEnabled(true);
    cajaboxmateria.setEnabled(true);
    cajaboxestado.setEnabled(true);
    botonact.setEnabled(true);     
    }
    
    private void deshabilitarCamposEdicion() {
    cajaTextocodigo.setEditable(true); 
    cajaTextocedula.setEditable(false);
    cajaTextoapellido.setEditable(false);
    cajaTextonombre.setEditable(true);
    cajaTextoemail.setEditable(false);
    cajaTextotelefono.setEnabled(false);
    cajaTextodireccion.setEnabled(false);
    cajaboxmateria.setEnabled(false);
    cajaboxestado.setEnabled(false);
    botonact.setEnabled(false);
                
            }
    
    public void actualizarDatos(String codigo , String cedula, String apellido, String nombre, String email,
        String telefono, String direccion, String materia, String estado) {
    String SQL = "UPDATE `exam_estu` SET cedula=? , apellido = ?, nombre = ?, email = ?, "
            + "telefono = ?, direccion = ?, materia = ?, estado = ? WHERE codigo = ?";

    try {
        Connection con = conexionExam.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, cedula);
        ps.setString(2, apellido);
        ps.setString(3, nombre);
        ps.setString(4, email);
        ps.setString(5, telefono);
        ps.setString(6, direccion);
        ps.setString(7, materia);
        ps.setString(8, estado);
        ps.setString(9, codigo);

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + ex.getMessage());
    }
}
    

}
    
