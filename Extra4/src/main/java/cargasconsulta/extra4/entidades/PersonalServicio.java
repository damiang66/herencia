package cargasconsulta.extra4.entidades;

import cargasconsulta.extra4.entidades.enumeraciones.EstadoCivil;
import cargasconsulta.extra4.entidades.enumeraciones.Servicio;

public class PersonalServicio extends Empleado {

    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, Integer anio, Integer despacho, String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        super(anio, despacho, nombre, apellido, id, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + " Seccion " + this.seccion;
    }

    public void cambioDeSeccion(String seccion) {
        int contador = 0;
        if (seccion.equalsIgnoreCase(Servicio.BIBLIOTECA.toString())) {
            this.seccion = Servicio.BIBLIOTECA.toString();
            contador++;
        }
        if (seccion.equalsIgnoreCase(Servicio.LIMPIEZA.toString())) {
            this.seccion = Servicio.LIMPIEZA.toString();
            contador++;
        }
        if (seccion.equalsIgnoreCase(Servicio.SECRETARIA.toString())) {
            this.seccion = Servicio.SECRETARIA.toString();
            contador++;
        }
        if(contador==0){
            System.out.println("Error al cambia la seccion del trabajo");
        }
    }

}
