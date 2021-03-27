package dylan.perez.calculadora.model;

public class Calculadora {

    private double vlr1;
    private double vlr2;
    private double result;

    //Métodos
    public String suma(double v1, double v2){
        this.vlr1 = v1;
        this.vlr2 = v2;
        this.result = vlr1 + vlr2;
        return Double.toString(result);
    }

    public String resta(double v1, double v2){
        this.vlr1 = v1;
        this.vlr2 = v2;
        this.result = vlr1 - vlr2;
        return Double.toString(result);
    }

    public String multiplicacion(double v1, double v2){
        this.vlr1 = v1;
        this.vlr2 = v2;
        this.result = vlr1 * vlr2;
        return Double.toString(result);
    }

    public String division(double v1, double v2){
        this.vlr1 = v1;
        this.vlr2 = v2;
        this.result = vlr1 / vlr2;
        return Double.toString(result);
    }

    public Double getVlr1() {
        return vlr1;
    }
    public void setVlr1(Double vlr1) {
        this.vlr1 = vlr1;
    }
    public Double getVlr2() {
        return vlr2;
    }
    public void setVlr2(Double vlr2) {
        this.vlr2 = vlr2;
    }
    public Double getResult() {
        return result;
    }
    public void setResult(Double result) {
        this.result = result;
    }
}
