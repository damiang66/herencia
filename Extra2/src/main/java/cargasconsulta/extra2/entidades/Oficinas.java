
package cargasconsulta.extra2.entidades;

public class Oficinas  extends Edificio{
    private Integer numeroOficina;
    private Integer personas;
    private Integer numeroPiso;

    public Oficinas() {
    }

    public Oficinas(Integer numeroOficina, Integer personas, Integer numeroPiso, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.numeroOficina = numeroOficina;
        this.personas = personas;
        this.numeroPiso = numeroPiso;
    }

    public Integer getNumeroOficina() {
        return numeroOficina;
    }

    public void setNumeroOficina(Integer numeroOficina) {
        this.numeroOficina = numeroOficina;
    }

    public Integer getPersonas() {
        return personas;
    }

    public void setPersonas(Integer personas) {
        this.personas = personas;
    }

    public Integer getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(Integer numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
     public void cantidadDePersonas(){
       int totalPersonas= this.personas*this.numeroPiso;
       System.out.println("La cantidad total de personas trabajando es : " + totalPersonas );
       System.out.println("La cantidad de personas que entran en un piso es " + this.personas);
   }

    @Override
    public String toString() {
        return super.toString()+" Oficinas{" + "numeroOficina=" + numeroOficina + ", personas=" + personas + ", numeroPiso=" + numeroPiso + '}';
    }
    
            

    @Override
    public int calcularSuperficie(int largo, int ancho) {
       return largo * ancho;
    }

    @Override
    public int CalcularVolumen(int largo, int ancho, int altura) {
        return ancho *largo * altura* this.numeroPiso;
    }
    
}
