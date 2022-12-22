package cargasconsulta.extra3.service;

import cargasconsulta.extra3.entidades.Alojamiento;
import cargasconsulta.extra3.entidades.Camping;
import cargasconsulta.extra3.entidades.Hotel4;
import cargasconsulta.extra3.entidades.Hotel5;
import cargasconsulta.extra3.entidades.Residencia;
import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Alojamiento> lista = new ArrayList();

    public List<Alojamiento> crear() {
        Hotel4 hotel4 = new Hotel4();
        Hotel4 hotel4a = new Hotel4();
        Hotel5 hotel5 = new Hotel5();
        Hotel5 hotel6 = new Hotel5();
        Camping camping = new Camping();
        Camping camping1 = new Camping();
        Residencia r = new Residencia();
        Residencia r1 = new Residencia();
        // primer Hotel 4 
        hotel4.setNombre("HOTEL 4 1er ");
        hotel4.setDireccion("Espejo 50");
        hotel4.setGerente("Camila Adamo");
        hotel4.setLocalidad("Mendoza");
        hotel4.setHabitaciones(4);
        hotel4.setCamas(8);
        hotel4.setPisos(2);
        hotel4.setGimnacio("A");
        hotel4.setRestaurante("Restaurant Hote4 1er");
        hotel4.setCapacidadRestaurante(20);

        hotel4.precioHabitacionHotel();
        lista.add(hotel4);
        // segundo Hotel 4 
        hotel4a.setNombre("HOTEL 4 2do ");
        hotel4a.setDireccion("Catamarca 150");
        hotel4a.setGerente("Jose Adamo");
        hotel4a.setLocalidad("Mendoza");
        hotel4a.setHabitaciones(6);
        hotel4a.setCamas(12);
        hotel4a.setPisos(3);
        hotel4a.setGimnacio("B");
        hotel4a.setRestaurante("Restaurant Hote4 2do");
        hotel4a.setCapacidadRestaurante(80);

        hotel4a.precioHabitacionHotel();
        lista.add(hotel4a);
        //1er Hotel 5 
        hotel6.setNombre("HOTEL 5 1ro ");
        hotel6.setDireccion("San Martin 50");
        hotel6.setGerente("Fran Adamo");
        hotel6.setLocalidad("Mendoza");
        hotel6.setHabitaciones(10);
        hotel6.setCamas(20);
        hotel6.setPisos(4);
        hotel6.setGimnacio("A");
        hotel6.setRestaurante("Restaurant Hote5 1er");
        hotel6.setCapacidadRestaurante(120);
        hotel6.setLimosinas(5);
        hotel6.setSalonesConferencia(2);
        hotel6.setSuites(4);
        hotel6.precioHabitacionHotel();
        lista.add(hotel6);
        //2do hotel 5
        hotel5.setNombre("HOTEL 5 2do ");
        hotel5.setDireccion("San Juan 80");
        hotel5.setGerente("Clarisa Adamo");
        hotel5.setLocalidad("Mendoza");
        hotel5.setHabitaciones(10);
        hotel5.setCamas(20);
        hotel5.setPisos(4);
        hotel5.setGimnacio("A");
        hotel5.setRestaurante("Restaurant Hotel5 2er");
        hotel5.setCapacidadRestaurante(120);
        hotel5.setLimosinas(5);
        hotel5.setSalonesConferencia(2);
        hotel5.setSuites(4);
        hotel5.precioHabitacionHotel();
        lista.add(hotel5);
        // camping 1
        camping.setNombre("Camping 1");
        camping.setDireccion("carrisal");
        camping.setGerente("Teresa");
        camping.setLocalidad("Mendoza");
        camping.setMetros(100);
        camping.setRestaurante(true);
        camping.setBanio(2);
        camping.setCarpas(10);
        camping.setPrivado(true);

        lista.add(camping);
        // camping 2
        camping1.setNombre("Camping 2");
        camping1.setDireccion("carrisal abajo");
        camping1.setGerente("Pina");
        camping1.setLocalidad("Mendoza");
        camping1.setMetros(150);
        camping1.setRestaurante(false);
        camping1.setBanio(2);
        camping1.setCarpas(10);
        camping1.setPrivado(false);

        lista.add(camping1);
        //1er Residencia
        r.setNombre("Residencia 1");
        r.setDireccion("B soeva");
        r.setGerente("tata");
        r.setLocalidad("Mendoza");
        r.setHabitaciones(10);
        r.setGremio(true);
        r.setPrivado(true);
        lista.add(r);
         //1er Residencia
        r1.setNombre("Residencia 2");
        r1.setDireccion("B soeva");
        r1.setGerente("tata");
        r1.setLocalidad("Mendoza");
        r1.setHabitaciones(10);
        r1.setGremio(false);
        r1.setPrivado(false);
        lista.add(r1);
        return lista;
    }

}
