
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1taller2andresushiña;
import java.util.Scanner;


/**
 *
 * @author ESPE
 */
public class P1Taller2AndresUshiña {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner (System.in);
        System.out.print ("***************************************** ");
        System.out.print ("Nombre: Andres Ushiña");
        System.out.print ("Fecha: 10/11/2023 ");
        System.out.print ("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.print ("*****************************************");
        
    
        System.out.print ("ingrese el primer numero: ");
        double numero1= scanner.nextDouble ();
        
        System.out.print ("ingrese el segundo numero: ");
        double numero2= scanner.nextDouble ();
        
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multi = numero1*numero2;
        double division = numero1/numero2;
    
        System.out.print("La suma de " + numero1 + "y " + numero2 + "es: " + suma);
        System.out.print("La resta de " + numero1 + " y " + numero2 + " es " + resta);
        System.out.print("La multiplicacion de " + numero1 + " y " + numero2 + " es " + multi);
        System.out.print("La division de " + numero1 + " y " + numero2 + " es " + division);
    }
    
}
