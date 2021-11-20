package ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = scanner2.nextInt();
        System.out.println("Ingrese el sexo: ");
        String sexoString = scanner.nextLine();
        System.out.println("Ingrese la altura: ");
        String alturaString = (scanner.nextLine());
        System.out.println("Ingrese el peso: ");
        String pesoString = (scanner.nextLine());

        double altura = Double.parseDouble(alturaString);
        double peso = Double.parseDouble(pesoString);
        char sexo = sexoString.charAt(0);
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        int imcPersona1 = persona1.calcularIMC();
        mensajePeso(imcPersona1);
        boolean mayorDeEdadPersona1 = persona1.mayorDeEdad();
        mensajeMayorEdad(mayorDeEdadPersona1);
        String[] infoPersona1 = persona1.toStringPerson();
        imprimirInfoPersona(infoPersona1);

        System.out.println("Ingrese el nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad2 = scanner2.nextInt();
        System.out.println("Ingrese el sexo");
        String sexo2String = scanner.nextLine();
        char sexo2 = sexo2String.charAt(0);

        Persona persona2 = new Persona(nombre2, edad2, sexo2);
        int imcPersona2 = persona2.calcularIMC();
        mensajePeso(imcPersona2);
        boolean mayorDeEdadPersona2 = persona2.mayorDeEdad();
        mensajeMayorEdad(mayorDeEdadPersona2);
        String[] infoPersona2 = persona2.toStringPerson();
        imprimirInfoPersona(infoPersona2);

        Persona persona3 = new Persona();
        persona3.setNombre("Camilo");
        persona3.setEdad(17);
        persona3.setPeso(89);
        persona3.setAltura(1.65);
        persona3.setSexo('M');
        int imcPersona3 = persona3.calcularIMC();
        mensajePeso(imcPersona3);
        boolean mayorDeEdadPersona3 = persona1.mayorDeEdad();
        mensajeMayorEdad(mayorDeEdadPersona3);
        String[] infoPersona3 = persona3.toStringPerson();
        imprimirInfoPersona(infoPersona3);
    }

    private static void imprimirInfoPersona(String[] infoPersona) {
        for(int i = 0; i<infoPersona.length; i++){
            System.out.println(infoPersona[i]);
        }
    }

    public static void mensajePeso(int imc){
        if(imc == -1){
            System.out.println("Esta por debajo del peso");
            return;
        }
        if(imc == 0){
            System.out.println("Esta en peso ideal");
            return;
        }
        System.out.println("Esta en sobrepeso");
        return;
    }

    public static void mensajeMayorEdad(boolean edad){
        if(edad){
            System.out.println("Es mayor de edad");
            return;
        }
        System.out.println("Es menor de edad");
        return;
    }

}
