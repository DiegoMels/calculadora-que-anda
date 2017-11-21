package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import DAO.Consulta;
import javax.swing.JTextField;
import negocio.Calculo;



public class ControladorGrabar implements MouseListener {

    
     Consulta daoConsulta;
    JTextField campo_texto;

    public ControladorGrabar(JTextField campo_texto) {
        this.campo_texto = campo_texto;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
      daoConsulta = new Consulta();
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
