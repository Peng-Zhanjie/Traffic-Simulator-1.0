import org.junit.Assert;
import org.junit.Test;


class TaxiTest {
    Taxi taxi = new Taxi("0");

    @Test
    void getLength() {
        Assert.assertEquals(1, taxi.getLength(),0);
    }

    @Test
    void getId() {
        Assert.assertEquals("taxi_0", taxi.getId());
    }

    @Test
    void testInheritance() {
        Assert.assertEquals(0, taxi.getSpeed());
        Assert.assertEquals(1, taxi.getPosition());
    }

    //test people in the taxi
    @Test
    void testGetOnTaxi(){
        int people=taxi.getPeople();
        taxi.getOnTaxi();
        Assert.assertEquals(people+1, taxi.getPeople());
    }


}