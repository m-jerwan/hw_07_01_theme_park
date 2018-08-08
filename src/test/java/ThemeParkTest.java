import org.junit.Before;
import org.junit.Test;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark absoluteFunBonanza;
    Rollercoaster theRedLight;
    TobaccoStall camel;
    Playground ballPit;
    IceCreamStall iceCream1;
    Visitor visitor_01;

    @Before
    public void before(){
        camel = new TobaccoStall("Camel Boogie", "John Belushi", "E21");
        iceCream1 = new IceCreamStall("Cream Heaven", "John Newman", "R21");
        ballPit = new Playground("Jimmys", 2);
        theRedLight = new Rollercoaster("UpsideDown", 5);

        absoluteFunBonanza = new ThemePark();

        absoluteFunBonanza.addStall(iceCream1);
        absoluteFunBonanza.addStall(camel);
        absoluteFunBonanza.addAttraction(ballPit);
        absoluteFunBonanza.addAttraction(theRedLight);

        visitor_01 = new Visitor(17, 199, "Anna", 20);

    }

    @Test
    public void hasAttraction(){
        boolean test = absoluteFunBonanza.hasPlace(theRedLight);
        assertTrue(test);
    }

    @Test
    public void hasStall(){
        boolean test = absoluteFunBonanza.hasPlace(camel);
        assertTrue(test);
    }
    @Test
    public void countReviews(){
        assertEquals(4, absoluteFunBonanza.getAllReviewed().size());
    }

    @Test
    public void countWhichPlacedICanVisit(){
        assertEquals(2, absoluteFunBonanza.getAllAllowedFor(visitor_01).size());
    }
}
