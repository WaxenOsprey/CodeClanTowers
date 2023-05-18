import java.util.ArrayList;

public abstract class Room {

    RoomType roomType;
    ArrayList<Guest> guestList;



    public Room(RoomType roomType, ArrayList<Guest> guestList){
        this.roomType = roomType;
        this.guestList = guestList;

    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void addGuestToArrayList(Guest guest) {
        guestList.add(guest);
    }
}
