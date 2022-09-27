package ejer3guia10;

import clase.Electrodomestico;
import clase.Lavadora;
import clase.Televisor;
import java.util.ArrayList;

public class Ejer3guia10 {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        Lavadora lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora();
        Televisor televisor1 = new Televisor();
        Televisor televisor2 = new Televisor();
        int suma = 0;
        electrodomesticos.add(lavadora1.crearLavadora(lavadora1));
        electrodomesticos.add(lavadora2.crearLavadora(lavadora2));
        electrodomesticos.add(televisor1.crearTelevisor(televisor1));
        electrodomesticos.add(televisor2.crearTelevisor(televisor2));
        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal(electrodomestico);
        }
        for (Electrodomestico electrodomestico : electrodomesticos) {
            suma = (int) electrodomestico.getPrecio() + suma;
        }
        System.out.println("El precio entre todos es " + suma);
    }

}
