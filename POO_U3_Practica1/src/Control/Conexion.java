/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class Conexion {
    
    private static final String drive="Com.mysql.jdbc.Drive";
    private static final String user="root";
    private static final String pass="";
     private static final String url="jdbcmysql://localhost:3306/estudiante";
     
    Connection conectar = null;
    
    public Connection conexion(){
        try{
            Class.forName(drive);
            conectar=(Connection) DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de conexion"+e.getMessage());
                }
        return conectar;
    } 
 }

