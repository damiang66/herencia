
package cargasconsulta.ejercicio1;

import cargasconsulta.ejercicio1.entidades.Animal;
import cargasconsulta.ejercicio1.entidades.Caballo;
import cargasconsulta.ejercicio1.entidades.Gato;
import cargasconsulta.ejercicio1.entidades.Perro;
import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
      Animal perro1 = new Perro("Neron","alimento para perro",15,"Callejero");
      perro1.alimentarse();
      Animal perro2= new Perro("Ketma","croquetas",1,"el mejor perro");
      perro2.alimentarse();
      Animal gato = new Gato("Bosnia","alimento para gato",1, "callejera");
      gato.alimentarse();
      Animal caballo = new Caballo("Pony", "Pasto", 25, "Fino");
      caballo.alimentarse();
        
    }
}
