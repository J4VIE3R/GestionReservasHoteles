package gestionreservashoteles;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionReservasHoteles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Habitacion> listaHabitacionesHotel1 = new ArrayList<>();
        ArrayList<Habitacion> listaHabitacionesHotel2 = new ArrayList<>();
        int opcion = 0;

        Habitacion habitacion1 = new Habitacion("1", 145.000, true);
        Habitacion habitacion2 = new Habitacion("2", 145.000, true);
        Habitacion habitacion3 = new Habitacion("3", 145.000, true);
        Habitacion habitacion4 = new Habitacion("4", 145.000, true);
        Habitacion habitacion5 = new Habitacion("5", 145.000, true);
        Habitacion habitacion6 = new Habitacion("6", 145.000, true);
        Habitacion habitacion7 = new Habitacion("7", 145.000, true);
        Habitacion habitacion8 = new Habitacion("8", 145.000, true);
        Habitacion habitacion9 = new Habitacion("9", 145.000, true);

        Habitacion habitacion11 = new Habitacion("1", 55.000, true);
        Habitacion habitacion12 = new Habitacion("2", 55.000, true);
        Habitacion habitacion13 = new Habitacion("3", 55.000, true);
        Habitacion habitacion14 = new Habitacion("4", 55.000, true);
        Habitacion habitacion15 = new Habitacion("5", 55.000, true);
        Habitacion habitacion16 = new Habitacion("6", 55.000, true);
        Habitacion habitacion17 = new Habitacion("7", 55.000, true);
        Habitacion habitacion18 = new Habitacion("8", 55.000, true);
        Habitacion habitacion19 = new Habitacion("9", 55.000, true);

        listaHabitacionesHotel1.add(habitacion1);
        listaHabitacionesHotel1.add(habitacion2);
        listaHabitacionesHotel1.add(habitacion3);
        listaHabitacionesHotel1.add(habitacion4);
        listaHabitacionesHotel1.add(habitacion5);
        listaHabitacionesHotel1.add(habitacion6);
        listaHabitacionesHotel1.add(habitacion7);
        listaHabitacionesHotel1.add(habitacion8);
        listaHabitacionesHotel1.add(habitacion9);

        listaHabitacionesHotel2.add(habitacion11);
        listaHabitacionesHotel2.add(habitacion12);
        listaHabitacionesHotel2.add(habitacion13);
        listaHabitacionesHotel2.add(habitacion14);
        listaHabitacionesHotel2.add(habitacion15);
        listaHabitacionesHotel2.add(habitacion16);
        listaHabitacionesHotel2.add(habitacion17);
        listaHabitacionesHotel2.add(habitacion18);
        listaHabitacionesHotel2.add(habitacion19);

        Hotel hotel1 = new Hotel("01", "Burj Al Arab", listaHabitacionesHotel1);
        Hotel hotel2 = new Hotel("02", "Emirates Palace", listaHabitacionesHotel2);

        do {
            System.out.println("*****BIENVENIDO A RESERVAS DE HOTELES*****");
            System.out.println("1.Realizar Reserva");
            System.out.println("2.Segimiento De Reserva");
            System.out.println("");
            System.out.println("");
            System.out.println("5.Exit");
            System.out.println("Selecione una opcion:  ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("*****REALIZAR RESERVA*****");
                    System.out.println("Selecione Hotel\n");
                    System.out.println("1." + hotel1.getNombre());
                    System.out.println("2." + hotel2.getNombre());
                    int opcionHotel = input.nextInt();
                    if (opcionHotel == 1) {
                        System.out.println("Seleciono el Hotel" + hotel1.getNombre() + "\n");

                        for (Habitacion h : hotel1.getHabitacionesDisponibles()) {
                            System.out.println("Habitacion " + h.getNumeroHabitacion() + "  $" + h.getPrecioNoche());

                        }
                        System.out.println("Ingrese el numero de habitacion a reservar");
                        String numHabitacion = input.next();
                        ArrayList<Habitacion> listaHabitacionCliente1 = new ArrayList<>();
                        
                        System.out.println("Ingrese su rut");
                        String numRut = input.next();
                        System.out.println("Ingrese su nombre");
                        String nombreCliente = input.next();

                    } else if (opcionHotel == 2) {
                        System.out.println("Seleciono el Hotel" + hotel2.getNombre() + "\n");

                        for (Habitacion h : hotel2.getHabitacionesDisponibles()) {
                            System.out.println("Habitacion " + h.getNumeroHabitacion() + "  $" + h.getPrecioNoche());

                        }
                        System.out.println("Ingrese el numero de habitacion a reservar");
                        String numHabitacion = input.next();
                        System.out.println("Ingrese su rut");
                        String numRut = input.next();
                        System.out.println("Ingrese su nombre");
                        String nombreCliente = input.next();
                    }

            }

        } while (opcion != 5);
        System.out.println("Gracias por su visita <3");

    }

}
