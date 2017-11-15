package Principal;



public class Datos_Calc {
    
    private Double acumulador = 0.0;
    private Double acumuladorMulti = 1.0;

    public Double getAcumuladorMulti() {
        return acumuladorMulti;
    }

    public void setAcumuladorMulti(Double acumuladorMulti) {
        this.acumuladorMulti = acumuladorMulti;
    }
    private String ultimo_num = null;
    private String ultimo_op = "";
    private Double rst = 0.0;
    private String actual_op = "";

    public String getActual_op() {
        return actual_op;
    }

    public void setActual_op(String actual_op) {
        this.actual_op = actual_op;
    }

    
    
    public Double getAcumulador() {
        return acumulador;
    }

    public void setAcumulador(Double acumulador) {
        this.acumulador = acumulador;
    }

    public String getUltimo_num() {
        return ultimo_num;
    }

    public void setUltimo_num(String ultimo_num) {
        this.ultimo_num = ultimo_num;
    }

    public String getUltimo_op() {
        return ultimo_op;
    }

    public void setUltimo_op(String ultimo_op) {
        this.ultimo_op = ultimo_op;
    }

    public Double getRst() {
        return rst;
    }

    public void setRst(Double rst) {
        this.rst = rst;
    }
    
    
}
