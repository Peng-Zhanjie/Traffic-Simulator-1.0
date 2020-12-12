import org.junit.Test;
import java.util.ArrayList;
import org.junit.Assert;


class LaneTest {
    Lane road = new Lane("0");

    @Test
    void getId() {
        Assert.assertEquals("lane_0", road.getId());
    }

    @Test
    void getLength() {
        Assert.assertEquals(1, road.getLength());
    }

}