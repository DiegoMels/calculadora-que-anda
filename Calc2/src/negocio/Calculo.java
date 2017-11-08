/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Principal.Datos_Calc;

/**
 *
 * @author leona
 */
public class Calculo {
    private Datos_Calc datosCalc;

    public Calculo(Datos_Calc datosCalc) {
        this.datosCalc = datosCalc;
    }
    
    private void suma(){
        datosCalc.setAcumulador(datosCalc.getAcumulador() + Double.valueOf(datosCalc.getUltimo_num()));
    }
    private void igual(){
      if(!this.datosCalc.getUltimo_num().equals("") && !this.datosCalc.getUltimo_op().equals("")){
          this.analizadorOperador(this.datosCalc.getUltimo_op());
          System.out.println("la variable dentro del = que se guardo es: " + datosCalc.getUltimo_num()); // PARA VER EL DIGITO QUE QUEDA EN EL IGUAL
      }    
    }
    public void analizadorOperador(String op){
        if(op.equals("+")){
            this.suma();
        }else if(op.equals("=")){
            this.igual();
        }
        this.datosCalc.setUltimo_op(this.datosCalc.getActual_op());
         datosCalc.setUltimo_num(null);
    }
}
