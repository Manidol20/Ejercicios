/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2semana2clase5ejercicio1;

/**
 *
 * @author José Buruca
 */
public class Periodo2Semana2Clase5Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Branch = "CSE";
        int year = 2;
        switch(year)
        {
            case 1 :
                System.out.println("Cursos electivos: Ingles, Calculo");
                break;
            case 2:
                switch (Branch)
                { 
                    case "CSE":
                        case "CCE":
                        System.out.println("Cursos electivos : Machine Learning, Big data");
                        break;
                        case "ECE":
                            System.out.println("Cursos elecctivos : Programacion");
                            break;
                        default:
                            System.out.println("Cursos electivos : Ingenieria de Software");
                }
        }
    }
    
}
