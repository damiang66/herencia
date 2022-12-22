
package cargasconsulta.extra4.entidades;

import cargasconsulta.extra4.entidades.enumeraciones.Curso;
import cargasconsulta.extra4.entidades.enumeraciones.EstadoCivil;


public class Estudiante extends Persona{
    private Curso curso;

    public Estudiante() {
    }

    public Estudiante(Curso curso, String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString()+ " Curso "+ this.curso; 
    }
    public void matricula(String curso){
        int contador=0;
    if (curso.equalsIgnoreCase(Curso.INGLES.toString())){
        this.curso=Curso.INGLES;
        contador++;
    }
    if (curso.equalsIgnoreCase(Curso.PROGRAMACION.toString())){
        this.curso=Curso.PROGRAMACION;
        contador++;
    }
    if (contador==0){
        System.out.println("Error al cargar el curso");
    }
    }
    
}
