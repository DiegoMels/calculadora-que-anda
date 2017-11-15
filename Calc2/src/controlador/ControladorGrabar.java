/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.Consultar;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author alumno
 */
public class ControladorGrabar implements MouseListener {
    
   Consultar daoConsultar = new Consultar();
   JTextField campo_texto;
   private String calculo;

    public ControladorGrabar(JTextField pcampo_texto) {
        this.campo_texto = pcampo_texto;
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {

        
       // campo_total.setText(datosCalc.getAcumulador().toString());
        //daoConsultar.GrabarCalculo(campo_texto.getText());
        /*daoConsultar.GrabarCalculo(campo_texto);
        System.out.println("dentro de mouse clicked " + campo_texto);
        */
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
