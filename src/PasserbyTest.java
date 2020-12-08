import org.junit.Assert;
import org.junit.Test;

public class PasserbyTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    Passerby passerby=new Passerby("0", new int[]{2, 0},road);

    @Test
    void getId() {Assert.assertEquals("Passerby_0", passerby.getId());}
    @Test
    void getLocation() { Assert.assertEquals(2, passerby.getLocation());}
    @Test
    void getIfTakeTaxi() { Assert.assertEquals(0, passerby.getIfTakeTaxi());}
}
