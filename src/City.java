import java.util.ArrayList;

public class City {
    private String id;
    private static final int STOPPED = 0;
    private int citySpeed=1;
    public ArrayList<Car> carsOnCity = new ArrayList<>();
    public ArrayList<TrafficLight> lightsOnCity = new ArrayList<>();
    public ArrayList<Road> roadsOnCity = new ArrayList<>();
    public ArrayList<Passerby> passersbyOnCity = new ArrayList<>();

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

    int getRoads(){
        int countRoad = 0;
        for(Road road : roadsOnCity){
            countRoad++;
        }
        return countRoad;
    }

    int getCars(){
        int countCar = 0;
        for(Car car : carsOnCity){
            countCar++;
        }
        return countCar;
    }

    int getTrafficLight(){
        int countTrafficLight = 0;
        for(TrafficLight trafficLight : lightsOnCity){
            countTrafficLight++;
        }
        return countTrafficLight;
    }
}
