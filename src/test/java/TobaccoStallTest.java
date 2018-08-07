import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {
    Visitor jimmy;
    Visitor marky;
    TobaccoStall camel;

    @Before
    public void before(){
        jimmy = new Visitor(17, 1800, "Twenty Seven", 1 );
        marky = new Visitor(18, 1800, "Twenty Seven", 1 );
        camel = new TobaccoStall("Camel bonanza", "John Belushi", "E32");
    }

    @Test
    public void canBuyCigarretesNo(){
        boolean test = camel.isAllowedTo(jimmy);
        assertEquals(false, test);
    }

    @Test
    public void canBuyCigarretesYes(){
        boolean test = camel.isAllowedTo(marky);
        assertEquals(true, test);
    }
}
