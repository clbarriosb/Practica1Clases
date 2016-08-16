/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class numeroMayor {
    public static void main(String[] args) {
        //Punto 11. Mayor numero de dos ingresados
    
        Scanner reader = new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
        double primerNumero= Integer.parseInt(reader.nextLine());
        System.out.println("Ingrese el segundo numero");
        double segundoNumero= Integer.parseInt(reader.nextLine());
        Math.max( primerNumero, segundoNumero);
        System.out.println("El mayor numero es:" + Math.max( primerNumero, segundoNumero));
        
        //Punto 16. Par o impar
        System.out.println("Ingrese un numero para determinar si es par o impar");
        int parOimpar=Integer.parseInt(reader.nextLine());
        if (parOimpar %2 == 0){
            System.out.println("El numero " + parOimpar + " es par");
        }
        else{
            System.out.println("El numero  " + parOimpar + "  es impar");
        }
    }
}
