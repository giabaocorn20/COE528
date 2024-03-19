package coe528.lab1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // declare manager
        Manager manager = new Manager();
        //declare passengers
        Passenger John = new Member("John", 20, 10);
        Passenger Jane = new Member("Jane", 20, 2);
        Passenger Meilin = new Member("Meilin", 20, 1);
        Passenger Karen = new NonMember("Karen", 66);
        Passenger Bob = new NonMember("Bob", 20);
        //create flights
        System.out.println("Creating flights...\n");
        manager.createFlight(1, "Toronto", "New York", "10:30AM", 3, 100.0);
        manager.createFlight(2, "Boston", "Beijing", "1:30PM", 3, 150.0);
        manager.createFlight(3, "Los Angeles", "Sydney", "5:00AM", 3, 100.0);

        //check if flights are created
        System.out.println("Available Flights:");
        manager.displayAvailableFlights("Toronto", "New York");
        manager.displayAvailableFlights("Boston", "Beijing");
        manager.displayAvailableFlights("Los Angeles", "Sydney");

        System.out.println("Booking Flight 1:");

        manager.bookSeat(1, John);
        manager.bookSeat(1, Jane);
        manager.bookSeat(1, Meilin);
        manager.bookSeat(1, Karen); //should not be able to book seat

        System.out.println("Booking Flight 2:");
        manager.bookSeat(2, Meilin);
        manager.bookSeat(2, Karen);
        manager.bookSeat(2, John);
        manager.bookSeat(2, Jane); //should not be able to book seat

        System.out.println("Booking Flight 3:");
        manager.bookSeat(3, Bob);
        manager.bookSeat(3, John);
        manager.bookSeat(3, Jane);
       manager.bookSeat(3, Meilin); //should not be able to book seat

        //check tickets
        System.out.println("Tickets booked for all flights:");
        for (Ticket ticket : manager.tickets) {
            if (ticket != null) {

                if (ticket.getFlight().getFlightNumber() == 1) {
                    System.out.println(ticket.toString());
                }
                if (ticket.getFlight().getFlightNumber() == 2) {
                    System.out.println(ticket.toString());
                }
                if (ticket.getFlight().getFlightNumber() == 3) {
                    System.out.println(ticket.toString());
                }
            }
        }


    }
}
