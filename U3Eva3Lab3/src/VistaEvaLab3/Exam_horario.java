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

public class Exam_horario extends JFrame {
    
    private Conexion conexionExam;
    private JTextField cajaTextoCodigodellab;
    private JTextField cajaTextoIngenieroEncargado;
    private JTextField cajaTextoMateriaRecibir;
    private JTextField cajaTextoEstudiantes;
    private JComboBox<String> cajaBoxHoradeingreso;
    private JComboBox<String> cajaBoxHoradesalida;
    private JTextArea textExam1;
    private JTable tabla;
    private DefaultTableModel tableModel;
    private JTable table;  // Agrega esta variable
    private JButton botonact;
    private Workbook libro;
    private Sheet hoja;
    private int filaIndex = 1; 
    //Creamos una ventana grafica con Jframe
    public JPanel panel;
    
    public Exam_horario(){
        
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
        File archivoExcel = new File("Datos_horarios.xlsx");
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
            hoja = libro.createSheet("Datos_horarios");
            
            // Crear la primera fila con los encabezados de las columnas
            Row filaEncabezados = hoja.createRow(0);
            String[] encabezados = { "Codigo del horario", "Materia a recibir", "Estudiantes(Que nivel) ", "Ingeniero Encargado", "Hora de ingreso", "Hora de salida" };
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
        panel.setBackground(Color.green);
        //poner el panel sobre la ventana registro
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
        label2.setText("Codigo del horario : ");
        panel.add(label2);
        //Ubicar
        label2.setHorizontalAlignment(HEIGHT);
        //Fuente
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label2.setBounds(40, 60, 200, 50);
        
        JLabel label3 =new JLabel();
        label3.setText("Materia a recibir : ");
        panel.add(label3);
        //Ubicar
        label3.setHorizontalAlignment(HEIGHT);
        //Fuente
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label3.setBounds(40, 100, 200, 50);
        
        JLabel label4 =new JLabel();
        label4.setText("Estudiantes(Que nivel) : ");
        panel.add(label4);
        //Ubicar
        label4.setHorizontalAlignment(HEIGHT);
        //Fuente
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label4.setBounds(40, 140, 200, 50);
        
        JLabel label5 =new JLabel();
        label5.setText("Ingeniero Encargado : ");
        panel.add(label5);
        //Ubicar
        label5.setHorizontalAlignment(HEIGHT);
        //Fuente
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label5.setBounds(40, 180, 200, 50);
        
        JLabel label6 =new JLabel();
        label6.setText("Hora de ingreso : ");
        panel.add(label6);
        //Ubicar
        label6.setHorizontalAlignment(HEIGHT);
        //Fuente
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label6.setBounds(40, 220, 200, 50);
        
        JLabel label7 =new JLabel();
        label7.setText("Hora de salida :");
        panel.add(label7);
        //Ubicar
        label7.setHorizontalAlignment(HEIGHT);
        //Fuente
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label7.setBounds(40, 260, 200, 50);
        
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
                cajaTextoCodigodellab.setText("");
                cajaTextoIngenieroEncargado.setText("");
                cajaTextoMateriaRecibir.setText("");
                cajaTextoEstudiantes.setText("");
                cajaBoxHoradeingreso.setSelectedIndex(0);
                cajaBoxHoradesalida.setSelectedIndex(0);
                textExam1.setText("");
                
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
        String codigo_lab = cajaTextoCodigodellab.getText();
        String ingeniero_encargado = cajaTextoIngenieroEncargado.getText();
        String materia_a_recibir = cajaTextoMateriaRecibir.getText();
        String estudiantes = cajaTextoEstudiantes.getText();
        String hora_salida = cajaBoxHoradeingreso.getSelectedItem().toString(); 
        String hora_entrada = cajaBoxHoradesalida.getSelectedItem().toString(); 

        String[] rowData = {codigo_lab, ingeniero_encargado, materia_a_recibir, estudiantes, hora_salida, hora_entrada};
        tableModel.addRow(rowData);
        agregarDatos(codigo_lab, ingeniero_encargado, materia_a_recibir, estudiantes, hora_salida, hora_entrada);
        
        Row fila = hoja.createRow(filaIndex);
        Cell celda = fila.createCell(0);
        celda.setCellValue(codigo_lab);
        celda = fila.createCell(1);
        celda.setCellValue(ingeniero_encargado);
        celda = fila.createCell(2);
        celda.setCellValue(materia_a_recibir);
        celda = fila.createCell(3);
        celda.setCellValue(estudiantes);
        celda = fila.createCell(4);
        celda.setCellValue(hora_salida);
        celda = fila.createCell(5);
        celda.setCellValue(hora_entrada);
        
        // Guardar el archivo de Excel
        try {
            FileOutputStream archivoSalida = new FileOutputStream("Datos_horario.xlsx");
            libro.write(archivoSalida);
            archivoSalida.close();
            
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
         boton3.setIcon(new ImageIcon(guardar.getImage().getScaledInstance(boton3.getWidth(),boton3.getHeight(),Image.SCALE_SMOOTH)));
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
            table.setValueAt(cajaTextoCodigodellab.getText(), filaSeleccionada, 0);
            table.setValueAt(cajaTextoIngenieroEncargado.getText(), filaSeleccionada, 1);
            table.setValueAt(cajaTextoMateriaRecibir.getText(), filaSeleccionada, 2);
            table.setValueAt(cajaTextoEstudiantes.getText(), filaSeleccionada, 3);
            table.setValueAt(cajaBoxHoradeingreso.getSelectedItem(), filaSeleccionada, 4);
            table.setValueAt(cajaBoxHoradesalida.getSelectedItem(), filaSeleccionada, 5);

            // Actualizar los datos en la hoja de Excel
            Row fila = hoja.getRow(filaSeleccionada + 1); // +1 para omitir la fila de encabezado
            if (fila != null) {
                fila.getCell(0).setCellValue(cajaTextoCodigodellab.getText());
                fila.getCell(1).setCellValue(cajaTextoIngenieroEncargado.getText());
                fila.getCell(2).setCellValue(cajaTextoMateriaRecibir.getText());
                fila.getCell(3).setCellValue(cajaTextoEstudiantes.getText());
                fila.getCell(4).setCellValue((String) cajaBoxHoradeingreso.getSelectedItem());
                fila.getCell(5).setCellValue((String) cajaBoxHoradesalida.getSelectedItem());

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
        
    cajaTextoCodigodellab=new JTextField();
    cajaTextoCodigodellab.setBounds(250, 70, 250, 30);
    panel.add(cajaTextoCodigodellab);
    cajaTextoCodigodellab.setText("");
    
    cajaTextoIngenieroEncargado=new JTextField();
    cajaTextoIngenieroEncargado.setBounds(250, 110, 250, 30);
    panel.add(cajaTextoIngenieroEncargado);
    cajaTextoIngenieroEncargado.setText("");
    
    cajaTextoMateriaRecibir=new JTextField();
    cajaTextoMateriaRecibir.setBounds(250, 150, 250, 30);
    panel.add(cajaTextoMateriaRecibir);
    cajaTextoMateriaRecibir.setText("");
    
    cajaTextoEstudiantes=new JTextField();
    cajaTextoEstudiantes.setBounds(250, 190, 250, 30);
    panel.add(cajaTextoEstudiantes);
    cajaTextoEstudiantes.setText("");
    
    }
         public void Colocarcombobox(){
        
    cajaBoxHoradeingreso = new JComboBox();
    cajaBoxHoradeingreso.setBounds(250, 230, 250, 30);
    panel.add(cajaBoxHoradeingreso);
    cajaBoxHoradeingreso.addItem("7:00 am");
    cajaBoxHoradeingreso.addItem("9:00 am");
    cajaBoxHoradeingreso.addItem("11:00 am");
    cajaBoxHoradeingreso.addItem("13:30 pm");
    cajaBoxHoradeingreso.addActionListener((ActionEvent e) -> {
    JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedOption);
    }); 
    
    cajaBoxHoradesalida = new JComboBox();
    cajaBoxHoradesalida.setBounds(250, 280, 250, 30);
    panel.add(cajaBoxHoradesalida);
    cajaBoxHoradesalida.addItem("9:00 am");
    cajaBoxHoradesalida.addItem("11:00 am");
    cajaBoxHoradesalida.addItem("13:00 pm");
    cajaBoxHoradesalida.addItem("15:30 pm");
    cajaBoxHoradesalida.addActionListener((ActionEvent e) -> {
    JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedOption);
    });
}   
             public void ColocarcajaTextArea() {
       textExam1 = new JTextArea();
       textExam1.setBounds(150, 330, 200, 100);
       panel.add(textExam1);
       textExam1.setText("Comandos:");
       textExam1.append("\nNuevo: ALT + a ");
       textExam1.append("\nGuardar: ALT + e ");
       textExam1.append("\nActualizar: ALT + r ");
       textExam1.append("\nEliminar: ALT + f ");
       textExam1.append("\nSalir: ALT + t ");
       
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
    String[] columnNames = { "Codigo_Lab", "Ingeniero", "Materia", "Estudiantes(Nivel)", "Hora Ingreso", "Hora Salida"};
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

       private void agregarDatos(String codigo_horario , String ingenieroeEncargado, String materia_recibir, String estudiantes, String hora_ingreso, String hora_salida) {
                 String SQL = "INSERT INTO `exam_horario` (codigo_horario, ingeniero_encargado, materia_recibir, estudiantes, hora_ingreso, hora_salida) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection con = conexionExam.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, codigo_horario );
            ps.setString(2, ingenieroeEncargado);
            ps.setString(3, materia_recibir);
            ps.setString(4, estudiantes);
            ps.setString(5, hora_ingreso);
            ps.setString(6, hora_salida);

           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos agregados ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + ex.getMessage());
        }
    }  
        
         
       
        private void limpiarCampos() {
            cajaTextoCodigodellab.setText("");
            cajaTextoIngenieroEncargado.setText("");
            cajaTextoMateriaRecibir.setText("");
            cajaTextoEstudiantes.setText("");
            cajaBoxHoradeingreso.setSelectedItem("");
            cajaBoxHoradesalida.setSelectedItem("");
    }
    
    private void mostrarDatos() {
        String[] titulos = {"codigo_horario", "ingeniero_encargado", "materia_recibir", "estudiantes", "hora_ingreso", "hora_salida"};
        String registrohorario[] = new String[6];
        tableModel = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `exam_horario`";
        try {
            Connection con = conexionExam.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                registrohorario[0] = rs.getString("codigo_horario");
                registrohorario[1] = rs.getString("ingeniero_encargado");
                registrohorario[2] = rs.getString("materia_recibir");
                registrohorario[3] = rs.getString("estudiantes");
                registrohorario[4] = rs.getString("hora_ingreso");
                registrohorario[5] = rs.getString("hora_salida");
                tableModel.addRow(registrohorario);
            }
            // Set the table model to the table
            table.setModel(tableModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e.getMessage());
        }
    }
    
    public void eliminarDatos(String codigo) {
    String SQL = "DELETE FROM `exam_horario` WHERE codigo_horario  = ?";
    
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
    cajaTextoCodigodellab.setEditable(false); // No permitir editar el codigo
    cajaTextoIngenieroEncargado.setEditable(true);
    cajaTextoMateriaRecibir.setEditable(true);
    cajaTextoEstudiantes.setEditable(true);
    cajaBoxHoradeingreso.setEnabled(true);
    cajaBoxHoradesalida.setEnabled(true);
    botonact.setEnabled(true);     
    }
    
    private void deshabilitarCamposEdicion() {
    cajaTextoCodigodellab.setEditable(true); // No permitir editar el codigo
    cajaTextoIngenieroEncargado.setEditable(false);
    cajaTextoMateriaRecibir.setEditable(false);
    cajaTextoEstudiantes.setEditable(false);
    cajaBoxHoradeingreso.setEnabled(false);
    cajaBoxHoradesalida.setEnabled(false);
    botonact.setEnabled(false); ;
                
            }
    
    
            private void actualizarDatos(String codigo_lab, String ingenieroEncargado, String materiaencargada, String estudiantes, String horaingreso, String horasalida) {
                String SQL = "UPDATE `exam_horario` SET ingeniero_encargado=? , materia_recibir  = ?, estudiantes = ?, hora_ingreso = ?, "
            + "hora_salida = ?  WHERE codigo_horario  = ?";

    try {
        Connection con = conexionExam.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, ingenieroEncargado);
        ps.setString(2, materiaencargada);
        ps.setString(3, estudiantes);
        ps.setString(4, horaingreso);
        ps.setString(5, horasalida);
        ps.setString(6, codigo_lab);

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + ex.getMessage());
    }
}
  
            }
     


        
