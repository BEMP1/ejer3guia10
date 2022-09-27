package clase;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    protected int resolucion;
    protected boolean TVT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TVT) {
        this.resolucion = resolucion;
        this.TVT = TVT;
    }

    public Televisor(int resolucion, boolean TVT, double precio, String color, char consumoEnergetico, double pesoKg) {
        super(precio, color, consumoEnergetico, pesoKg);
        this.resolucion = resolucion;
        this.TVT = TVT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTVT() {
        return TVT;
    }

    public void setTVT(boolean TVT) {
        this.TVT = TVT;
    }

    public Televisor crearTelevisor(Televisor televisor) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        crearElectrodomestico(televisor);
        System.out.println("Ingrese resolucion");
        setResolucion(leer.nextInt());
        while (getResolucion() < 0) {
            System.out.println("Se ingreso una resolucion menor a 0");
            setResolucion(leer.nextInt());
        }
        System.out.println("¿Tiene el televisor un sintonizador TDT integrado? S/N");
        if (leer.next().equalsIgnoreCase("S")) {
            setTVT(true);
        } else {
            setTVT(false);
        }
        return televisor;
    }

    public void precioFinal(Televisor televisor) {
        super.precioFinal(televisor);
        if (TVT) {
            precio = precio + 500;
        }
        if (resolucion > 40) {
            precio = precio * 1.3;
        }

    }
}
