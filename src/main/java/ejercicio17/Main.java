package ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Electrodomestico> electrodomesticos = new ArrayList<>();
        electrodomesticos.add(new Electrodomestico());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Lavadora(200, "blanco", 'C', 70, 50));
        electrodomesticos.add(new Lavadora(300, "azul", 'A', 90, 20));
        electrodomesticos.add(new Lavadora(600, "rojo", 'E', 30, 10));
        electrodomesticos.add(new Television(300, "negro", 'D', 45, 70, true));
        electrodomesticos.add(new Television(400, "gris", 'A', 15, 50, false));
        electrodomesticos.add(new Television(900, "negro", 'A', 5, 100, true));
        electrodomesticos.add(new Electrodomestico(200, 100));

        double precioTV = 0;
        double precioLavadora = 0;
        double precioELectrodomestico = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Television) precioTV+=electrodomestico.precioFinal();
            else if (electrodomestico instanceof  Lavadora) precioLavadora +=electrodomestico.precioFinal();
            precioELectrodomestico += electrodomestico.precioFinal();
            System.out.println("El precio final del articulo es: "+electrodomestico.precioFinal());
        }
        System.out.println("El precio final de los tv es de: " +precioTV);
        System.out.println("El precio final de las lavadoras es de: " +precioLavadora);
        System.out.println("El precio total de todos los electrodomesticos es de: " +precioELectrodomestico);

    }
}
