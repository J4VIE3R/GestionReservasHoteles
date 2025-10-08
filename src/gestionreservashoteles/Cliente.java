
package gestionreservashoteles;

import java.util.ArrayList;



public class Cliente {
    private String idCliente;
    private String nombre;
    private ArrayList<Reserva> reservasRealizadas;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre, ArrayList<Reserva> reservasRealizadas) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.reservasRealizadas = reservasRealizadas;
    }

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }

    public void setReservasRealizadas(ArrayList<Reserva> reservasRealizadas) {
        this.reservasRealizadas = reservasRealizadas;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
