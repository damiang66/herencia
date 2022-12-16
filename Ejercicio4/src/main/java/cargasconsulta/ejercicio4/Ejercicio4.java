

package cargasconsulta.ejercicio4;

import cargasconsulta.ejercicio4.entidad.Circulo;
import cargasconsulta.ejercicio4.entidad.Rectangulo;
import cargasconsulta.ejercicio4.service.Service;


public class Ejercicio4 {

    public static void main(String[] args) {
    Service service = new Service();
    Circulo c=service.crearCirculo();
        System.out.println("-----------------------");
        System.out.println("el area del circulo es "+ c.area());
        System.out.println("el perimetro del circulo es "+ c.perimetroCirculo());
        System.out.println("------------------------------");
    Rectangulo r = service.crearRectangulo();
      System.out.println("el area del Rectangulo es "+ r.area());
        System.out.println("el perimetro del Rectangulo es "+ r.perimetroCirculo());
    }
    
}
