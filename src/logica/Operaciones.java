/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author jorge.marin
 */
public class Operaciones {
    private double resultado=0;
    
    public Operaciones() {
    }
    
    public double suma(double a, double b){
        resultado=a+b;
        return resultado;
    }
    
    public double resta(double a, double b){
        resultado=a-b;
        return resultado;
    }

    public double multiplicacion(double a, double b){
        resultado=a*b;
        return resultado;
    }

    public double division(double a, double b){
        resultado=a/b;
        return resultado;
    }

    public double potencia(double a,double b){
        resultado=Math.pow(a, b);
        return resultado;
    }
    
    public double raiz(double a,double b){
        resultado=a*Math.sqrt(b);
        return resultado;
    }
}