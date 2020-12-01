import org.junit.Test;
import org.junit.Assert;

class CarTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    Car car = new Car("0", road);

    @Test
    void testMove() {
        car.move();
        Assert.assertEquals(2, car.getPosition());
    }

    @Test
    void getLength() {
        Assert.assertEquals(1, car.getLength(),0);
    }

    @Test
    void getBreadth() {
        Assert.assertEquals(0.5, car.getBreadth(),0);
    }

    @Test
    void getSpeed() {
        Assert.assertEquals(0, car.getSpeed());
    }

    @Test
    void getPosition() {
        Assert.assertEquals(1, car.getPosition());
    }

    @Test
    void getRoad() {
        Assert.assertEquals(road, car.getCurrentRoad());
    }

    @Test
    void getId() {
        Assert.assertEquals("car_0", car.getId());
    }

}