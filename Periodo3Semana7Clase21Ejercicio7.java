/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3semana7clase21ejercicio7;

/**
 *
 * @author José Buruca
 */
public class Periodo3Semana7Clase21Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dinero = 1000;
        int mes = 1;
        while (mes<=12){
            dinero = dinero * 1.02;
            mes++;
        }
        System.out.println(dinero);
        }
    }
    

