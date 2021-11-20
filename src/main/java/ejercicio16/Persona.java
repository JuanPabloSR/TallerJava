package ejercicio16;

import java.util.concurrent.ThreadLocalRandom;

public class Persona {
    private String nombre = "";
    /**
     * clase persona con los atributos pedidos
     */
    private int edad = 0;
    private int dni;
    private char sexo = 'M';
    private double peso = 0;
    private double altura = 0;

    public Persona() {    /** se establecen los valores por defecto */
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'M';
        this.peso = 0;
        this.altura = 0;
        this.generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.generaDNI();
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double IMC = this.peso / (Math.pow(this.altura, 2));   /** altura elevado a la 2 para alla el imc */
        if (IMC < 20) {   /** peso ideal */
            return -1;
        }
        if (IMC >= 20 && IMC <= 25) {  /** debajo del peso ideal */
            return 0;
        }
        return 1;  /** sobrepeso */
    }

    public boolean mayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        }
        return false;
    }

    private void comprobarSexo() {
        if (this.sexo != 'M' && this.sexo != 'H') {
            this.sexo = 'H';
        }
    }

    public String[] toStringPerson() {
        String edad = String.valueOf(this.edad);
        String sexo = String.valueOf(this.sexo);
        String altura = String.valueOf(this.altura);
        String peso = String.valueOf(this.peso);
        String dni = String.valueOf(this.dni);
        String[] info = {this.nombre, edad, dni, sexo, peso, altura};
        return info;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private void generaDNI() {
        this.dni = ThreadLocalRandom.current().nextInt(10000000, 100000000);   /** generando numeros aleatorios para el dni*/
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
