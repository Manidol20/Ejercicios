/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3semana3clase8ejercicio1;
import java.util.Scanner;
/**
 *
 * @author JosÃ© Buruca
 */
public class Periodo3Semana3Clase8Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        String quieroJugar = "si";
        while(quieroJugar.equals("si")){
            System.out.println("¿Quieres seguir jugando?");
            quieroJugar = Reader.next();
            
        }
    }
    
}
