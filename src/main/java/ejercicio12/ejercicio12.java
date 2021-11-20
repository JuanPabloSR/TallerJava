package ejercicio12;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner frase1 = new Scanner(System.in);
        Scanner frase2 = new Scanner(System.in);
        ArrayList<String> diffFrasea = new ArrayList<>();   /** declaramos el array */
        ArrayList<String> diffFraseb = new ArrayList<>();

        System.out.println("Ingrese la primer frase ");     /** pedimos las frases */
        String frasea = frase1.nextLine();

        System.out.println("Ingrese la segunda frase ");
        String fraseb = frase2.nextLine();

        int i;
        for(i=0; i<frasea.length() && i<fraseb.length(); i++){    /** añadimos las frases al arraylist */
            if(frasea.charAt(i) != fraseb.charAt(i)){
                diffFrasea.add(frasea.valueOf(frasea.charAt(i)));
                diffFraseb.add(fraseb.valueOf(fraseb.charAt(i)));
            }
        }

        if (i < frasea.length()){
            diffFrasea.add(frasea.substring(i));
        } else if (i < fraseb.length()) {
            diffFraseb.add(fraseb.substring(i));
        }

        if (diffFrasea.isEmpty() && diffFraseb.isEmpty()) {
            System.out.println("las palabras son iguales");
        } else {
            System.out.println("diferencias en la frase 1: " +diffFrasea + ", frase 2: " +diffFraseb);
        }
    }
}
