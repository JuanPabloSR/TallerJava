package ejercicio17;

public class Television extends Electrodomestico {
    private double resolucion;
    private boolean sintonizadorTDT;

    /**
     * nuevos atributos
     */
    public Television() {
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    /**
     * contructor precio y peso
     */
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (this.resolucion>40) precioFinal+=precioFinal*0.3;
        if (this.sintonizadorTDT) precioFinal+=precioFinal*0.5;
        return precioFinal;
    }
}
