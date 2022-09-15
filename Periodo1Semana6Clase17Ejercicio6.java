/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase17ejercicio1periodo1;
import java.util.Scanner;

/**
 *
 * @author José Buruca
 */
public class Clase17Ejercicio1Periodo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre,clave;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese Nombre de usuario:");
        nombre = entrada.nextLine();
        System.out.print("Ingrese clave de usuario:");
        clave = entrada.nextLine();
        if(nombre.equals("juan")&& clave.equals("123456")){
            System.out.println("Bienvenido al sistema");
    }
    else{
    System.out.println("Nombre de Usuario o contraseña Incorrecto");
} 
    }
}

