package controlador;

import Principal.Datos_Calc;
/*import static Principal.Teclado.acumulador;
import static Principal.Teclado.ultimo_num;
import static Principal.Teclado.ultimo_op;*/

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

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
        
            if (caption_op.equals("=")){
            //this.campo_total.setText(datosCalc.getAcumulador().toString());
            //cada ves que apreto el + guarda el ultimo digito
            //tengo que hacer que cuando aprete el = me haga la cuenta
            caption_op = "";
            datosCalc.setAcumulador(0.0);
            System.out.println("la variable dentro del = que se guardo es: " + datosCalc.getUltimo_num()); // PARA VER EL DIGITO QUE QUEDA EN EL IGUAL
            //datosCalc.setAcumulador(datosCalc.getAcumulador() + Double.valueOf(datosCalc.getUltimo_num()) ); // ACA ME TOMA EL ULTIMO DIGITO DESPUES DEL +
            //datosCalc.setAcumulador(Double.valueOf(datosCalc.getUltimo_num()));
   
        }
       else if (caption_op.equals("+")){
           datosCalc.setAcumulador(datosCalc.getAcumulador() + Double.valueOf(datosCalc.getUltimo_num()) );
           System.out.println("la variable: " + datosCalc.getUltimo_num() + " se guardo en el controlador operador +"); // PARA VER EL DIGITO QUE QUEDA EN LA SUMA
           campo_total.setText(datosCalc.getAcumulador().toString()); // CADA VES QUE APRETO EL MAS SUMA LOS DIGITOS Y LOS MUESTRA
              datosCalc.setUltimo_num("");
              datosCalc.setUltimo_op("");   
        }
        /* 
        else if (caption_op.equals("-")){
           datosCalc.setAcumulador(datosCalc.getAcumulador() + Double.valueOf(datosCalc.getUltimo_num()) );
           System.out.println("la variable: " + datosCalc.getUltimo_num() + " se guardo en el controlador operador -"); // PARA VER EL DIGITO QUE QUEDA EN LA RESTA
           this.campo_total.setText(datosCalc.getAcumulador().toString()); // CADA VES QUE APRETO EL MAS RESTA LOS DIGITOS Y LOS MUESTRA
              datosCalc.setUltimo_num("");
              datosCalc.setUltimo_op("");  
        }
            
            else if (caption_op.equals("/")){
           datosCalc.setAcumulador(datosCalc.getAcumulador() + Double.valueOf(datosCalc.getUltimo_num()) );
           System.out.println("la variable: " + datosCalc.getUltimo_num() + " se guardo en el controlador operador /"); // PARA VER EL DIGITO QUE QUEDA EN LA DIVISION
           this.campo_total.setText(datosCalc.getAcumulador().toString()); // CADA VES QUE APRETO EL MAS DIVISION LOS DIGITOS Y LOS MUESTRA
              datosCalc.setUltimo_num("");
              datosCalc.setUltimo_op("");  
        }
            
            else if (caption_op.equals("*")){
           datosCalc.setAcumulador(datosCalc.getAcumulador() + Double.valueOf(datosCalc.getUltimo_num()) );
           System.out.println("la variable: " + datosCalc.getUltimo_num() + " se guardo en el controlador operador *"); // PARA VER EL DIGITO QUE QUEDA EN LA MULTIPLICACION
           this.campo_total.setText(datosCalc.getAcumulador().toString()); // CADA VES QUE APRETO EL MAS MULTIPLICACION LOS DIGITOS Y LOS MUESTRA
              datosCalc.setUltimo_num("");
              datosCalc.setUltimo_op("");  
        }*/
        
        /*datosCalc.setUltimo_num("");
        datosCalc.setUltimo_op("");
  
        
        //////////// LO QUE ESTABA HECHO ///////////////////
        /*ultimo_op = caption_op;
        if(caption_op.equals("=")){
            this.campo_total.setText(acumulador.toString());            
            ultimo_op = "";
            acumulador = 0.0;
        }else if(caption_op.equals("+")){
           System.out.println(ultimo_num);
           acumulador = acumulador + Double.valueOf(ultimo_num);
        }
        ultimo_num = "";*/
        
               
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
