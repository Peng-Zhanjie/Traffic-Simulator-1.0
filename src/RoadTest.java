import org.junit.Test;
import java.util.ArrayList;
import org.junit.Assert;


class RoadTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});

    @Test
    void getId() {
        Assert.assertEquals("road_0", road.getId());
    }

    @Test
    void getSpeedLimit() {
        Assert.assertEquals(1, road.getSpeedLimit());
    }

    @Test
    void getLength() {
        Assert.assertEquals(5, road.getLength());
    }

    @Test
    void getStartLocation() {
        int[] expected = {0, 0};
        Assert.assertEquals(expected[0], road.getStartLocation()[0]);
    }

    @Test
    void getEndLocation() {
        int[] expected = {5, 0};
        Assert.assertEquals(expected[0], road.getEndLocation()[0]);
    }

    @Test
    void getCars() {
        ArrayList<Car> expected = new ArrayList<>();
        Assert.assertEquals(expected, road.getCarsOnRoad());
    }

    @Test
    void getLights() {
        ArrayList<TrafficLight> expected = new ArrayList<>();
        Assert.assertEquals(expected, road.getLightsOnRoad());
    }

    @Test
    void getConnectedRoads() {
        ArrayList<Road> expected = new ArrayList<>();
        Assert.assertEquals(expected, road.getConnectedRoads());
    }

    void getMinCarDistance(){
        Assert.assertEquals(0,road.getMinCarDistance());
    }


}