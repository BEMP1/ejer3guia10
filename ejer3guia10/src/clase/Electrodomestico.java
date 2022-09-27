package clase;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double pesoKg;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double pesoKg) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.pesoKg = pesoKg;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public void comprobarConsumoEnergetico(Electrodomestico electrodomestico) {
        if (electrodomestico.getConsumoEnergetico() != 'A' && electrodomestico.getConsumoEnergetico() != 'B' && electrodomestico.getConsumoEnergetico() != 'C' && electrodomestico.getConsumoEnergetico() != 'D' && electrodomestico.getConsumoEnergetico() != 'E' && electrodomestico.getConsumoEnergetico() != 'F') {
            electrodomestico.setConsumoEnergetico('F');
            System.out.println("Se cambio el consumo energetico");
        }
    }

    public String comprobarColor(String color) {
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
            color = "Blanco";
        }
        return color;
    }

    public Electrodomestico crearElectrodomestico(Electrodomestico electrodomestico) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        setPrecio(1000);
        System.out.println("Ingrese el color");
        setColor(leer.next());
        electrodomestico.setColor(comprobarColor(getColor()));
        System.out.println("Ingrese el consumo electrico");
        setConsumoEnergetico(Character.toUpperCase(leer.next().charAt(0)));
        comprobarConsumoEnergetico(electrodomestico);
        System.out.println("Ingrese el peso en Kg");
        setPesoKg(leer.nextDouble());
        while (getPesoKg() < 0) {
            System.out.println("Se ingreso un peso menor a 0");
            setPesoKg(leer.nextDouble());
        }

        return electrodomestico;
    }

    public void precioFinal(Electrodomestico electrodomestico) {
        switch (getConsumoEnergetico()) {
            case 'A':
                precio = precio + 1000;
                break;
            case 'B':
                precio = precio + 800;
                break;
            case 'C':
                precio = precio + 600;
                break;
            case 'D':
                precio = precio + 500;
                break;
            case 'E':
                precio = precio + 300;
                break;
            case 'F':
                precio = precio + 100;
                break;
            default:
                System.out.println("Error al subir el precio en el consumo");
        }

        switch ((int) getPesoKg() / 10) {
            case 0:
            case 1:
                precio = precio + 100;
                break;
            case 2:
            case 3:
            case 4:
                precio = precio + 500;
                break;
            case 5:
            case 6:
            case 7:
                precio = precio + 800;
                break;
            default:
                precio = precio + 1000;
        }

    }
}
