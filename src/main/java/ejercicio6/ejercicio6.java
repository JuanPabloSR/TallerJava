package ejercicio6;

import java.util.ArrayList;

public class ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();
        int x = 0;
        for (x = 0; x <= 100; x++) {
            if (x % 2 == 0) {
                numerosPares.add(x);
            }
            x++;
        }
        System.out.println("numeros pares e impares");
        for (x = 0; x <= 100; x++) {
            if ((x % 2) != 0) {
                numerosImpares.add(x);
            }
        }
        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números impares: " + numerosImpares);
    }
}
