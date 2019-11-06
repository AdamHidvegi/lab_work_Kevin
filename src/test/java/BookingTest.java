import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Bedroom bedroom;
    private Booking booking;


    @Before
    public void before() {
        bedroom = new Bedroom(1, 2, "double", 65.99);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void canGetTotalCost() {
        assertEquals(197.97, booking.getTotalCost(), 0.01);
    }
}
