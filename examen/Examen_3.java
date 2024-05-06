package examen;

import java.util.Scanner;

public class Examen_3 {

    public static void main(String[] args) {
        int mes=0,dias=0;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Numero de mes");
        mes= teclado.nextInt();

        switch(mes){
            case 1:
            System.out.println("Enero:31 dias");
            break;
            case 2:
            System.out.println("Febrero:28-29");
            break;
            case 3:
            System.out.println("Marzo:31");
            break;
            case 4:
            System.out.println("Abril:30");
            break;
            case 5:
            System.out.println("Mayo:31");
            break;

            case 6:
            System.out.println("Junio:28");
            break;

            case 7:
            System.out.println("Julio:31");
            break;
            case 8:
            System.out.println("Agosto:30");
            break;
            case 9:
            System.out.println("Septiembre:30");
            break;
            case 10:
            System.out.println("Octubre:31");
            break;
            case 11:
            System.out.println("Noviembre:29");
            break;
            case 12:
            System.out.println("Diciembre:31");
            break;
            default:
            System.out.println("El numero asignado no coincide con un numero del mes del año");
            System.out.println("Vuelva a intentar");
        }
    }
}