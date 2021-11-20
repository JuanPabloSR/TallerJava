package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        double iva = 0.21;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el valor del producto ");
        String precio = scanner.nextLine();
        double precioConIva = Double.parseDouble(precio)*iva + Double.parseDouble(precio);
        System.out.println("el valor con iva es: "+precioConIva);
    }
}
