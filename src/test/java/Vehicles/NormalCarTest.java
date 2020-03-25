package Vehicles;

import Components.Engine;
import Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormalCarTest {

    private NormalCar car;
    private Engine engine;
    private Tyre tyre;

    @Before
    public void before(){
        engine = new Engine("Diesel", 3);
        tyre = new Tyre("normal", "Michellin");
        car = new NormalCar("Ford", "Fiesta", engine, tyre, 5000);
    }

    @Test
    public void hasMake(){
        assertEquals("Ford", car.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Fiesta", car.getModel());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasTyre(){
        assertEquals(tyre, car.getTyre());
    }

    @Test
    public void canGetDamaged(){
        car.getDamage(1000);
        assertEquals(4000, car.getPrice());
    }


}
