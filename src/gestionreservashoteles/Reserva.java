package gestionreservashoteles;

public class Reserva {

    private Hotel hotel;
    private Habitacion habitacionReservada;

    public Reserva() {
    }

    public Reserva(Hotel hotel, Habitacion habitacionReservada) {
        this.hotel = hotel;
        this.habitacionReservada = habitacionReservada;
    }

    public Habitacion getHabitacionReservada() {
        return habitacionReservada;
    }

    public void setHabitacionReservada(Habitacion habitacionReservada) {
        this.habitacionReservada = habitacionReservada;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
