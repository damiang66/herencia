package cargasconsulta.extra1.service;

import cargasconsulta.extra1.entidades.Barco;
import cargasconsulta.extra1.entidades.Motor;
import cargasconsulta.extra1.entidades.Velero;
import cargasconsulta.extra1.entidades.Yate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarcoService {

    List<Barco> listaBarcos = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
/**
 * creo veleros
 */
    
    public void crearVelero() {
        Velero velero = new Velero();
        velero.setMatricula(1);
        velero.setAnio(2020);
        velero.setEslora(10);
        velero.setMastiles(2);
        listaBarcos.add(velero);
        

    }
    /**
     * creo Barcos a Motor
     */
    public void crearMotor(){
        Motor motor = new Motor();
        motor.setMatricula(2);
        motor.setAnio(2021);
        motor.setEslora(15);
        motor.setPotencia(10);
        listaBarcos.add(motor);
        
        
    }
    /**
     * creo Yates
     */
    public void CrearYate(){
     Yate yate = new Yate();
     yate.setMatricula(3);
     yate.setAnio(2022);
     yate.setEslora(20);
     yate.setPotencia(10);
     yate.setCamarotes(5);
     listaBarcos.add(yate);
    }
   /**
    *  llamo a las funciones de crear barcos y retorno la lista
    * @return 
    */
    public List<Barco> crearBarcos(){
        crearVelero();
        crearMotor();
        CrearYate();
        return listaBarcos;
    }
}
