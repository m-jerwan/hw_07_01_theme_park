import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Visitor jimmy;
    Visitor marky;
    Playground ballPit;

    @Before
    public void before(){
        jimmy = new Visitor(15, 1800, "Twenty Seven", 1 );
        marky = new Visitor(16, 1800, "Twenty Seven", 1 );
        ballPit = new Playground("Jimmis", 8);
    }

    @Test
    public void canPlay(){
        boolean test = ballPit.isAllowedTo(jimmy);
        assertEquals(true, test);
    }

    @Test
    public void cannotPlay(){
        boolean test = ballPit.isAllowedTo(marky);
        assertEquals(false, test);
    }
}
