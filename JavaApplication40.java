/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication40;
import java.util.*;
/**
 *
 * @author Maria
 */
public class JavaApplication40 {

    /**
     * @param the command line arguments
     */
    public static void main(String[] args) {
       
        double radio, superficie, volumen;
        radio = leerRadio ();
        superficie = calcularSuperficie(radio);
        volumen = calcularVolumen(radio);
         System.out.println("La superfie de la esfera es " + superficie + " y el volumen es " +volumen);
    }
    
    static double leerRadio (){
        Scanner sc= new Scanner(System.in);
        double radio;
        do{
        System.out.println("Introduzca el radio de la esfera");
        radio = sc.nextDouble();
        } while (radio <= 0);
        return radio;
    }
    
    static double calcularSuperficie( double radio){
     double superficie;
     superficie = 4 * ( Math.PI) * (Math.pow(radio,2));
     return superficie;
    }
    static double calcularVolumen( double radio){
      double volumen;
      volumen =(( 4 * ( Math.PI))/3) * (Math.pow(radio,3));
      return volumen;
    }
    
    
    
}
