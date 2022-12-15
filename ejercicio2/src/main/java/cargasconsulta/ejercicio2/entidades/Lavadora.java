package cargasconsulta.ejercicio2.entidades;

public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, String color, String consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

//setter and getter
    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        Lavadora l = new Lavadora();
        crearElectrodomestico(l);

        System.out.println("Ingrese la carga del lavarropa");
        l.setCarga(leer.nextInt());

        return l;

    }

    @Override
    public void precioFinal(String consumo, Integer peso) {
        super.precioFinal(consumo, peso);
        if (this.carga > 30) {
            this.precio += 500;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Lavadora{");
        sb.append(" precio ").append(this.precio);
        sb.append(" color ").append(this.color);
        sb.append(" consumo ").append(this.consumo);
        sb.append(" carga " ).append(this.carga);
       
        sb.append('}');
        return sb.toString();
    }
  

}
