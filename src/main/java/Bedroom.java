import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String roomType;
    private ArrayList<Guest> guests;
    private double nightlyRate;

    public Bedroom(int roomNumber, int capacity, String roomType, double nightlyRate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.nightlyRate = nightlyRate;
    }

    public int checkGuest() {
        return this.guests.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuests() {
        this.guests.clear();
    }

    public boolean atCapacity() {
        if (this.capacity > this.checkGuest()) {
            return false;
        }
        return true;
    }

}
