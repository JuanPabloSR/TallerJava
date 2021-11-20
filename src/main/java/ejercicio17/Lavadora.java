package ejercicio17;

public class Lavadora extends Electrodomestico{
    private double carga;

    public Lavadora() {
        this.carga = 5;
    }
    /** constructor precio y peso */
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }
    /** constructor carga y demas */
    public Lavadora(double precioBase, String color, char consumoElectrico, double peso, double carga) {
        super(precioBase, color, consumoElectrico, peso);
        this.carga = carga;
    }
    /** metodo get carga */
    public double getCarga(){
        return carga;
    }
    public void setCarga(double carga){
        this.carga =carga;
    }
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (this.carga>30) precioFinal+=50;
        return precioFinal;
    }

}
