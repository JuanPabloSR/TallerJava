package ejercicio3;

import javax.swing.*;

public class ejercicio3 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("introduce el radio a calcular");
        double radio=Double.parseDouble(texto);

        double area=Math.PI*Math.pow(radio, 2);

        System.out.println("el area del circulo es "+area);
    }
}
