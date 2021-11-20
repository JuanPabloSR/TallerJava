package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        System.out.println("ingrese un texto");
        String newTexto = texto.nextLine();

        String textReplace = newTexto.replace(" ", "");   /** se usa la funcion replace para cambiar los espacios */
        System.out.println(textReplace);

    }
}
