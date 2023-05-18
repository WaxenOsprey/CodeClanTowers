import java.util.ArrayList;

public class Bedroom extends Room {

    int roomNumber;

    public Bedroom(RoomType roomType, ArrayList<Guest> guestList, int roomNumber){
        super(roomType, guestList);
        this.roomNumber = roomNumber;
    }


}
