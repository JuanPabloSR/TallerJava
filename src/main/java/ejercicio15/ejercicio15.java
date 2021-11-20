package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        while (true){                 /** bucle para repetir el menu */
            Scanner scanner = new Scanner(System.in);
            System.out.println("****** GESTION CINEMATOGRAFICA ********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");
            int opcion = scanner.nextInt();
            switch (opcion){                                  /** switch para seleccionar los diferentes casos */
                case 1: continue;
                case 2: continue;
                case 3: continue;
                case 4: continue;
                case 5: continue;
                case 6: continue;
                case 7: continue;
                case 8: return;
            }
        }
    }
}
