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
    @Before
    public void before(){
        camel = new TobaccoStall();
        ballPit = new Playground();
        theRedLight = new Rollercoaster();
        absoluteFunBonanza = new ThemePark();
        absoluteFunBonanza.addStall(camel);
        absoluteFunBonanza.addAttraction(ballPit);
        absoluteFunBonanza.addAttraction(theRedLight);
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
        assertEquals(3, absoluteFunBonanza.getAllReviewed().size());
    }
}
