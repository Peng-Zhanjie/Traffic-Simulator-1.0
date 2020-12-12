import java.util.ArrayList;

public class City {
    private String id;
    private static final int STOPPED = 0;
    private int citySpeed=1;
    public ArrayList<Car> carsOnCity = new ArrayList<>();
    public ArrayList<TrafficLight> lightsOnCity = new ArrayList<>();
    public ArrayList<Road> roadOnCity = new ArrayList<>();
    public ArrayList<Passerby> passerbyOnCity = new ArrayList<>();

    public City(String id){
        this.id = "City_" + id;
    }
    void stopCity(){
        citySpeed=STOPPED;
        for (Car car : carsOnCity) {
            car.setSpeed(citySpeed);
            }
    }
      //Stop mode

    void runCity(){
        citySpeed=1;
        for (Car car : carsOnCity) {
            car.setSpeed(car.currentRoad.getSpeedLimit());
        }
    }  //Running mode
}
