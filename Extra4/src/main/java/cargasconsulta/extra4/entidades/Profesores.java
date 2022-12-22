
package cargasconsulta.extra4.entidades;

import cargasconsulta.extra4.entidades.enumeraciones.EstadoCivil;
import cargasconsulta.extra4.entidades.enumeraciones.Materia;


public class Profesores extends Empleado {
    private Materia materia;

    public Profesores() {
    }

    public Profesores(Materia materia, Integer anio, Integer despacho, String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        super(anio, despacho, nombre, apellido, id, estadoCivil);
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString() + " Materia "+ this.materia; 
    }
    public void cambioDeMateria(String materia){
        int contador=0;
       if (materia.equalsIgnoreCase(Materia.INGLES.toString())){
           this.materia=Materia.INGLES;
           contador++;
       }
        if (materia.equalsIgnoreCase(Materia.MATEMATICA.toString())){
           this.materia=Materia.MATEMATICA;
            contador++;
       }
         if (materia.equalsIgnoreCase(Materia.PROGRAMACION.toString())){
           this.materia=Materia.PROGRAMACION;
            contador++;
       }
         if(contador==0){
             System.out.println("Error al cargar la materia");
         }
    }
    
}
