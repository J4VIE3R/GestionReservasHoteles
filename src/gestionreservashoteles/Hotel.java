
package gestionreservashoteles;

import java.util.ArrayList;


public class Hotel {
    private String idHotel;
    private String nombre;
    private ArrayList <Habitacion>habitacionesDisponibles;

    public Hotel() {
    }

    public Hotel(String idHotel, String nombre, ArrayList<Habitacion> habitacionesDisponibles) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    public ArrayList <Habitacion> getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    public void setHabitacionesDisponibles(ArrayList <Habitacion> habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
