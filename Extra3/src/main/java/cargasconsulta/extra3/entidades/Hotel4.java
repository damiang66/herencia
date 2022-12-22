
package cargasconsulta.extra3.entidades;


public class Hotel4 extends Hotel {
    protected String gimnacio;
    protected String restaurante;
    protected Integer capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(String gimnacio, String restaurante, Integer capacidadRestaurante, Integer habitaciones, Integer camas, Integer pisos, Double precio, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, precio, nombre, direccion, localidad, gerente);
        this.gimnacio = gimnacio;
        this.restaurante = restaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnacio() {
        return gimnacio;
    }

    public void setGimnacio(String gimnacio) {
        this.gimnacio = gimnacio;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

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
public void precioHabitacionHotel() {
        this.precio=50.00+(1*this.camas);
        if (this.capacidadRestaurante < 31) {
            this.precio += 10;
        }
        if (this.capacidadRestaurante > 30 && this.capacidadRestaurante < 51) {
           this.precio += 30;
        }
        if (this.capacidadRestaurante > 50) {
           this.precio += 10;
        }
        if (this.gimnacio.equalsIgnoreCase("A")){
             this.precio += 50;
        }else{
               this.precio += 30;
        }
        
    }
   
    
   
   
    
}
