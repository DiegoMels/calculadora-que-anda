/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import negocio.Calculo;
import controlador.ControladorGrabar;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author alumno
 */
public class Consultar {

    //private Coneccion cnx;
    Coneccion cnx;
   
   /* public void GrabarCalculo (String calculo){
        System.out.println("llegue");
        //System.out.println("la varialbe es: " + );
    }
*/
    public void GrabarCalculo(JTextField campo_texto) throws SQLException {
        
        System.out.println("la variable es: " + campo_texto);
        
        cnx = new Coneccion();
        Connection reg = cnx.getConnection();
        /*cnx = new Coneccion();
        Connection reg = cnx.getCnx();*/
    }
            
    
    
    
    
}

