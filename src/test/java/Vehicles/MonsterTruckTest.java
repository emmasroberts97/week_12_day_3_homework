package Vehicles;

import Components.Engine;
import Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterTruckTest {

    private Engine engine;
    private Tyre tyre;
    private MonsterTruck maximumDestruction;

    @Before
    public void before(){
        engine = new Engine("diesel", 300);
        tyre = new Tyre("tractor", "BKT");
        maximumDestruction = new MonsterTruck("Willman", "Futuristic SUV", engine, tyre, 100000);
    }

    @Test
    public void hasMake(){
        assertEquals("Willman", maximumDestruction.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Futuristic SUV", maximumDestruction.getModel());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, maximumDestruction.getEngine());
    }

    @Test
    public void hasTyre(){
        assertEquals(tyre, maximumDestruction.getTyre());
    }
}
