import java.util.ArrayList;

public class Road {
    String id;
    private int speedLimit;
    int length=2;
    private int[] startLocation;
    private int[] endLocation;
    private ArrayList<Car> carsOnRoad = new ArrayList<>();
    private ArrayList<TrafficLight> lightsOnRoad = new ArrayList<>();
    private ArrayList<Road> connectedRoads = new ArrayList<>();

    public Road(String id, int speedLimit, int length, int[] startLocation) {
        this.id = "road_" + id;
        this.speedLimit = speedLimit;
        this.length = length;
        this.startLocation = startLocation;
        this.endLocation = new int[]{this.length + this.startLocation[0], 0}; //only works for horizontal roads;
    }

    public Road() {
    }

//    public void createCars(int carSpawns) {
//        for (int i = 0; i < carSpawns; i++)
//            carsOnRoad.add(new Car(Integer.toString(i), this));
//    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String printStartLocation() {
        return startLocation[0] + "," + startLocation[1];
    }

    public void setStartLocation(int[] startLocation) {
        this.startLocation = startLocation;
        this.endLocation = new int[]{this.length + this.startLocation[0], 0}; //only works for horizontal roads;
    }

    public String printEndLocation() {
        return endLocation[0] + "," + endLocation[1];
    }

    public void printRoadInfo() {
        System.out.printf("%s limit of:%dm/s is %dm long at location:%s to %s%n", this.getId(), this.getSpeedLimit(), this.getLength(), this.printStartLocation(), this.printEndLocation());
    }

    public void setEndLocation(int[] endLocation) {
        this.endLocation = endLocation;
    }

    public int[] getStartLocation() {
        return startLocation;
    }

    public int[] getEndLocation() {
        return endLocation;
    }

    public ArrayList<Car> getCarsOnRoad() {
        return carsOnRoad;
    }

    public void setCarsOnRoad(ArrayList<Car> carsOnRoad) {
        this.carsOnRoad = carsOnRoad;
    }

    public ArrayList<TrafficLight> getLightsOnRoad() {
        return lightsOnRoad;
    }

    public void setLightsOnRoad(ArrayList<TrafficLight> lightsOnRoad) {
        this.lightsOnRoad = lightsOnRoad;
    }

    public ArrayList<Road> getConnectedRoads() {
        return connectedRoads;
    }

    public void setConnectedRoads(ArrayList<Road> connectedRoads) {
        this.connectedRoads = connectedRoads;
    }

    //get how many cars in the road
    int getCars(){
        int countCar = 0;
        for(Car car : carsOnRoad){
            countCar++;
        }
        return countCar;
    }

    //get min Car distance in the road
    public int getMinCarDistance(){
        int distance=0;
        if(getCars()==0 || getCars()==1){
            return distance;
        }
        else {
            for(Car car1 : carsOnRoad){
                for (Car car2 : carsOnRoad){
                    int distance1=Math.abs(car1.getPosition()-car2.getPosition());
                    if((distance1<=distance&&distance!=0)||(distance==0)){ distance=distance1;}
                }
            }
            return distance;
        }
    }
}
