/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3semana6clase18ejercicio1;
import java.util.Scanner;
/**
 *
 * @author José Buruca
 */
public class Periodo3Semana6Clase18Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int i = 1;
               int potencia;
               int base;
               int calculo = 1;
               System.out.println("Introduzca el valor de la base: ");
               base = teclado.nextInt();
               System.out.println("Introduzca el valor del exponente: ");
               potencia = teclado.nextInt();
               while (i<potencia){
                   calculo = calculo * base;
                   i ++;
               }
               System.out.println("El resultado del calculo de la potencia es: "+calculo);
               }
    }
    
}
