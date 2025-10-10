package gestionreservashoteles;

import java.util.ArrayList;

public class Cliente {

    private String idCliente;
    private String nombre;
    private ArrayList<Reserva> reservasRealizadas;
    
    private static ArrayList<Cliente> listaClientes = new ArrayList<>(); 

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.reservasRealizadas = new ArrayList<>();
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
    
     public static Cliente buscarOCrearCliente(String rut, String nombre) {
        for (Cliente c : listaClientes) {
            if (c.getIdCliente().equals(rut)) {
                return c;
            }
        }
        Cliente nuevoCliente = new Cliente(rut, nombre);
        listaClientes.add(nuevoCliente);
        return nuevoCliente;
    }
    

    public static void mostrarCliente(String nombreBuscado) {
        for (Cliente c : listaClientes) {
            if (c.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("\n=== Cliente: " + c.getNombre() + " ===");
                System.out.println("RUT: " + c.getIdCliente());
                System.out.println("\nReservas:");
                
                for (Reserva r : c.getReservasRealizadas()) {
                    System.out.println("- Hotel: " + r.getHotel().getNombre());
                    System.out.println("  Habitacion: " + r.getHabitacionReservada().getNumeroHabitacion());
                    System.out.println("  Precio: $" + r.getHabitacionReservada().getPrecioNoche());
                    System.out.println();
                }
                return;
            }
        }
        System.out.println("Cliente no encontrado");
    }
    
    public void agregarReserva(Reserva reserva) {
        this.reservasRealizadas.add(reserva);
    }
}


