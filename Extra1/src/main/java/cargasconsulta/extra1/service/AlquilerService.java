package cargasconsulta.extra1.service;

import cargasconsulta.extra1.entidades.Alquiler;
import cargasconsulta.extra1.entidades.Barco;
import cargasconsulta.extra1.entidades.Motor;
import cargasconsulta.extra1.entidades.Velero;
import cargasconsulta.extra1.entidades.Yate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AlquilerService {

    BarcoService barcoService = new BarcoService();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Barco> lista = new ArrayList();
    int posicion = 1;
    double precio = 0;
 int mastil;
 int potencia;
 int camarote;
  int tipoBarco;
    public Alquiler crearAlquiler() {
        Alquiler alquiler = new Alquiler();
        lista = barcoService.crearBarcos();
        
        System.out.println("----------------");
        System.out.println("Bienvenidos a alquiler de Barco el come traba de Mpappe");
        System.out.println("Ingrese su dni");
        alquiler.setDni(leer.nextInt());
        System.out.println("Ingrese su nombre");
        alquiler.setNombre(leer.next());
        System.out.println("Ingrese dias que desea alquilar el barco");
        int dias = leer.nextInt();
        alquiler.setFecha(new Date());
        Date fecha = alquiler.getFecha();
        int dia = fecha.getDay();
        int mes = fecha.getMonth();
        int anio = fecha.getYear();
      
        
        alquiler.setDevolucion(new Date(anio, mes, dia + dias));
        for (Barco aux : lista) {
            if (aux instanceof Yate) {
                System.out.println(aux.toStringBarco());
                continue;
            }
            if (aux instanceof Motor) {
                System.out.println(aux.toStringBarco());
                continue;
            }
            if (aux instanceof Velero) {
                System.out.println(aux.toStringBarco());
                continue;
            }
        }
        System.out.println("Ingrese la matricula del barco a Alquilar");
        int matricula = leer.nextInt();
        for (Barco aux : lista) {
            if (aux.getMatricula() == matricula) {
                if (aux instanceof Yate) {
                    Barco barco = new Yate();
                    barco = aux;
                   alquiler.setBarco(barco);
                    potencia = ((Yate) aux).getPotencia();
                    camarote= ((Yate) aux).getCamarotes();
                    tipoBarco=3;
                break;
                    
                }
                 if (aux instanceof Motor) {
                    Barco barco = new Motor();
                    barco = aux;
                    potencia=((Motor) aux).getPotencia();
                   alquiler.setBarco(barco);
                   tipoBarco=2;
                break;
                    
                }
                  if (aux instanceof Velero) {
                    Barco barco = new Velero();
                    barco = aux;
                    mastil = ((Velero) aux).getMastiles();
                   alquiler.setBarco(barco);
                   tipoBarco=1;
                break;
                    
                }
                
            }
        }
        System.out.println("el alquilado barco alquilado es "+ alquiler.getBarco().toStringBarco());
        alquiler.setPosicion(posicion);
        posicion += 1;
         precio = dias*(alquiler.getBarco().getEslora()*10);
        if (tipoBarco==1){
            precio+=mastil;
        }
        if (tipoBarco==2){
            precio+=potencia;
        }
        if (tipoBarco==3){
            precio+=potencia+camarote;
        }
        alquiler.setPrecio(precio);
        System.out.println("el Precio del alquiler es "+ alquiler.getPrecio());
        return alquiler;
    }
}
