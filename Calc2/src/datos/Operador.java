package datos;

import Principal.Datos_Calc;
import controlador.ControladorOperador;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Operador extends JButton {
    
    private String caption_op ;
    private JTextField campo_texto;
    private JTextField campo_total;
    private ControladorOperador controladorOperador ;
    Datos_Calc datosCalc;
   

    public Operador(String pcaption_op, JTextField pcampo_texto, JTextField pcampo_total, Datos_Calc pdatosCalc){
    
        this.caption_op = pcaption_op;
        this.campo_texto = pcampo_texto;
        this.campo_total = pcampo_total;
        this.datosCalc = pdatosCalc;
        this.setText(caption_op);
    
        
        controladorOperador = new ControladorOperador(caption_op, campo_texto, campo_total, datosCalc);
        addMouseListener(controladorOperador);
        }

}
