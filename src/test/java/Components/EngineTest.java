package Components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before
    public void before(){
        engine = new Engine("diesel", 2);
    }

    @Test
    public void hasType(){
        assertEquals("diesel", engine.getType());
    }

    @Test
    public void hasHorsePower(){
        assertEquals(2, engine.getHorsePower());
    }
}
