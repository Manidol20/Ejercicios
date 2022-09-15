/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11periodo4ejercico1;
import java.util.Scanner;
/**
 *
 * @author José Buruca
 */
public class Clase11Periodo4Ejercico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        float nota1, nota2, nota3, promedio;
        System.out.println("Ingrese la primera nota");
        nota1 = Entrada.nextFloat();
        System.out.println("Ingrese la primera nota");
        nota2 = Entrada.nextFloat();
        System.out.println("Ingrese la primera nota");
        nota3 = Entrada.nextFloat();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);
        if (promedio >= 4) {
            System.out.println("Promocionado");
        } else if (promedio >= 4){
            System.out.println("Regular");
        } else { 
            System.out.println("Reprobado");
        }
        
    }
    
}
