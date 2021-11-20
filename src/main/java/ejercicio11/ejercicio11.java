package ejercicio11;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ejercicio11 {


    public static void main(String[] args) {
        Scanner fraseNew = new Scanner(System.in);
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        int contadorA, contadorE, contadorI, contadorO, contadorU;
        contadorA = contadorE = contadorI = contadorO = contadorU = 0;

        System.out.println("Ingrese una frase cualquiera ");
        String frase = fraseNew.nextLine();

        for(int i=0; i<frase.length(); i++) {
            char letra = frase.charAt(i);                         /** guardamos cada vocal en su respectivo espacio y vamos incrementando */
            if(Character.compare(letra, vocales[0]) == 0) {
                contadorA++;
            } else if((Character.compare(letra, vocales[1]) == 0)) {
                contadorE++;
            } else if((Character.compare(letra, vocales[2]) == 0)) {
                contadorI++;
            } else if((Character.compare(letra, vocales[3]) == 0)) {
                contadorO++;
            } else if((Character.compare(letra, vocales[4]) == 0)) {
                contadorU++;
            }
        }

        System.out.println("La frase tiene longitud de " + frase.length() + " caracteres " + ", #letras a -> " + contadorA + ", #letras e -> " + contadorE + ", #letras i -> " + contadorI + ", #letras o -> " + contadorO + ", #letras u -> " + contadorU);

    }
}