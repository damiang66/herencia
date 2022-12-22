

package cargasconsulta.extra3;

import cargasconsulta.extra3.entidades.Alojamiento;
import cargasconsulta.extra3.entidades.Camping;
import cargasconsulta.extra3.entidades.Hotel4;
import cargasconsulta.extra3.entidades.Hotel5;
import cargasconsulta.extra3.entidades.Residencia;
import cargasconsulta.extra3.service.Service;
import java.util.List;


public class Extra3 {

    public static void main(String[] args) {
      Service service = new Service();
      List<Alojamiento> lista= service.crear();
        System.out.println("Todos los alojamientos disponibles");
        for (Alojamiento alojamiento : lista) {
            System.out.println(alojamiento.getNombre());
        }
        System.out.println("-------------------");
        for (Alojamiento aux : lista) {
            if (aux instanceof Hotel4) {
                System.out.println(aux.getNombre());
                System.out.println(((Hotel4) aux).getPrecio());
                continue;
                
            }
            if (aux instanceof Hotel5){
                System.out.println(aux.getNombre());
                System.out.println(((Hotel5) aux).getPrecio());
                continue;
            }
            if (aux instanceof Camping){
                
                if(((Camping) aux).isRestaurante()){
                    System.out.println("este camping tiene restaurante "); 
                    System.out.println(aux.getNombre());
                }
                
                continue;
            }
            if(aux instanceof Residencia){
                if (((Residencia) aux).isGremio()){
                    System.out.println("Esta residencia tiene descuento por gremio");
                    System.out.println(aux.getNombre());
                }
                continue;
            }
        }
    }
}
