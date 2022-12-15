package cargasconsulta.ejercicio2.entidades;

public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private Boolean sintonizador;

    public Televisor(Integer resolucion, Boolean sintonizador, Integer precio, String color, String consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor() {
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public Televisor crearTelevisor() {
        Televisor t = new Televisor();
        this.crearElectrodomestico(t);
        System.out.println("Ingrese resolucion");
        t.setResolucion(leer.nextInt());
        System.out.println("Ingrese si tienen sintonizador TDT 1-Si/ 2/no");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                t.setSintonizador(true);
                break;
            default:
                t.setSintonizador(false);
        }
        return t;
    }

    @Override
    public void precioFinal(String consumo, Integer peso) {
        super.precioFinal(consumo, peso);
        if (this.resolucion > 40) {
            int porcentaje = this.precio * 30 / 100;
            this.precio = this.precio + porcentaje;
        }
        if (this.sintonizador) {
            this.precio += 500;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Televisor{");
        sb.append(" precio ").append(this.precio);
        sb.append(" color ").append(this.color);
        sb.append(" consumo ").append(this.consumo);
        sb.append(" resolucion= ").append(resolucion);
        sb.append(", sintonizador=").append(sintonizador);
        sb.append('}');
        return sb.toString();
    }

}
