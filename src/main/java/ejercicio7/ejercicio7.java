package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double numero;
        boolean band = true;

        do {
            System.out.println("ingrese un numero");
            String numStr = num.nextLine();
            numero = Double.parseDouble((numStr));
            if (numero >= 0){
                System.out.println("el numero " + numero + " es mayor o igual a cero");
                band = false;
            } else {
                System.out.println("el numero " + numero + " es menor a cero");
            }
        } while (band);
    }
}
