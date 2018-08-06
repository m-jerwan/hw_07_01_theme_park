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
    Rollercoaster ohCrapSon;

    @Before
    public void before(){
        jimmy = new Visitor(11, 144, "Twenty Seven", 1 );
        marky = new Visitor(11, 146, "Twenty Seven", 1 );
        bobby = new Visitor(12, 144, "Twenty Seven", 1 );
        jenny = new Visitor(12, 146, "Twenty Seven", 1 );
        ohCrapSon = new Rollercoaster();
    }

    @Test
    public void jimmyCannotRide(){
        boolean test = ohCrapSon.isAllowedTo(jimmy);
        assertFalse(test);
    }

    @Test
    public void markyCannotRide(){
        boolean test =ohCrapSon.isAllowedTo(marky);
        assertFalse(test);;
    }
    @Test
    public void bobbyCannotRide(){
        boolean test =ohCrapSon.isAllowedTo(bobby);
        assertFalse(test);;
    }
    @Test
    public void jennyCanRide(){
        boolean test =ohCrapSon.isAllowedTo(jenny);
        assertTrue(test);;
    }
}
