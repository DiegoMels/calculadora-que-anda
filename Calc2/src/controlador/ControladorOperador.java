package controlador;

import Principal.Datos_Calc;
/*import static Principal.Teclado.acumulador;
import static Principal.Teclado.ultimo_num;
import static Principal.Teclado.ultimo_op;*/

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashSet;
import javax.swing.JTextField;
import negocio.Calculo;

public class ControladorOperador implements MouseListener {

        String caption_op;
        JTextField campo_texto;
        JTextField campo_total;
        Datos_Calc datosCalc;
        
        
    public ControladorOperador(String pcaption_op, JTextField pcampo_texto, JTextField pcampo_total, Datos_Calc pdatosCalc){
                
        this.caption_op = pcaption_op;
        this.campo_texto = pcampo_texto;
        this.campo_total = pcampo_total;
        this.datosCalc = pdatosCalc;
        }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        this.campo_texto.setText(campo_texto.getText() + caption_op); // Campo acumulador de cadena
        datosCalc.setActual_op(caption_op);
        Calculo unCalculo = new Calculo(datosCalc);
        unCalculo.analizadorOperador(datosCalc.getActual_op());

            campo_total.setText(datosCalc.getAcumulador().toString());
            //si dejo esta linea el resultado lo muestra por el campo total
            //si la saco, hace la suma la hace pero no la muestra en el campo total
  
        
       // campo_total.setText(datosCalc.getAcumuladorMulti().toString());
       //si pongo esta linea y saco la linea de: campo_total.setText(datosCalc.getAcumulador().toString());
       //la multiplicacion la hace y la muestra por el campo total       
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
