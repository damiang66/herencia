
package cargasconsulta.extra3.utilidades;


import cargasconsulta.extra3.entidades.Hotel;
import java.util.Comparator;


public class Comparador {

    public static Comparator<Hotel> ordenarPorPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t, Hotel t1) {
           return t1.getPrecio().compareTo(t.getPrecio());
        }
    };
     
    }
    

