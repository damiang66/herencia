
package cargasconsulta.ejercicio4.entidad;

import cargasconsulta.ejercicio4.utilidades.Calculos;


public class Rectangulo implements Calculos {
    private Integer base;
    private Integer altura;

    public Rectangulo() {
    }

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    @Override
    public Double area() {
        double a=this.base * this.altura;
        return a;
    }

    @Override
    public Double perimetroCirculo() {
       double a= (this.base+this.altura)*2;
       return a;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
    
}
