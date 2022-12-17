
package cargasconsulta.extra1.entidades;


public class Velero extends Barco {
    private Integer mastiles;

    public Velero() {
    }

    public Velero(Integer mastiles, Integer matricula, Integer eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles + '}';
    }

    @Override
    public String toStringBarco() {
        return super.toStringBarco()+ "numero de matiles :"+ this.mastiles; 
    
}
}