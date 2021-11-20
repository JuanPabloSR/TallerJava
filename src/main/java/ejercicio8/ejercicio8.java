package ejercicio8;

import java.util.Scanner;
import java.util.Locale;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner diaIngresado = new Scanner(System.in);
        System.out.println("ingrese un dia");
        String dia = diaIngresado.nextLine();



        switch (dia.toLowerCase()){
            case "lunes":
                System.out.println("dia laboral");
                break;

            case "martes":
                System.out.println("dia laboral");
                break;

            case "miercoles":
                System.out.println("dia laboral");
                break;

            case "jueves":
                System.out.println("dia laboral");
                break;

            case "viernes":
                System.out.println("dia laboral y rumba in the night");
                break;

            case "sabado":
                System.out.println("dia de guayabo");
                break;

            case "domingo":
                System.out.println("dia de pereza");
                break;

            default:
                System.out.println("Día de descancito wuuu");
                break;
        }
    }
}
