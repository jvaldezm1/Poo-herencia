
package javaapplication10;

import java.util.Scanner;
import javaapplication10.Calculadora;
import javaapplication10.calculadoraEspecial;


public class JavaApplication10 {

    public static void main(String[] args) {
          Scanner sn= new Scanner (System.in);
        Calculadora  Calcu = new Calculadora();
        Calcu.Datos();
        Calcu.sumar();
        System.out.print("el resultado de la suma es : ");
        Calcu.resultado();
        System.out.println();
       
     
    
        calculadoraEspecial calculadoraEspecial = new calculadoraEspecial();
        calculadoraEspecial.Datos();
        calculadoraEspecial.restar();
        System.out.print("el resultado de la resta es : ");
        calculadoraEspecial.resultado();
        System.out.println();
        
        
      
    }
    
}
