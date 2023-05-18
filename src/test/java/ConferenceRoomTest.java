import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        Guest guest1 = new Guest("Jimmy");
        ArrayList<Guest> guestList1 = new ArrayList<>();
        guestList1.add(guest1);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE1, guestList1, "CodeClan");
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", conferenceRoom.getName());
    }
}
