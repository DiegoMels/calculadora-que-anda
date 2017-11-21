package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class Consulta {

    public void GrabarCalculo(String Calculo) throws SQLException, ClassNotFoundException{
        
       Coneccion conn = new Coneccion("localhost", "root", "", "menu");
       conn.conectar();
       Connection cnx = conn.getCnx();
       
       PreparedStatement consulta = cnx.prepareStatement("INSERT INTO nombre_de_tabla (campoxxxx) VALUES(?)");
       //consulta.setInt(1, mewrua.getCodigo());
       consulta.executeQuery();
       
       
        System.out.println("llegue");
        
    }
    
      
    
}
