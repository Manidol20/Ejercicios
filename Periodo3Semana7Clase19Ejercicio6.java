/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3semana7clase19ejercicio6;
import java.util.Scanner;
/**
 *
 * @author José Buruca
 */
public class Periodo3Semana7Clase19Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objeto = new Scanner (System.in);
        int numero1, numero2, respuesta, contador;
        System.out.println("Ingresa el primer numero: ");
        numero1 = objeto.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        numero2 = objeto.nextInt();
        contador = numero1;
        while (contador > numero2) {
            System.out.println(contador);
            contador--;
        }
    }
    
}
