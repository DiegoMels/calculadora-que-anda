package controlador;

import Principal.Datos_Calc;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
//import static Principal.Teclado.ultimo_num;

public class ControladorLetra implements MouseListener {

   String caption;
   JTextField campo_texto; 
   JTextField campo_total;
   //Double rst;
   Datos_Calc datosCalc;
   
    public ControladorLetra(String pcaption_num, JTextField pcampo_texto, JTextField pcampo_total, Datos_Calc pdatosCalc) {
        this.caption = pcaption_num;
        this.campo_texto = pcampo_texto;
        campo_total = pcampo_total;
        this.datosCalc = pdatosCalc;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        this.campo_texto.setText(campo_texto.getText() + caption); //Acumula lo que tiene escrito + lo que entra.
        if(datosCalc.getUltimo_num() == null){
            datosCalc.setUltimo_num(caption);
        }else{
            datosCalc.setUltimo_num(datosCalc.getUltimo_num() + caption);
        }
        
        //ultimo_num = ultimo_num + caption;
        System.out.println("dentro del controlador letra: " + datosCalc.getUltimo_num());
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
