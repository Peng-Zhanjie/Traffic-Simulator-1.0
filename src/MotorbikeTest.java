import org.junit.Assert;
import org.junit.Test;


class MotorbikeTest {
    Motorbike bike = new Motorbike("0");

    @Test
    void getLength() {
        Assert.assertEquals(0.5, bike.getLength(),0);
    }

    @Test
    void getId() {
        Assert.assertEquals("bike_0", bike.getId());
    }

    @Test
    void testInheritance() {
        Assert.assertEquals(0, bike.getSpeed());
        Assert.assertEquals(1, bike.getPosition());
    }
}