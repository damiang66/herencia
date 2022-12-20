package cargasconsulta.extra2.Service;

import cargasconsulta.extra2.entidades.Oficinas;
import cargasconsulta.extra2.entidades.Polideportivo;
import java.util.Scanner;

public class Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Polideportivo  crearPolideportivo() {
        System.out.println("----------------");
        System.out.println("Ingreso de POlideportivo");
        Polideportivo p = new Polideportivo();
        System.out.println("Ingrese el ancho del Edificio");
        p.setAncho(leer.nextInt());
        System.out.println("Ingrese el alto del Edificio");
        p.setAlto(leer.nextInt());
        System.out.println("Ingrese el Largo del Edificio");
        p.setLargo(leer.nextInt());
        System.out.println("Ingrese el nombre del polideportivo");
        p.setNombre(leer.next());
        System.out.println("Ingrese si el Polideportivo esta Techado S/N");
        String opcion = leer.next();
        if (opcion.equalsIgnoreCase("SI")) {
            p.setTechado(true);
        } else {
            p.setTechado(false);
        }
        return p;
    }

    public Oficinas crearOficina() {
        System.out.println("----------------");
        System.out.println("Ingreso de Oficinas");
        Oficinas o = new Oficinas();
        System.out.println("Ingrese el ancho del Edificio");
        o.setAncho(leer.nextInt());
        System.out.println("Ingrese el alto del Edificio");
        o.setAlto(leer.nextInt());
        System.out.println("Ingrese el Largo del Edificio");
        o.setLargo(leer.nextInt());
        System.out.println("Ingrese numero  de oficina");
        o.setNumeroOficina(leer.nextInt());
        System.out.println("Ingrese la cantidad de personas por oficina");
        o.setPersonas(leer.nextInt());
        System.out.println("Ingrese la cantidad de pisos que tiene el Edificio");
        o.setNumeroPiso(leer.nextInt());
        return o;
    }
  
}
