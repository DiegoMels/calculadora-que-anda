package Principal;



public class Datos_Calc {
    
    private Double acumulador = 0.0;
    private String ultimo_num = "";
    private String ultimo_op = "";
    private Double rst = 0.0;

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
