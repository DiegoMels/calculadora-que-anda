package Principal;

import datos.Operador;
import datos.Letra;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Teclado extends JFrame {
     
    private GridLayout contenedor = new GridLayout(15,3);
    private JTextField campo_texto = new JTextField();
    private JTextField campo_total = new JTextField();
    private JButton borrar = new JButton("Borrar");
    private JButton borrarc_a_c = new JButton("Borrar c_a_c");
    private String bor_caracteres;
    
    
    public Teclado(){
        this.setLayout(contenedor);
        this.setTitle("Calculadora");
        this.setLocation(200,300);
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //hace que el programa se pare cuando se cierra la ventana

        Datos_Calc datosCalc = new Datos_Calc();  //Instanciamos esta clase que contiene las variables para los operadores.
        
        
        borrar.addActionListener(new ActionListener(){   //Este boton borrar todo el campo_texto de un solo click.
        public void actionPerformed(ActionEvent e) {
	campo_texto.setText("");
        }
        });  
        
        borrarc_a_c.addActionListener(new ActionListener(){   //Este boton borrar el campo_texto caracter a caracter.
        public void actionPerformed(ActionEvent e) {
	bor_caracteres = campo_total.getText();
        
        bor_caracteres = bor_caracteres.substring(0, bor_caracteres.length()-1);
        
        campo_total.setText(bor_caracteres);
        /*Esta variable borra caracter a caracter.
        El metodo substring logra esto, para ello tengo que asignar una variable,
        y lo que devuelve la seteamos en el campo correspondiente.
        */
        }
    });  
        
    this.add(borrar);
    this.add(borrarc_a_c);
    this.add(new JLabel("Acumulado"));
    this.add(campo_texto);
    this.add(new JLabel("Resultado Total"));
    this.add(campo_total);
    
    
    this.add(new Letra("0",campo_texto, campo_total, datosCalc));
    this.add(new Letra("1",campo_texto, campo_total, datosCalc));
    this.add(new Letra("2",campo_texto, campo_total, datosCalc));
    this.add(new Letra("3",campo_texto, campo_total, datosCalc));
    this.add(new Letra("4",campo_texto, campo_total, datosCalc));
    this.add(new Letra("5",campo_texto, campo_total, datosCalc));
    this.add(new Letra("6",campo_texto, campo_total, datosCalc));
    this.add(new Letra("7",campo_texto, campo_total, datosCalc));
    this.add(new Letra("8",campo_texto, campo_total, datosCalc));
    this.add(new Letra("9",campo_texto, campo_total, datosCalc));
    
    
    this.add(new Operador("+",campo_texto, campo_total, datosCalc));
    this.add(new Operador("-",campo_texto, campo_total, datosCalc));
    this.add(new Operador("*",campo_texto, campo_total, datosCalc));
    this.add(new Operador("/",campo_texto, campo_total, datosCalc));
    
    this.add(new Operador("=",campo_texto, campo_total, datosCalc));
    this.setVisible(true);    //Se pone abajo de todo, asi cuando termina de cargar todo lo que se le pide, lo muestra.
    }

    
    
}
