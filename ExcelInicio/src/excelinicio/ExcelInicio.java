/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excelinicio;

import Control.Conexion;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Usuario
 */
public class ExcelInicio {

   public static void cargarArchivoExcel() throws FileNotFoundException, IOException, SQLException{
       FileInputStream archivo = new FileInputStream("C:\\Excel.xlsx");
       XSSFWorkbook libro = new XSSFWorkbook(archivo);
       XSSFSheet hoja = libro.getSheetAt(0);
       
       int num_filas = hoja.getLastRowNum();
       
       for(int i=0;i<= num_filas;i++){
           Row fila = hoja.getRow(i);
           Conexion conexion = new Conexion();
           Connection conectar = conexion.conexion();
           PreparedStatement insertar = conectar.prepareStatement("insert into excel values(?,?)");
           insertar.setString(1,fila.getCell(0).getStringCellValue());
           insertar.setString(2,fila.getCell(1).getStringCellValue());
           insertar.executeUpdate();
       }
   }
    
    
    public static void main(String[] args) throws IOException, FileNotFoundException, SQLException {
        cargarArchivoExcel();
    }
    
}
