/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;



public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CalculadoraLogica calculadora = new CalculadoraLogica ();
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingrese Operando1");
    calculadora.setOperando1(sc.nextInt() );
    System.out.println("Ingrese Operando 2");
    calculadora.setOperando2(sc.nextInt());
    System.out.println("suma=");
    calculadora.sumar();
    System.out.println(calculadora.getResultado());
    System.out.println("resta=");
    calculadora.restar();
    System.out.println(calculadora.getResultado());
    System.out.println("multiplicacion=");
    calculadora.multiplicar();
    System.out.println(calculadora.getResultado());
    System.out.println("division=");
    calculadora.dividir();
    System.out.println(calculadora.getResultado());

    }
    
}
