
package cargasconsulta.ejercicio4.entidad;

import cargasconsulta.ejercicio4.utilidades.Calculos;

public class Circulo implements Calculos{
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circulo{");
        sb.append("radio=").append(radio);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double area() {
     double area = 3.14*this.radio*this.radio;
     return area;
    }

    @Override
    public Double perimetroCirculo() {
       double perimetro = 2*this.radio*3.14;
       return perimetro;
    }

    
   
    
}
