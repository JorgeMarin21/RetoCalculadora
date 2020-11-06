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
public class OperaCadena {
     
    public double resuelveCadena(String cad){
        Operaciones opera=new Operaciones();
        double result=0;  
        double numero=0;
        
        StringBuilder num1= new StringBuilder();
        int control=0;
        int controlNegativo=0;
        char op=0;
        int i;
        cad=cad+" ";
        
        for(i=0;i<cad.length();i++){
            if(cad.charAt(0)=='-'){
                num1.append(cad.charAt(i));
                i++;
            }
            if(i>0){
                if(esOperador(cad.charAt(i-1)))
                   if(cad.charAt(i)=='-'){
                       num1.append(cad.charAt(i));
                       i++;
                     //  controlNegativo=1;
                   }
                
            }
            
            while(Character.isDigit(cad.charAt(i))||cad.charAt(i)=='.'){
                num1.append(cad.charAt(i));
                i++;
            }
            
            System.out.println(num1);
            numero=Double.parseDouble(num1.toString());
            System.out.println("asi quedo el numero:"+numero);
            num1.setLength(0);
            if(control==0){
                result=opera.suma(result, numero);
                System.out.println("r="+result);
                control=1;
            }else{
                if(op=='+'){
                    result=opera.suma(result, numero);
                }else if(op=='-'){
                    result=opera.resta(result, numero);
                }else if(op=='*'){
                    result=opera.multiplicacion(result, numero);
                }else if(op=='/'){
                    result=opera.division(result, numero);
                }else if(op=='^'){
                    result=opera.potencia(result, numero);  
                }else if(op=='√'){
                        result=opera.raiz(result,numero);  
                }else if(cad.charAt(i)==' ')
                    break;
            }
            System.out.println("op:"+op);
            if(esOperador(cad.charAt(i))){
                
                op=cad.charAt(i);
                System.out.println("entra y es "+cad.charAt(i));
            }
            System.out.println("num:"+i);
            System.out.println("cad.le:"+cad.length());
        }
        
        
        return result;
    }
    
    private boolean esOperador(char a){
        boolean b=false;
        if(a=='+'||a=='-'||a=='*'||a=='/'||a=='√'||a=='^'){
            b=true;
        }
        return b;
    }
    
        
        
}
