/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class Registro extends JFrame {
    //Creamos una ventana grafica con Jframe
 public JPanel panel;
    public Registro(){ 
    this.setSize(500,500);
    setTitle("REGISTRO");
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
        colocarAreaTexto();
    }
    
    public void colocarPanel(){
        panel= new JPanel();
        //dar color al panel
        panel.setBackground(Color.BLUE);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }
    
    public void ColocarEtiquetas(){
        JLabel label = new JLabel("REGISTRAR",SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(100, 10, 350, 50);
        label.setForeground(Color.WHITE);//Letra
        label.setBackground(Color.BLACK);//Cuadro
        label.setOpaque(true);
        
        JLabel label2 =new JLabel();
        label2.setText("NOMBRE : ");
        panel.add(label2);
        //Ubicar
        label2.setHorizontalAlignment(HEIGHT);
        //Fuente
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label2.setBounds(40, 60, 200, 50);
        //poner imagen
        JLabel labelimagen = new JLabel();
        ImageIcon imagen = new ImageIcon("Registro.jpg");
        labelimagen.setBounds(20, 120, 90, 70);
        panel.add(labelimagen);
        
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(),labelimagen.getHeight(),Image.SCALE_SMOOTH)));
}
    public void ColocarBotones(){
        JButton boton1=new JButton("CLICK");
        boton1.setBounds(30, 310, 100, 50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        
        JButton boton2=new JButton("imagen");
        ImageIcon imagen1=new ImageIcon("Registro1.jpg");
        boton2.setBounds(210, 310, 100, 50);
        panel.add(boton2);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        boton2.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
    } 
    public void ColocarCajaTexto(){
    JTextField cajaTexto1=new JTextField();
    cajaTexto1.setBounds(150, 70, 250, 30);
    panel.add(cajaTexto1);
    cajaTexto1.setText("POO");
    System.out.println("El texto de la caja es : "+ cajaTexto1.getText());
}
    public void colocarAreaTexto(){
    JTextArea textarea1 = new JTextArea();
    textarea1.setBounds(130, 130, 250, 150);
    panel.add(textarea1);
    textarea1.setText("POO");
    textarea1.append("\n Escribir aqui....");
    
    JScrollPane barra=new JScrollPane();
        //verificar
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //HORIZONTAL
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(30, 310, 100, 50);
        panel.add(barra);
}
     }