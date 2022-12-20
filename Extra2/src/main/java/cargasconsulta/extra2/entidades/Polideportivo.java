
package cargasconsulta.extra2.entidades;


public class Polideportivo extends Edificio {
    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }
    

    public Polideportivo(String nombre, boolean techado, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    

    @Override
    public int calcularSuperficie(int largo, int ancho) {
        return largo * ancho;
    }

    @Override
    public int CalcularVolumen(int largo, int ancho, int altura) {
        return ancho *largo * altura;
    }

    @Override
    public String toString() {
        return super.toString()+"Polideportivo{" + "nombre=" + nombre + ", techado=" + techado + '}';
    }

  

 
    
}
