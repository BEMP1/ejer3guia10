package clase;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    public double carga;

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double pesoKg) {
        super(precio, color, consumoEnergetico, pesoKg);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora(Lavadora lavadora) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        crearElectrodomestico(lavadora);
        System.out.println("Ingrese carga");
        setCarga(leer.nextDouble());
        while (getCarga() < 0) {
            System.out.println("Se ingreso una carga menor a 0");
            setCarga(leer.nextDouble());
        }
        return lavadora;
    }

    public void precioFinal(Lavadora lavadora) {
        super.precioFinal(lavadora);
        if (getCarga() > 30) {
            precio = precio + 500;
        }

    }

}
