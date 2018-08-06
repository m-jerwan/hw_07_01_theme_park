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
        ballPit = new Playground();
    }

    @Test
    public void jimmyCanPlay(){
        boolean test = ballPit.isAllowedTo(jimmy);
        assertEquals(true, test);
    }

    @Test
    public void markyCannotPlay(){
        boolean test = ballPit.isAllowedTo(marky);
        assertEquals(false, test);
    }
}
