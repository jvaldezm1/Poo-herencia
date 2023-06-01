/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author miran
 */
public class clasePadre {
     protected int resultado,valor1,valor2;
    Scanner entrada= new Scanner (System.in );
   
    
    public void Datos (){
    System.out.println("escriba el primer valor :");
    valor1= entrada.nextInt();
   
    
    
    System.out.println("escriba el segundo valor : ");
    valor2=entrada.nextInt();
     
    }
    
     public void resultado (){
    System.out.println(resultado);
    
    }
    
}
