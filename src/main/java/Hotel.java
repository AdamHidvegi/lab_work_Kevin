import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(ArrayList<Bedroom> bedrooms) {
        this.bookings = new ArrayList<Booking>();
        this.bedrooms = bedrooms;
    }

    public int roomCounter() {
        return this.bedrooms.size();
    }

    public void checkIn(Guest guest, Bedroom bedroom) {
        if (!bedroom.atCapacity()) {
            bedroom.addGuest(guest);
            guest.addBookedRoom(bedroom);
        }
    }

    public void checkOut(Guest guest, Bedroom bedroom) {
        bedroom.removeGuests();
        guest.removeBookedRoom();
    }

    private void addRoom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public Bedroom removeRoom() {
        return this.bedrooms.remove(0);
    }

    public Booking bookRoom(Bedroom bedroom, int numberNights) {
        Booking booking = new Booking(bedroom, numberNights);
        return booking;
    }

}
