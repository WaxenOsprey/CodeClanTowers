import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        Guest guest1 = new Guest("Jimmy");
        ArrayList<Guest> guestList1 = new ArrayList<>();
        guestList1.add(guest1);
        bedroom = new Bedroom(RoomType.SINGLE, guestList1 ,1);
    }

    @Test
    public void hasGuestList(){
        assertEquals(1, bedroom.getGuestList().size());
    }
}
