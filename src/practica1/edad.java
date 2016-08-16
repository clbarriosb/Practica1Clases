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
public class edad {
    public static void main(String[] args) {
        //Punto 19. Edad
        Scanner reader = new Scanner (System.in);    
        System.out.println("Ingrese su edad");
        int edad=Integer.parseInt(reader.nextLine());
        if (edad<=0 || edad >= 120){
            System.out.println("La edad ingresada es imposible.");   
        }
        else{
            System.out.println("Okay");
        }
    }         
}
