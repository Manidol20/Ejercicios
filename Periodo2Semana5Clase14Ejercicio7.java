/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2semana5clase14ejercicio1;
import java.util.Scanner; 
/**
 *
 * @author José Buruca
 */
public class Periodo2Semana5Clase14Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
int numlados;
    System.out.println("Numero de lados");
    numlados = entrada.nextInt();
    switch(numlados){
        case 1:
            System.out.println("No es figura");
            break;
            case 2:
            System.out.println("No es figura");
            break;
            case 3:
            System.out.println("Triangulo");
            break;
            case 4:
            System.out.println("Cuadrado o Rectangulo");
            break;
            case 5:
            System.out.println("Pentagono");
            break;
            case 6:
            System.out.println("Hexagono");
            break;
            case 8:
            System.out.println("Octagono");
            break;
            default:
                System.out.println("No registrada");
    }
    }
}
