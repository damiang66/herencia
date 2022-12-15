package cargasconsulta.ejercicio2.entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected Integer precio;
    protected String color;
    protected String consumo;
    protected Integer peso;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//constructores

    public Electrodomestico() {

    }

    public Electrodomestico(Integer precio, String color, String consumo, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
    //setter and getter

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String comprobarConsumo(String letra) {
        letra = letra.toUpperCase();
       
        switch (letra) {

            case "A":
                return letra;
            case "B":
                return letra;
            case "C":
                return letra;
            case "D":
                return letra;
            case "E":
                return letra;
            case "F":
                return letra;

            default:
                letra = "F";
                return letra;
        }
    }

    public String cobrobarColor(String color) {
        color = color.toUpperCase();
        switch (color) {
            case "BLANCO":
                return color;
            case "NEGRO":
                return color;
            case "ROJO":
                return color;
            case "AZUL":
                return color;
            case "GRIS":
                return color;

            default:
                color = "BLANCO";
                return color;
        }
    }

    public void crearElectrodomestico(Electrodomestico e) {

        e.setPrecio(1000);
        System.out.println("Ingrese el color del electrodomestico");
        String color = leer.next();
        e.setColor(cobrobarColor(color));
        System.out.println("Ingrese el consumo energetico");
        String consumo = leer.next();
        e.setConsumo(comprobarConsumo(consumo));
        System.out.println("Ingrese el peso del electrodomestico");

        e.setPeso(leer.nextInt());

    }

    public void precioFinal(String consumo, Integer peso) {
       
        switch (consumo) {

            case "A":
                this.precio += 1000;
                break;
            case "B":
                this.precio += 800;
                break;
            case "C":
                this.precio += 600;
                break;
            case "D":
                this.precio += 500;
                
                break;
            case "E":
                this.precio += 300;
                break;
            case "F":
                this.precio += 100;
                break;

        }
       

        if (peso > 0 && peso < 20) {
            this.precio += 100;

        }
        if (peso > 19 && peso < 50) {
            this.precio += 500;

        }
        if (peso > 49 && peso < 80) {
            this.precio += 800;

        }
        if (peso >= 80) {
            this.precio += 1000;

        }
        
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + ", leer=" + leer + '}';
    }

}
