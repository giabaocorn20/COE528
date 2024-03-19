package coe528.lab1;
import java.util.ArrayList;

public class Manager {
    ArrayList<Flight> flights;
    ArrayList<Ticket> tickets;

    public Manager() {
        flights = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    public void createFlight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) {
        Flight flight = new Flight(flightNumber, origin, destination, departureTime, capacity, originalPrice);
        flights.add(flight);
        System.out.println("Flight " + flightNumber + " created successfully!\n");
    }

    public void displayAvailableFlights(String origin, String destination) {
        System.out.println("Flights from " + origin + " to " + destination + " currently available:");
        for (Flight flight : flights) {
            if (flight != null) {
                if (flight.getOrigin().compareTo(origin) == 0 && flight.getDestination().compareTo(destination) == 0) {
                    System.out.println(flight.toString());
                }
            }
        }
    }

    public void bookSeat(int flightNumber, Passenger p) {
        for (Flight flight : flights) {
            if (flight != null) {
                if (flight.getFlightNumber() == flightNumber) {
                    if (flight.getNumberOfSeatsLeft() > 0) {
                        Ticket ticket = new Ticket(p, flight, flight.getOriginalPrice());
                        flight.bookASeat();
                        tickets.add(ticket);
                        //System.out.println(flight.getNumberOfSeatsLeft());
                        System.out.println("Ticket booked successfully!\n");
                        System.out.println(ticket.toString());
                    } else {
                        System.out.println("Flight is full!\n");
                    }
                }
            }
        }
    }
}
