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
    private Double num1 = 1.0;
    private Double rst;
    
    public Calculo(Datos_Calc datosCalc) {
        this.datosCalc = datosCalc;
    }
    
    private void suma(){
        datosCalc.setAcumulador(datosCalc.getAcumulador() + Double.valueOf(datosCalc.getUltimo_num()));
        System.out.println("el acumulador es: "+ datosCalc.getAcumulador());
        
    }
    private void resta(){
        datosCalc.setAcumulador(- datosCalc.getAcumulador() - Double.valueOf(datosCalc.getUltimo_num()));
    }
    private void multiplicar(){
        if (datosCalc.getAcumulador() == 0){
            datosCalc.setAcumulador(datosCalc.getConvertirUno());
        }
        datosCalc.setAcumulador(datosCalc.getAcumulador() * Double.valueOf(datosCalc.getUltimo_num()));
    }
    private void dividir(){
        if (datosCalc.getAcumulador() == 0){
            datosCalc.setAcumulador(datosCalc.getConvertirUno());
            datosCalc.setAcumulador(Double.valueOf(datosCalc.getUltimo_num()) / datosCalc.getAcumulador());

        }else
        datosCalc.setAcumulador(datosCalc.getAcumulador() / Double.valueOf(datosCalc.getUltimo_num()));

    }
 
    private void igual(){
      if(!this.datosCalc.getUltimo_num().equals("") && !this.datosCalc.getUltimo_op().equals("")){
          this.analizadorOperador(this.datosCalc.getUltimo_op());
      }    
    }
    public void analizadorOperador(String op){
        if(op.equals("+")){
            this.suma();
        }
        else if (op.equals("-")){
            this.resta();
        }
        else if (op.equals("*")){
            this.multiplicar();
        }
        else if (op.equals("/")){
            this.dividir();
        }
        else if(op.equals("=")){
            this.igual();
        }    
        this.datosCalc.setUltimo_op(this.datosCalc.getActual_op());
         datosCalc.setUltimo_num(null);
    }
}
