
package cargasconsulta.extra3.entidades;


public class Hotel5 extends Hotel4 {
   private Integer SalonesConferencia;
   private Integer suites;
   private Integer limosinas;

    public Hotel5() {
    }

    public Hotel5(Integer SalonesConferencia, Integer suites, Integer limosinas, String gimnacio, String restaurante, Integer capacidadRestaurante, Integer habitaciones, Integer camas, Integer pisos, Double precio, String nombre, String direccion, String localidad, String gerente) {
        super(gimnacio, restaurante, capacidadRestaurante, habitaciones, camas, pisos, precio, nombre, direccion, localidad, gerente);
        this.SalonesConferencia = SalonesConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Integer getSalonesConferencia() {
        return SalonesConferencia;
    }

    public void setSalonesConferencia(Integer SalonesConferencia) {
        this.SalonesConferencia = SalonesConferencia;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(Integer limosinas) {
        this.limosinas = limosinas;
    }

   @Override
    public String getGimnacio() {
        return gimnacio;
    }

   @Override
    public void setGimnacio(String gimnacio) {
        this.gimnacio = gimnacio;
    }

   @Override
    public String getRestaurante() {
        return restaurante;
    }

   @Override
    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

   @Override
    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

   @Override
    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

   @Override
    public Integer getHabitaciones() {
        return habitaciones;
    }

   @Override
    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

   @Override
    public Integer getCamas() {
        return camas;
    }

   @Override
    public void setCamas(Integer camas) {
        this.camas = camas;
    }

   @Override
    public Integer getPisos() {
        return pisos;
    }

   @Override
    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

   @Override
    public Double getPrecio() {
        return precio;
    }

   @Override
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

   @Override
    public String getNombre() {
        return nombre;
    }

   @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   @Override
    public String getDireccion() {
        return direccion;
    }

   @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   @Override
    public String getLocalidad() {
        return localidad;
    }

   @Override
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

   @Override
    public String getGerente() {
        return gerente;
    }

   @Override
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public void precioHabitacionHotel() {
        super.precioHabitacionHotel(); 
      this.precio+=15*this.habitaciones; 
    }

   

    

    
  
   
}
