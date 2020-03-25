package Components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    private Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Monster", "Michellin");
    }

    @Test
    public void hasType(){
        assertEquals("Monster", tyre.getType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Michellin", tyre.getBrand());
    }
}
