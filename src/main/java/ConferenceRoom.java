import java.util.ArrayList;

public class ConferenceRoom extends Room {

    String name;

    public ConferenceRoom(RoomType roomType, ArrayList<Guest> guestList, String name){
        super(roomType, guestList);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
