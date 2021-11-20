package ejercicio5;

import java.util.ArrayList;

public class ejercicio5 {
    public static void main(String[] args) {
        int num = 1;
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();
        while (num <= 100) {
            if (num % 2 == 0) {
                numerosPares.add(num);

            } else {
                numerosImpares.add(num);
            }
            num++;
        }

        System.out.println("Números pares e impares del 1 al 100");
        System.out.println("******************************************************************************************************************************************************************************************");
        System.out.println("Números pares: " + numerosPares);
        System.out.println("******************************************************************************************************************************************************************************************");
        System.out.println("Números impares: " + numerosImpares);
    }
}

