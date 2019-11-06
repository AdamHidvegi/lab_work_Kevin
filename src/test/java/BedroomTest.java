import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(1, 2, "double", 65.99);
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, bedroom.checkGuest());
    }

    @Test
    public void getCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void getRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void getRoomType() {
        assertEquals("double", bedroom.getRoomType());
    }

}
