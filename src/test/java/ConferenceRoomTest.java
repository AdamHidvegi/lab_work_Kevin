import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Meeting Room", 10);
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, conferenceRoom.checkGuest());
    }

    @Test
    public void getCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void getName() {
        assertEquals("Meeting Room", conferenceRoom.getRoomName());
    }

}
