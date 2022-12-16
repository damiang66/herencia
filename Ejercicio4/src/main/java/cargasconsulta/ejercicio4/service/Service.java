
package cargasconsulta.ejercicio4.service;

import cargasconsulta.ejercicio4.entidad.Circulo;
import cargasconsulta.ejercicio4.entidad.Rectangulo;
import java.util.Scanner;

public class Service {
    Scanner leer = new Scanner(System.in);  
     
    public Circulo crearCirculo(){
        System.out.println("Creemos un Circulo");
        Circulo c = new Circulo();
        System.out.println("Ingrese el radio");
        c.setRadio(leer.nextDouble());
        return c;
    }
    public Rectangulo crearRectangulo(){
           System.out.println("Creemos un Rectangulo");
         Rectangulo r = new Rectangulo();
         System.out.println("Ingrese la base");
         r.setBase(leer.nextInt());
         System.out.println("Ingrese la altura");
         r.setAltura(leer.nextInt());
         return r;
    }
}
