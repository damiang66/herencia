
package cargasconsulta.extra4.entidades;

import cargasconsulta.extra4.entidades.enumeraciones.EstadoCivil;

public class Empleado extends Persona {
    protected Integer anio;
    protected Integer despacho;

    public Empleado() {
    }

    public Empleado(Integer anio, Integer despacho, String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anio = anio;
        this.despacho = despacho;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return super.toString()+ "Año de Incorporacion: " + this.anio + " Numero de despacho asignado: "+ this.despacho; 
    }
    public void reasignacionDespacho(Integer despacho){
        this.despacho=despacho;
    }
    
}
