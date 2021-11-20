package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("ingrese el numero 1");
        num1 = leer.nextByte();

        System.out.println("ingrese el numero 2");
        num2 = leer.nextByte();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " es mayor que " + num1);
        } else if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        } else if (num2 < num1) {
            System.out.println(num2 + " es menor que " + num1);
        } else if (num1 == num2) {
            System.out.println(num2 + " es igual a " + num1);
        }
    }
}

