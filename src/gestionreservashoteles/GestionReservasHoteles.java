
package gestionreservashoteles;

import java.util.ArrayList;
import java.util.Scanner;


public class GestionReservasHoteles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Habitacion> listaHabitaciones = new ArrayList<>(); 
        int opcion = 0;
        
        Habitacion habitacion1 = new Habitacion("1", 45.00, true);
        Habitacion habitacion2 = new Habitacion("2", 45.00, true);
        Habitacion habitacion3 = new Habitacion("3", 45.00, true);
        Habitacion habitacion4 = new Habitacion("4", 45.00, true);
        Habitacion habitacion5 = new Habitacion("5", 45.00, true);
        Habitacion habitacion6 = new Habitacion("6", 45.00, true);
        Habitacion habitacion7 = new Habitacion("7", 45.00, true);
        Habitacion habitacion8 = new Habitacion("8", 45.00, true);
        Habitacion habitacion9 = new Habitacion("9", 45.00, true);
        Habitacion habitacion10 = new Habitacion("10", 45.00, true);
        
        listaHabitaciones.add(habitacion1);
        listaHabitaciones.add(habitacion2);
        listaHabitaciones.add(habitacion3);
        listaHabitaciones.add(habitacion4);
        listaHabitaciones.add(habitacion5);
        listaHabitaciones.add(habitacion6);
        listaHabitaciones.add(habitacion7);
        listaHabitaciones.add(habitacion8);
        listaHabitaciones.add(habitacion9);
        listaHabitaciones.add(habitacion10);

        Hotel hotel1 = new Hotel("01", "Burj Al Arab",listaHabitaciones);
        Hotel hotel2 = new Hotel("02", "Emirates Palace",listaHabitaciones);
        Hotel hotel3 = new Hotel("03", "Seven Stars Galleria",listaHabitaciones);
        Hotel hotel4 = new Hotel("04", "Hotel Savoy",listaHabitaciones);

        
        do {
            System.out.println("*****BIENVENIDO A RESERVAS DE HOTELES*****");
            System.out.println("1.Realizar Reserva");
            System.out.println("2.Segimiento De Reserva");
            System.out.println("");
            System.out.println("");
            System.out.println("5.Exit");
            System.out.println("Selecione una opcion:  ");
            opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println();
            
            
            }
            

        } while (opcion !=5);
        System.out.println("Gracias por su visita <3");
        
            
        
        
    }
    
    
    
}
