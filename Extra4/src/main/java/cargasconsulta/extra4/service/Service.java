package cargasconsulta.extra4.service;

import cargasconsulta.extra4.entidades.Estudiante;
import cargasconsulta.extra4.entidades.Persona;
import cargasconsulta.extra4.entidades.PersonalServicio;
import cargasconsulta.extra4.entidades.Profesores;
import java.util.Scanner;

public class Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        System.out.println("BIENVENIDO AL INSTITUTO");
        System.out.println("ELIJA UNA OPCION\n"
                + "1- crear Alumno\n"
                + "2- crear Profesor\n"
                + "3- crear Personal de Servicio");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                crearEstudiante();
                break;
            case 2:
                crearProfesor();
                break;
            case 3:
                crearPersonalServicio();
                break;

            default:
                System.out.println("Elija una opcion valida");
        }
    }

    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.println("Ingrese su id");
        p.setId(leer.nextInt());
        System.out.println("Ingrese Nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese Apellido");
        p.setApellido(leer.next());
        System.out.println("Ingrese Estado Civil");
        String estado = leer.next();
        p.CambioEstadoCivil(estado);

        return p;
    }

    public Estudiante crearEstudiante() {
        System.out.println("Ingreso De Estuadiante");
        Persona p = crearPersona();
        Estudiante e = new Estudiante();
        e.setNombre(p.getNombre());
        e.setApellido(p.getApellido());
        e.setEstadoCivil(p.getEstadoCivil());
        e.setId(p.getId());
        System.out.println("Ingrese Carrera");
        String carrera = leer.next();
        e.matricula(carrera);
        System.out.println(e.toString());
        return e;
    }

    public Profesores crearProfesor() {
        System.out.println("Ingreso de Profesores");
        Profesores pro = new Profesores();
        Persona p = crearPersona();
        pro.setNombre(p.getNombre());
        pro.setApellido(p.getApellido());
        pro.setEstadoCivil(p.getEstadoCivil());
        pro.setId(p.getId());
        System.out.println("Ingrese el año de ingreso");
        pro.setAnio(leer.nextInt());
        System.out.println("Ingrese despacho asignado");
        pro.reasignacionDespacho(leer.nextInt());
        System.out.println("Ingrese materia");
        String materia=leer.next();
        pro.cambioDeMateria(materia);
        System.out.println(pro.toString());
        return pro;
    }
    public PersonalServicio crearPersonalServicio(){
        System.out.println("Ingreso de Personal de Servicio");
        PersonalServicio pro = new PersonalServicio();
        Persona p = crearPersona();
        pro.setNombre(p.getNombre());
        pro.setApellido(p.getApellido());
        pro.setEstadoCivil(p.getEstadoCivil());
        pro.setId(p.getId());
        System.out.println("Ingrese el año de ingreso");
        pro.setAnio(leer.nextInt());
        System.out.println("Ingrese despacho asignado");
        pro.reasignacionDespacho(leer.nextInt());
        System.out.println("Ingrese Seccion a trabajar");
        String materia=leer.next();
        pro.cambioDeSeccion(materia);
        System.out.println(pro.toString());
        return pro;
        
    }
}
