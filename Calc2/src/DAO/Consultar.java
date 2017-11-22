/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public class Consultar {

    //private Coneccion cnx;
   private Coneccion cnx;
   private ErrorSQL errorSQL = new ErrorSQL(); 
   PreparedStatement consulta;
   public void GrabarCalculo (String calculo) throws SQLException, ClassNotFoundException {
       //Coneccion cnx = new Coneccion
    
       Coneccion conn = new Coneccion ("localhost", "root", "yosololase","calc2", errorSQL);
       conn.conectar();
       Connection cnx = conn.getCnx();
       if(cnx != null){
        try{
           consulta = cnx.prepareStatement("INSERT INTO almacen (almacen_string) VALUES(?)");
            consulta.setString(1, calculo);
            consulta.executeUpdate();
         }catch(SQLException ex){
                    System.out.println(ex.getMessage());
         }
            
       }else{
           System.out.println("NO conecto");
           System.out.println(errorSQL.getDetalle());
           System.out.println(errorSQL.getNroError());
       }
       
       
        
//System.out.println("la varialbe es: " + );
    }

  
            
    
    
    
    
}

