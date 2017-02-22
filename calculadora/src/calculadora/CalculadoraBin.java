/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static java.lang.Integer.toBinaryString;

/**
 *
 * @author anten
 */
class CalculadoraBin extends CalculadoraLogica {
    public String convertir(int n) {
        return Integer.toBinaryString(n);
    }
    
    public int ingresar (String nu){
        int num=Integer.parseInt(nu,2);
        return num;
    }
    
}
