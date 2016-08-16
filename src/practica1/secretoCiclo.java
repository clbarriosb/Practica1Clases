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
public class secretoCiclo {
    public static void main(String[] args) {
        //Punto 22. Password
        Scanner reader = new Scanner (System.in);    
        while(true){
            System.out.println("Ingrese la contraseña para revelar el secreto");
            String contrasena = reader.nextLine();
            if (contrasena.equals("hola")){
                System.out.println("El secreto es: chao");
                break;
            }
            else{
                System.out.println("Contraseña incorrecta");
            }
        }
    }
}