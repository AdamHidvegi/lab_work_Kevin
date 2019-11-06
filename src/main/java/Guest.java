import java.util.ArrayList;

public class Guest {

    private String name;
    private ArrayList<Bedroom> bookedRoom;

    public Guest(String name) {
        this.name = name;
        this.bookedRoom = new ArrayList<Bedroom>();
    }

    public String getName() {
        return this.name;
    }

    public int getBookedRoom(){
        return this.bookedRoom.size();
    }

    public void addBookedRoom(Bedroom bedroom){
        this.bookedRoom.add(bedroom);
    }

    public Bedroom removeBookedRoom() {
        return this.bookedRoom.remove(0);
    }



}
