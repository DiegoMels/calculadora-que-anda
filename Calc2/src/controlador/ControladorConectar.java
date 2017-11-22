package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import DAO.Consultar;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//esos 3 import + el try y catch hacen andar pero me tira error de conexion
/*import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;*/

import javax.swing.JTextField;
import negocio.Calculo;



public class ControladorConectar implements MouseListener {

    
     Consultar daoConsulta;
    JTextField campo_texto;

    public ControladorConectar(JTextField campo_texto) {
        this.campo_texto = campo_texto;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
             daoConsulta = new Consultar();
             
             
             //daoConsulta.GrabarCalculo(campo_texto.getText());
             

              try {
                //daoConsulta.Conectar(campo_texto);
                daoConsulta.GrabarCalculo(campo_texto.getText());
             } catch (SQLException ex) {
             Logger.getLogger(ControladorConectar.class.getName()).log(Level.SEVERE, null, ex);
             
/* La clase java.util.logging.Logger proporciona varios métodos con los que se pueden anotar cronológicamente los datos.
En the WebSphere Application Server, cuando se utiliza el modo de registro y rastreo básico, la API de registro cronológico Java (java.util.logging)
crea automáticamente Common Base Events para los sucesos registrados cronológicamente en el nivel
WsLevel.DETAIL o superior (incluido WsLevel.DETAIL, Level.CONFIG, Level.INFO, WsLevel.AUDIT, Level.
WARNING, Level.SEVERE y WsLevel.FATAL). Estos Common Base Events se crean mediante la fábrica de sucesos asociada con el registrador
en el que se ha anotado cronológicamente el mensaje. Si no se especifica ninguna fábrica de sucesos, WebSphere Application Server utiliza
una fábrica de sucesos por omisión que rellenará automáticamente la información específica de WebSphere Application Server.*/
             
             } catch (ClassNotFoundException ex) {
             Logger.getLogger(ControladorConectar.class.getName()).log(Level.SEVERE, null, ex);
         }
             
             //daoConsulta.GrabarCalculo(campo_texto.getText());
             // campo_total.setText(datosCalc.getAcumulador().toString());
             //daoConsultar.GrabarCalculo(campo_texto.getText());
             /*daoConsultar.GrabarCalculo(campo_texto);
             System.out.println("dentro de mouse clicked " + campo_texto);
             
             //daoConsulta.GrabarCalculo(campo_texto.getText());
             // campo_total.setText(datosCalc.getAcumulador().toString());
             //daoConsultar.GrabarCalculo(campo_texto.getText());
             /*daoConsultar.GrabarCalculo(campo_texto);
             System.out.println("dentro de mouse clicked " + campo_texto);
             */
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
