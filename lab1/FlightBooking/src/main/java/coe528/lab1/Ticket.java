package coe528.lab1;

public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int number = 0;


    public Ticket(Passenger passenger, Flight flight, double price) {
        this.passenger = passenger;
        this.flight = flight;
        this.price = passenger.applyDiscount(price);
        number++;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        Ticket.number = number;
    }

    @Override
    public String toString(){
       return passenger.getName() + ", " + flight.toString()  + ", ticket price: $" + price + "\n";
    }
}
