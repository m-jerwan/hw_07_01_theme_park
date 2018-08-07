import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RollerCoasterTest {
    Visitor jimmy;
    Visitor marky;
    Visitor bobby;
    Visitor jenny;
    Rollercoaster maniac;

    @Before
    public void before(){
        jimmy = new Visitor(11, 144, "Twenty Seven", 1 );
        marky = new Visitor(11, 146, "Twenty Seven", 1 );
        bobby = new Visitor(12, 144, "Twenty Seven", 1 );
        jenny = new Visitor(12, 201, "Twenty Seven", 1 );
        maniac = new Rollercoaster("UpsideDown", 3);
    }

    @Test
    public void cannotRideShortNoMoney(){
        boolean test = maniac.isAllowedTo(jimmy);
        assertFalse(test);
    }

    @Test
    public void cannotRideShort(){
        boolean test = maniac.isAllowedTo(marky);
        assertFalse(test);;
    }
    @Test
    public void cannotRideNoMoney(){
        boolean test = maniac.isAllowedTo(bobby);
        assertFalse(test);;
    }
    @Test
    public void canRide(){
        boolean test = maniac.isAllowedTo(jenny);
        assertTrue(test);;
    }

    @Test
    public void singleTicket(){
        assertEquals(8.40, maniac.priceFor(jimmy),0);
    }

    @Test
    public void doubledTicket(){
        assertEquals(16.80, maniac.priceFor(jenny),0);
    }
}
