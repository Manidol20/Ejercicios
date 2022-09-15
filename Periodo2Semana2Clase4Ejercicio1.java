/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2semana2clase4ejercicio1;

/**
 *
 * @author José Buruca
 */
public class Periodo2Semana2Clase4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int day = 5;
       String dayString;
       switch (day)
       {
           case 1: dayString = "Lunes";
           break;
           case 2: dayString = "Martes";
           break;
           case 3: dayString = "Miercoles";
           break;
           case 4: dayString = "Jueves";
           break;
           case 5: dayString = "Viernes";
           break;
           case 6: dayString = "Sabado";
           break;
           case 7: dayString = "Domingo";
           break;
           default: dayString = "Dia invalido";
           break;
       }
       System.out.println(dayString);
           
       }
    }
    

