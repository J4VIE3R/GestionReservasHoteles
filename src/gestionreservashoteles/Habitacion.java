
package gestionreservashoteles;


public class Habitacion {
    private String numeroHabitacion;
    private Double precioNoche;
    private Boolean disponible;

    public Habitacion() {
    }

    public Habitacion(String numeroHabitacion, Double precioNoche, Boolean disponible) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioNoche = precioNoche;
        this.disponible = disponible;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public Double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(Double precioNoche) {
        this.precioNoche = precioNoche;
    }

   
    
}
