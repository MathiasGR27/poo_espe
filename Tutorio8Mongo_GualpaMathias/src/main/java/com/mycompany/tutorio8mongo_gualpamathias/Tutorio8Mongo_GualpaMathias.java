/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tutorio8mongo_gualpamathias;
import com.mongodb.MongoClient;
/**
 *
 * @author Usuario
 */
public class Tutorio8Mongo_GualpaMathias {

    public static void main(String[] args) {
        MongoClient mongo=crearConexion();
        if(mongo!=null){
            DB db=mongo.getDB("Nueva base de datos");
            System.out.println("Base de datos creada ");
            /*InsertarUsuario(db, "datos","Mathias","Gualpa");
            InsertarUsuario(db, "datos","Elian","Rivera");
            mostrarColeccion(db "datos");*/
            buscarPorNombre("datos","mathias");
            buscarPorNombre("miembros","mathias");
  
        }
        
    }
    
    
    public static MongoClient crearConexion(){
         System.out.println("CONECCION REALIZADA!");
         MongoClient mongo=null;
         mongo = new MongoClient ("127.0.0.1", 27017);
         return mongo;
    } 
    
    public static void insertarUsuario (DB db,String coleccion,String nombre, String apellido){
        DBCollection colec = db.getCollection(coleccion);
        BasicDBobject documento = new BasicDBobject();
        documento.put("Nombre ", nombre);
        documento.put("Apellido ", apellido);
        colec.insert(documento);
    }
    
    public static void mostrarColeccion(DB db,String coleccion){
        DBCollection colect=db.geCollection(coleccion);
        DBcCursor cursor=colect.find();
        while(cursor.hasNext()){
            System.out.println("* ",cursor.next().get("nombre")+"---",cursor.curr().get("apelldo"));
        }
    }
    
    public static void buscarPorNombre(DB db,String coleccion, String nombre){
        DBCollection colec = db.getCollection(coleccion);
        BasicDBobject documento = new BasicDBobject();
        consulta.put("nombre",nombre):
        DBcCursor cursor=colect.find();
        while(cursor.hasNext()){
            System.out.println("* ",cursor.next().get("nombre")+"---",cursor.curr().get("apelldo"));
        }
    }
    
}


