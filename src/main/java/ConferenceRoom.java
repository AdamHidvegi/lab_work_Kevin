import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }


    public int getCapacity() {
        return this.capacity;
    }

    public String getRoomName() {
        return this.name;
    }

    public int checkGuest() {
        return this.guests.size();
    }
}
