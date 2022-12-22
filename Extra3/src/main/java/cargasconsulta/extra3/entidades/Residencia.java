
package cargasconsulta.extra3.entidades;

public class Residencia extends ExtraHotel {
    private Integer habitaciones;
    private boolean gremio;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer habitaciones, boolean gremio, boolean campoDeportivo, boolean privado, Integer metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.gremio = gremio;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isGremio() {
        return gremio;
    }

    public void setGremio(boolean gremio) {
        this.gremio = gremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
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
