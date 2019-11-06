import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Kevin");
    }

    @Test
    public void getName() {
        assertEquals("Kevin", guest.getName());
    }

    @Test
    public void bookedRoomsStartEmpty() {
        assertEquals(0, guest.getBookedRoom());
    }
}
