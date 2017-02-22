package calculadora;


public class CalculadoraLogica {
    int operando1;
    int operando2;
    int resultado;
    
    public void setOperando1(int valor){
        operando1=valor;
    }
    public void setOperando2(int valor){
        operando2=valor;
    }
    public int getResultado(){
        return resultado;
    }
    public void sumar(){
        resultado=operando1+operando2;
    }
    public void restar(){
        resultado=operando1-operando2;
    }
    public void multiplicar(){
        resultado = operando1*operando2;
    }
    public void dividir (){
        resultado = operando1/operando2;
    }

    int ingresar(String nu) {
        return 0;
    }

    public String convertir(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
