package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner fraseNueva = new Scanner(System.in);
        String fraseAntigua = "La sonrisa sera la mejor arma contra la tristeza";

        System.out.println("ingrese una frase: ");
        String frase = fraseNueva.nextLine();

        String fraseNew = fraseAntigua.replace("a", "e");

        System.out.println(fraseNew + " " + frase);
    }
}
