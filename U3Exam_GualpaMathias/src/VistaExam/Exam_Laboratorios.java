/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VistaExam;

import Control.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESPE
 */
public class Exam_Laboratorios  extends JFrame {
            private Conexion conexionExam;
            private JTextField cajaTextoCodigolab;
            private JTextField cajaTextoCapacidad;
            private JTextField cajaTextoEquipos ;
            private JTextArea textExam1;
            private JTable tabla;
            private DefaultTableModel tableModel;
            private JTable table;  // Agrega esta variable
            private JButton botonact;
            //Creamos una ventana grafica con Jframe
            public JPanel panel;

            public Exam_Laboratorios(){

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
        }
             public void iniciarcomponentes(){
                colocarPanel();
                ColocarEtiquetas();
                ColocarBotones();
                ColocarCajaTexto();
                colocarTabla();
                ColocarcajaTextArea();
            }

               public void colocarPanel(){
                panel= new JPanel();
                //dar color al panel
                panel.setBackground(Color.GRAY);
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
                label2.setText("Codigo del lab : ");
                panel.add(label2);
                //Ubicar
                label2.setHorizontalAlignment(HEIGHT);
                //Fuente
                label2.setForeground(Color.WHITE);
                label2.setFont(new Font("Times New Roman",Font.PLAIN,20));
                label2.setBounds(40, 60, 200, 50);

                JLabel label3 =new JLabel();
                label3.setText("Capacidad : ");
                panel.add(label3);
                //Ubicar
                label3.setHorizontalAlignment(HEIGHT);
                //Fuente
                label3.setForeground(Color.WHITE);
                label3.setFont(new Font("Times New Roman",Font.PLAIN,20));
                label3.setBounds(40, 100, 200, 50);

                JLabel label4 =new JLabel();
                label4.setText("Equipos : ");
                panel.add(label4);
                //Ubicar
                label4.setHorizontalAlignment(HEIGHT);
                //Fuente
                label4.setForeground(Color.WHITE);
                label4.setFont(new Font("Times New Roman",Font.PLAIN,20));
                label4.setBounds(40, 140, 200, 50);


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
                        cajaTextoCodigolab.setText("");
                        cajaTextoCapacidad.setText("");
                        cajaTextoEquipos.setText("");
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
                        String codigolab  = cajaTextoCodigolab.getText();
                        String capacidad = cajaTextoCapacidad.getText();
                        String equipos = cajaTextoEquipos.getText();
                        String observaciones = textExam1.getText();
                        agregarDatos(codigolab,capacidad, equipos);
                        limpiarCampos();
                        mostrarDatos();
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
                    String codigolab = (String) table.getValueAt(filaSeleccionada, 0); // Columna de la cédula
                    String capacidad = (String) table.getValueAt(filaSeleccionada, 1); // Columna de la cédula
                    String equipos = (String) table.getValueAt(filaSeleccionada, 2);

                    // Completar campos de texto con los valores de la fila
                    cajaTextoCodigolab.setText(codigolab);
                    cajaTextoCodigolab.setText(capacidad);
                    cajaTextoCodigolab.setText(equipos);

                    // Habilitar campos de texto para edición
                    habilitarCamposEdicion();
                }
            }
         });
                botonact = new JButton("Actualizar");
                ImageIcon imagen6 = new ImageIcon("");
                botonact.setBounds(270, 570, 100, 50);
                panel.add(botonact);
                botonact.setMnemonic('g');
                botonact.setEnabled(false);
                botonact.setIcon(new ImageIcon(imagen6.getImage().getScaledInstance(botonact.getWidth(), botonact.getHeight(), Image.SCALE_SMOOTH)));
                botonact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigolab = cajaTextoCodigolab.getText();
                String capacidad = cajaTextoCodigolab.getText();
                String equipos = cajaTextoCodigolab.getText();


                // Actualizar datos en la base de datos
                actualizarDatos(codigolab, capacidad, equipos);

                // Actualizar datos en la tabla de la interfaz
                int filaSeleccionada = table.getSelectedRow();
                tableModel.setValueAt(codigolab, filaSeleccionada, 0);
                tableModel.setValueAt(capacidad, filaSeleccionada, 1);
                tableModel.setValueAt(equipos, filaSeleccionada, 2);

                // Deshabilitar campos de texto después de guardar los cambios
                deshabilitarCamposEdicion();
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

            cajaTextoCodigolab=new JTextField();
            cajaTextoCodigolab.setBounds(250, 70, 250, 30);
            panel.add(cajaTextoCodigolab);
            cajaTextoCodigolab.setText("");

            cajaTextoCapacidad=new JTextField();
            cajaTextoCapacidad.setBounds(250, 110, 250, 30);
            panel.add(cajaTextoCapacidad);
            cajaTextoCapacidad.setText("");

            cajaTextoEquipos=new JTextField();
            cajaTextoEquipos.setBounds(250, 150, 250, 30);
            panel.add(cajaTextoEquipos);
            cajaTextoEquipos.setText("");

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

               private void agregarDatos(String codigolab , String capacidad, String equipos) {
                         String SQL = "INSERT INTO `exam_lab` (codigo_lab, Capacidad, Equipos) "
                        + "VALUES (?, ?, ?)";

                try {
                    Connection con = conexionExam.conexion();
                    PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
                    ps.setString(1, codigolab );
                    ps.setString(2, capacidad);
                    ps.setString(3, equipos);

                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Datos agregados ");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + ex.getMessage());
                }
            }  



                private void limpiarCampos() {
                    cajaTextoCodigolab.setText("");
                    cajaTextoCapacidad.setText("");
                    cajaTextoEquipos.setText("");
            }

            private void mostrarDatos() {
                String[] titulos = {"codigo_lab", "Capacidad", "Equipos"};
                String registrohorario[] = new String[3];
                tableModel = new DefaultTableModel(null, titulos);
                String SQL = "SELECT * FROM `exam_lab`";
                try {
                    Connection con = conexionExam.conexion();
                    PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        registrohorario[0] = rs.getString("codigo_lab");
                        registrohorario[1] = rs.getString("Capacidad");
                        registrohorario[2] = rs.getString("Equipos");
                        tableModel.addRow(registrohorario);
                    }
                    // Set the table model to the table
                    table.setModel(tableModel);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e.getMessage());
                }
            }

            public void eliminarDatos(String codigo) {
            String SQL = "DELETE FROM `exam_lab` WHERE codigo_lab  = ?";

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
            cajaTextoCodigolab.setEditable(false); // No permitir editar el codigo
            cajaTextoCapacidad.setEditable(true);
            cajaTextoEquipos.setEditable(true);
            botonact.setEnabled(true);     
            }

            private void deshabilitarCamposEdicion() {
            cajaTextoCodigolab.setEditable(true); // No permitir editar el codigo
            cajaTextoCapacidad.setEditable(false);
            cajaTextoEquipos.setEditable(false);
            botonact.setEnabled(false); ;

                    }


         private void actualizarDatos(String codigolab , String capacidad, String equipos) {
         String SQL = "UPDATE `exam_lab` SET 	Capacidad=? , Equipos  = ?  WHERE codigo_lab  = ?";

            try {
                Connection con = conexionExam.conexion();
                PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
                ps.setString(1, capacidad);
                ps.setString(2, equipos);
                ps.setString(3, codigolab);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + ex.getMessage());
            }
        }

                    }