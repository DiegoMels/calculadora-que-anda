package datos;

import Principal.Datos_Calc;
import controlador.ControladorLetra;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Letra extends JButton {
    
    private String caption_num;
    private JTextField campo_texto;
    private ControladorLetra controladorLetra;
    private JTextField campo_total;
    private Datos_Calc datosCalc;
    
public Letra(String caption_num, JTextField campo_texto, JTextField pcampo_total, Datos_Calc pdatosCalc){
    
    this.caption_num = caption_num;
    this.campo_texto = campo_texto;
    this.campo_total=  pcampo_total;
    this.datosCalc = pdatosCalc;
    this.setText(caption_num);
    
    controladorLetra = new ControladorLetra(caption_num, campo_texto, pcampo_total, pdatosCalc);
    this.addMouseListener(controladorLetra);


    }
}