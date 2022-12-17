
package cargasconsulta.extra1.entidades;

public class Yate extends Motor {
   private Integer camarotes; 

    public Yate() {
    }

    public Yate(Integer camarotes, Integer potencia, Integer matricula, Integer eslora, Integer anio) {
        super(potencia, matricula, eslora, anio);
        this.camarotes = camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toStringBarco() {
        return super.toStringBarco()+ " potencia: "+ this.potencia + " Camarotes: "+ this.camarotes; 
    }
  
   
}
