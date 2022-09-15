/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16ejercicio1periodo1;
import java.util.Scanner;
/**
 *
 * @author José Buruca
 */
public class Clase16Ejercicio1Periodo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        n1=entrada.nextInt();
        System.out.print("Ingrese un numero: ");
        n2=entrada.nextInt();
        System.out.print("Ingrese un numero: ");
        n3=entrada.nextInt();
        if ((n1>n2)&&(n2>n3)){
            System.out.println("El orden es: " + n1 + n2 + n3);
        }
    else if ((n1>n3)&&(n3>n2)){

         System.out.println("El orden es: " + n1 + n3 + n2);
        }
    else if ((n2>n1)&&(n1>n3)){
        System.out.println("El orden es: " + n2 + n1 + n3);
        }
    else if ((n2>n3)&&(n3>n1)){
        System.out.println("El orden es: " + n3 + n2 + n1);
        }
    else if ((n1>n3)&&(n3>n2)){
    }
    }
}

  