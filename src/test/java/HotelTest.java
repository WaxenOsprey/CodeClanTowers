import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;

    Bedroom bedroom1;

    @Before
    public void before(){
        guest1 = new Guest("Jimmy");
        ArrayList<Guest> guestList1 = new ArrayList<>();
        guestList1.add(guest1);

        bedroom1 = new Bedroom(RoomType.SINGLE, guestList1, 1);
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
        hotel = new Hotel(bedrooms, conferenceRooms, "CodeClan Towers");
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void canCheckIn(){
        hotel.checkIn(guest1, bedroom1);
        assertEquals(1, bedroom1.getGuestList().size());
    }
}
