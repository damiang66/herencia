package cargasconsulta.ejercicio2;

import cargasconsulta.ejercicio2.entidades.Electrodomestico;
import cargasconsulta.ejercicio2.entidades.Lavadora;
import cargasconsulta.ejercicio2.entidades.Televisor;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese los datos del lavarropa");
        Lavadora l = new Lavadora();
        l = l.crearLavadora();
        l.precioFinal(l.getConsumo(), l.getPeso());
        System.out.println("el color del lavarropa es " + l.getColor() + " el consumo energetico es " + l.getConsumo() + " el peso es de " + l.getPeso() + " el precio es " + l.getPrecio());
        System.out.println("------------------------");
        System.out.println("Ingrese los datos del Televisor");
        Televisor t = new Televisor();
        t = t.crearTelevisor();
        t.precioFinal(t.getConsumo(), t.getPeso());

        System.out.println(t.toString());
    }
}
