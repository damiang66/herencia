
package cargasconsulta.ejercicio2;

import cargasconsulta.ejercicio2.entidades.Electrodomestico;
import cargasconsulta.ejercicio2.entidades.Lavadora;
import cargasconsulta.ejercicio2.entidades.Televisor;
import java.util.ArrayList;
import java.util.List;


public class ejercicio3 {
/*
    . Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos 
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se 
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los 
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del 
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para 
electrodomésticos, 2000 para lavadora y 5000 para televisor.
    */
 
    public static void main(String[] args) {
        List<Electrodomestico> lista = new ArrayList();
        System.out.println("Ingrese los datos del lavarropa");
        Lavadora l = new Lavadora();
        l = l.crearLavadora();
        l.precioFinal(l.getConsumo(), l.getPeso());
        System.out.println("-----------------");
        Lavadora l1 = new Lavadora();
        l1 = l1.crearLavadora();
        l1.precioFinal(l1.getConsumo(), l1.getPeso());
        lista.add(l1);
         lista.add(l);
      //  System.out.println("el color del lavarropa es " + l.getColor() + " el consumo energetico es " + l.getConsumo() + " el peso es de " + l.getPeso() + " el precio es " + l.getPrecio());
        System.out.println("------------------------");
        System.out.println("Ingrese los datos del Televisor");
        Televisor t = new Televisor();
        t = t.crearTelevisor();
        
        t.precioFinal(t.getConsumo(), t.getPeso());
        System.out.println("-----------------");
         Televisor t1 = new Televisor();
        t1 = t1.crearTelevisor();
        
        t1.precioFinal(t1.getConsumo(), t1.getPeso());
        lista.add(t1);
         lista.add(t);
        
        //System.out.println(t.toString());
        System.out.println("la lista tiene los siguientes elementos");
           int sumaTelevisor=0;
           int sumaLavarropa=0;
           int total=0;
        for (Electrodomestico  aux: lista) {
          
            if (aux instanceof Televisor) {
               sumaTelevisor+=aux.getPrecio();
                
                
            }
              if (aux instanceof Lavadora) {
               sumaLavarropa+=aux.getPrecio();
                
                
            }
          total+=aux.getPrecio();
            System.out.println(aux);
            
        }
        System.out.println("el precio de todos los televisores son :" +sumaTelevisor);
        System.out.println("el precio de todos los lavarropas son :" +sumaLavarropa);
        System.out.println("el precio total de todos los electromestico es "+ total);
    }
    
}
