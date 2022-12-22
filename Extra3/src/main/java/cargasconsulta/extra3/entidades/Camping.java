
package cargasconsulta.extra3.entidades;


public class Camping extends ExtraHotel  {
private Integer carpas;
private Integer banio;
private boolean restaurante;

    public Camping(Integer carpas, Integer banio, boolean restaurante, boolean privado, Integer metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.carpas = carpas;
        this.banio = banio;
        this.restaurante = restaurante;
    }

    public Camping() {
    }

    public Integer getCarpas() {
        return carpas;
    }

    public void setCarpas(Integer carpas) {
        this.carpas = carpas;
    }

    public Integer getBanio() {
        return banio;
    }

    public void setBanio(Integer banio) {
        this.banio = banio;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getMetros() {
        return metros;
    }

    public void setMetros(Integer metros) {
        this.metros = metros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

}
