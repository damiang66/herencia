
package cargasconsulta.ejercicio1.entidades;


public abstract class Animal {
protected String nombre;
protected String alimento;
protected Integer edad;
protected String raza;

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
   public void alimentarse(){
       System.out.println("este animal se alimente de " + this.alimento);
   }

}
