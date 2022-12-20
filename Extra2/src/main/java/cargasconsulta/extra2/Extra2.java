package cargasconsulta.extra2;

import cargasconsulta.extra2.Service.Service;
import cargasconsulta.extra2.entidades.Edificio;
import cargasconsulta.extra2.entidades.Oficinas;
import cargasconsulta.extra2.entidades.Polideportivo;
import java.util.ArrayList;
import java.util.List;

public class Extra2 {

    public static void main(String[] args) {
        List<Edificio> lista = new ArrayList();
        Service service = new Service();
        for (int i = 0; i < 2; i++) {
            Edificio o = new Oficinas();
            o = service.crearOficina();
            lista.add(o);
            Edificio p = new Polideportivo();
            p = service.crearPolideportivo();
            lista.add(p);
        }
        int cantidad = 0;
        int libre = 0;

        for (Edificio edificio : lista) {
            int superficie = 0;
            int volumen = 0;
            if (edificio instanceof Oficinas) {

                System.out.println(edificio.toString());
                ((Oficinas) edificio).cantidadDePersonas();
                volumen = edificio.CalcularVolumen(edificio.getLargo(), edificio.getAncho(), edificio.getAlto());
                superficie = edificio.calcularSuperficie(edificio.getLargo(), edificio.getAncho());
                System.out.println("Superficie " + superficie);
                System.out.println("Volumen: "+ volumen);
            }
            if (edificio instanceof Polideportivo) {
                volumen = edificio.CalcularVolumen(edificio.getLargo(), edificio.getAncho(), edificio.getAlto());
                superficie = edificio.calcularSuperficie(edificio.getLargo(), edificio.getAncho());
                 System.out.println("Superficie " + superficie);
                System.out.println("Volumen: "+ volumen);
                System.out.println(edificio.toString());
                if (((Polideportivo) edificio).isTechado()) {
                    cantidad++;
                } else {
                    libre++;
                }
            }
        }
        System.out.println("La cantidad de Polideportivos techados son " + cantidad);
        System.out.println("La cantidad de Polideportivos al aire libre son " + libre);
    }
}
