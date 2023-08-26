/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VistaEvaLab3;

import Control.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Exam_login extends JFrame{
   

    Conexion cl = new Conexion();
    Connection con = cl.conexion();

    private JTextField txtUsuario;
    private JPasswordField txtContraseña;
    private JButton btnInicioSesion;
    private JButton btnSalir;

    public Exam_login() {
        crearInterfaz();
    }

    private void crearInterfaz() {
        JFrame frame = new JFrame("Sistema de Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel lblUsuario = new JLabel("Username");
        txtUsuario = new JTextField(20);

        JLabel lblContraseña = new JLabel("Password");
        txtContraseña = new JPasswordField(20);

        btnInicioSesion = new JButton("Iniciar Sesión");
        btnInicioSesion.addActionListener(e -> validarUsuario());

        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(e -> System.exit(0));

        panel.add(lblUsuario);
        panel.add(txtUsuario);
        panel.add(lblContraseña);
        panel.add(txtContraseña);
        panel.add(btnInicioSesion);
        panel.add(btnSalir);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void validarUsuario() {
        int resultado = 0;
        String pass = String.valueOf(txtContraseña.getPassword());
        String usuario = txtUsuario.getText();
        String SQL = "SELECT * FROM exam_login WHERE usuario='" + usuario + "' AND pass='" + pass + "'";

        try {
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                resultado = 1;
                if (resultado == 1) {
                    MenuExam menuPrincipal = new MenuExam();
                    menuPrincipal.mostrar();
                    JOptionPane.showMessageDialog(null, "Bienvenido al Menú Principal");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos" + e);
        }
    }

    public static void main(String[] args) {
        new Exam_login();
    }
}
