import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemsTest {

    Visitor jimmy;
    Visitor marky;
    Dodgems superCars;

    @Before
    public void before(){
        jimmy = new Visitor(11, 1800, "Twenty Seven", 1 );
        superCars = new Dodgems("SuperCars", 5);
    }

    @Test
    public void shortHalfPrice(){
        assertEquals(2.25, superCars.priceFor(jimmy));
    }

}
