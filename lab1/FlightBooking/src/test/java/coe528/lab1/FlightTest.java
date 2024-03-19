package coe528.lab1;

import static org.junit.Assert.*;

public class FlightTest {
    @org.junit.Test
    public void testConstructor() {
        int expectedFlightNumber = 1;
        String expectedOrigin = "Toronto";
        String expectedDestination = "New York";
        String expectedDepartureTime = "10:30AM";
        int expectedCapacity = 100;
        int expectedNumberOfSeatsLeft = 100;
        double expectedOriginalPrice = 100.0;

        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        assertEquals(expectedFlightNumber, flight.getFlightNumber());
        assertEquals(expectedOrigin, flight.getOrigin());
        assertEquals(expectedDestination, flight.getDestination());
        assertEquals(expectedDepartureTime, flight.getDepartureTime());
        assertEquals(expectedCapacity, flight.getCapacity());
        assertEquals(expectedNumberOfSeatsLeft, flight.getNumberOfSeatsLeft());
        assertEquals(expectedOriginalPrice, flight.getOriginalPrice(), 0.0);
    }

    @org.junit.Test
    public void getFlightNumber() {
        int expectedFlightNumber = 1;
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        assertEquals(expectedFlightNumber, flight.getFlightNumber());
    }

    @org.junit.Test
    public void setFlightNumber() {
        int expectedFlightNumber = 2;
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        flight.setFlightNumber(2);
        assertEquals(expectedFlightNumber, flight.getFlightNumber());
    }

    @org.junit.Test
    public void getOrigin() {
        String expectedOrigin = "Toronto";
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        assertEquals(expectedOrigin, flight.getOrigin());
    }

    @org.junit.Test
    public void setOrigin() {
        String expectedOrigin = "Boston";
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        flight.setOrigin("Boston");
        assertEquals(expectedOrigin, flight.getOrigin());
    }

    @org.junit.Test
    public void getDestination() {
        String expectedDestination = "New York";
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        assertEquals(expectedDestination, flight.getDestination());
    }

    @org.junit.Test
    public void setDestination() {
        String expectedDestination = "Boston";
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        flight.setDestination("Boston");
        assertEquals(expectedDestination, flight.getDestination());
    }

    @org.junit.Test
    public void getDepartureTime() {
        String expectedDepartureTime = "10:30AM";
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        assertEquals(expectedDepartureTime, flight.getDepartureTime());

    }

    @org.junit.Test
    public void setDepartureTime() {
        String expectedDepartureTime = "11:30AM";
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        flight.setDepartureTime("11:30AM");
        assertEquals(expectedDepartureTime, flight.getDepartureTime());
    }

    @org.junit.Test
    public void getCapacity() {
        int expectedCapacity = 100;
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        assertEquals(expectedCapacity, flight.getCapacity());
    }

    @org.junit.Test
    public void setCapacity() {
        int expectedCapacity = 150;
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        flight.setCapacity(150);
        assertEquals(expectedCapacity, flight.getCapacity());
    }

    @org.junit.Test
    public void getNumberOfSeatsLeft() {
        int expectedNumberOfSeatsLeft = 100;
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        assertEquals(expectedNumberOfSeatsLeft, flight.getNumberOfSeatsLeft());
    }

    @org.junit.Test
    public void setNumberOfSeatsLeft() {
        int expectedNumberOfSeatsLeft = 50;
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        flight.setNumberOfSeatsLeft(50);
        assertEquals(expectedNumberOfSeatsLeft, flight.getNumberOfSeatsLeft());
    }

    @org.junit.Test
    public void getOriginalPrice() {
        double expectedOriginalPrice = 100.0;
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        assertEquals(expectedOriginalPrice, flight.getOriginalPrice(), 0.0);
    }

    @org.junit.Test
    public void setOriginalPrice() {
        double expectedOriginalPrice = 150.0;
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        flight.setOriginalPrice(150.0);
        assertEquals(expectedOriginalPrice, flight.getOriginalPrice(), 0.0);
    }

    @org.junit.Test
    public void bookASeat() {
        boolean expectedBookASeat = true;
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        assertEquals(expectedBookASeat, flight.bookASeat());
    }

    @org.junit.Test
    public void testToString() {
        String expectedToString = "Flight 1, Toronto to New York, 10:30AM, original price: $100.0";
        Flight flight = new Flight(1, "Toronto", "New York", "10:30AM", 100, 100.0);
        assertEquals(expectedToString, flight.toString());
    }
}