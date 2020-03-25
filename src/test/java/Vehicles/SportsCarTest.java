package Vehicles;

import Components.Engine;
import Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SportsCarTest {

    private Engine engine;
    private Tyre tyre;
    private SportsCar sportsCar;

    @Before
    public void before(){
        engine = new Engine("diesel", 400);
        tyre = new Tyre("speedy", "Michellin");
        sportsCar = new SportsCar("Porsche", "911", engine, tyre, 20000);
    }

    @Test
    public void hasMake(){
        assertEquals("Porsche", sportsCar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("911", sportsCar.getModel());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, sportsCar.getEngine());
    }

    @Test
    public void hasTyre(){
        assertEquals(tyre, sportsCar.getTyre());
    }
}
