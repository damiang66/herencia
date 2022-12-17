
package cargasconsulta.extra1.entidades;


public class Motor extends Barco {
  protected Integer potencia;

    public Motor() {
    }

    public Motor(Integer potencia, Integer matricula, Integer eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

   

    @Override
    public String toStringBarco() {
        return  super.toStringBarco()+ "Potencia:"+this.potencia; 
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + '}';
    }

   
    
  
}
