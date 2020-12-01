import org.junit.Test;
import org.junit.Assert;

class BusTest {

    Road road = new Road("0", 1, 5, new int[]{0, 0});
    Bus bus = new Bus("0");

    @Test
    void getLength() {
        Assert.assertEquals(3, bus.getLength(),0);
    }

    @Test
    void getId() {
        Assert.assertEquals("bus_0", bus.getId());
    }

    @Test
    void testInheritance() {
        Assert.assertEquals(0, bus.getSpeed());
        Assert.assertEquals(1, bus.getPosition());
    }
}