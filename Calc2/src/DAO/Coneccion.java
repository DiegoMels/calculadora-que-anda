/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public class Coneccion {
    
    private Connection cnx;
    //driver que importamos en la libreria.
    private String driver = "com.mysql.jdbc.Driver";
    private String user = "root";
    private String password = "yosololase";
    //direccion o referencia donde tengo alojada esta base de datos.
    private String url = "jdbc:mysql://localhost:3306/Clinica";
    
    public Coneccion() {
        
        cnx = null;
        try {
            Class.forName(driver);
            cnx = DriverManager.getConnection(url, user, password);
            if (cnx != null){
                System.out.println("Conexion establecida...");
            }

        }catch(ClassNotFoundException | SQLException e) {
            System.out.println("error al conectar... " + e); 
        }
    }
    
    //Metodo para retornar la conexion.
    public Connection getConnection(){
        return cnx;
    }
    
    //Metodo para desconectarse de la base de datos.
    public void desconectar(){
        cnx = null;
        if (cnx == null){
            System.out.println("Conexion Terminada...");
        }
    }
    
   /*  private Connection cnx = null;
   private String host, usu, clave, bd;

    public Coneccion(String host, String usu, String clave, String bd) {
        this.host = host;
        this.usu = usu;
        this.clave = clave;
        this.bd = bd;
    }

    Coneccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
  
    
   public void conectar() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://"+this.host+"localhost:127.0.0.1"+this.bd+"almacen", this.usu+"root", this.clave+"");
            if (cnx != null){
                System.out.println("Conexion Establecida...");
            }
         } catch (SQLException ex) {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         }
      }
      
   }
    public Connection getCnx() {
        return cnx;
    }
   public void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }  */  

    

    
    
}
