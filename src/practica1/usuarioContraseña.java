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
public class usuarioContraseña {
    public static void main(String[] args) {
        //Punto 20. Username
        Scanner reader = new Scanner (System.in);    
        System.out.println("Ingrese su nombre de usuario");
        String nombreUsuario = reader.nextLine();
        System.out.println("Ingrese su contraseña");
        String password = reader.nextLine();
        
        if (nombreUsuario.equals("alex") && password.equals("mightyducks") || 
                nombreUsuario.equals("emily") && password.equals("cat")){
            System.out.println("Tu seccion ha iniciado");
            }
        else{
            System.out.println("Tu contraseña o usuario es incorrecta");
        }
    }          
}
