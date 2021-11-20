package ejercicio17;

public class Electrodomestico {
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    protected static final String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};

    public Electrodomestico() {
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.precioBase = 100;
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {   /** constructor precio y peso */
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {   /** constructor para todos los atributos */
        this.precioBase = precioBase;
        this.color = this.comprobarColor(color);
        this.consumoEnergetico = this.comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    /**
     * metodos get and set para todos los atributos
     */
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = this.comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = this.comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static String[] getColores() {
        return colores;
    }
/** asignar F por defecto */
    private char comprobarConsumoEnergetico(char letra) {
        char letraReturn = 'F';
        if ((65 <= (int) letra) && ((int) letra <= 70)) {
            letraReturn = letra;
        }
        return letraReturn;
    }
/** comprobar y/o asignar blanco por defecto */
    private String comprobarColor(String color) {
        String colorReturn = "blanco";
        String colorUser = color.toLowerCase();
        for (String string : colores) {
            if (string == colorUser) colorReturn = colorUser;
        }
        return colorReturn;
    }

    public double precioFinal() {             /** seleccionar que tipo de consumo tiene y agregar valor segun su consumo*/
        double precioFinal = this.precioBase;
        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            default:
                precioFinal += 10;
                break;
        }
        if (this.peso >= 20 && this.peso <= 49) precioFinal += 50;     /** agregar valor en base al peso */
        else if (this.peso >= 50 && this.peso <= 79) precioFinal += 80;
        else if (this.peso >= 80) precioFinal += 100;
        else precioFinal += 10;
        return precioFinal;
    }


}




















