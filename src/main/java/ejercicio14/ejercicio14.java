package ejercicio14;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner numeroNew = new Scanner(System.in);

        System.out.println("ingrese un numero ");
        String numerostr = numeroNew.nextLine();
        int numero = Integer.parseInt(numerostr);

        do {
            System.out.println(numero);
            if (numero > 1000){ numero -=2; }  /** imprimir si el numero es mayor que 1000 */
            if (numero < 1000){ numero +=2; }  /** imprimir si el numero es menor que 1000 */
            if (numero == 1000){
                System.out.println(numero);   /** en caso de ser igual */
            }
        } while (numero != 1000);
    }
}
