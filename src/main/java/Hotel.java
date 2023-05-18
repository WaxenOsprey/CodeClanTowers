import java.util.ArrayList;

public class Hotel {

    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    String name;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, String name){
        this.bedrooms =  bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void checkIn(Guest guest, Room room){
        room.addGuestToArrayList(guest);
    }
}
