import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private ArrayList<Bedroom> rooms;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Booking booking;


    @Before
    public void before() {
        guest1 = new Guest("Adam");
        guest2 = new Guest("Kevin");
        guest3 = new Guest("Niall");
        rooms = new ArrayList<Bedroom>();
        bedroom1 = new Bedroom(1, 2, "Double", 65.99);
        bedroom2 = new Bedroom(2, 4, "Family", 85.99);
        bedroom3 = new Bedroom(3, 2, "Double", 65.99);
        rooms.add(bedroom1);
        rooms.add(bedroom2);
        hotel = new Hotel(rooms);
        booking = new Booking(bedroom1, 3);
    }

    @Test
    public void hasARoom() {
       assertEquals(2, hotel.roomCounter());
    }

    @Test
    public void checkIn() {
        hotel.checkIn(guest1, bedroom1);
        assertEquals(2, hotel.roomCounter());
        assertEquals(1, bedroom1.checkGuest());
        assertEquals(1, guest1.getBookedRoom());
    }

    @Test
    public void checkIn__Full(){
        hotel.checkIn(guest1, bedroom1);
        hotel.checkIn(guest2, bedroom1);
        hotel.checkIn(guest3, bedroom1);
        assertEquals(2, bedroom1.checkGuest());
    }

    @Test
    public void canCheckOut() {
        hotel.checkIn(guest1, bedroom1);
        hotel.checkOut(guest1, bedroom1);
        assertEquals(2, hotel.roomCounter());
        assertEquals(0, bedroom1.checkGuest());
        assertEquals(0, guest1.getBookedRoom());
    }

    @Test
    public void canBookRoom() {
        hotel.bookRoom(bedroom1, 3);
        assertEquals(bedroom1, booking.getBedroom());
    }
}
