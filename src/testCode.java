import java.util.ArrayList;
import java.util.List;

public class testCode {

    public static final int USERINPUT = 2;
    //creates multiple car objects:                   *************
    public static void main(String[] args) {
        //Test Car in CarTest class
        CarTest testCar=new CarTest();
        testCar.getLength();
        testCar.getBreadth();
        testCar.getSpeed();
        testCar.getPosition();
        testCar.getRoad();
        testCar.getId();
        testCar.testMove();

        //Test Bus in BusTest class
        BusTest testBus=new BusTest();
        testBus.getLength();
        testBus.getId();
        testBus.testInheritance();

        //Test Motorbike in MotorbikeTest class
        MotorbikeTest testBike= new MotorbikeTest();
        testBike.getLength();
        testBike.getId();
        testBike.testInheritance();

        //Test Taxi in TaxiTest class
        TaxiTest testTaxi=new TaxiTest();
        testTaxi.testInheritance();
        testTaxi.getId();
        testTaxi.getLength();
        testTaxi.testGetOnTaxi();


        //Test Road in RoadTest class
        RoadTest testRoad=new RoadTest();
        testRoad.getId();
        testRoad.getLength();
        testRoad.getSpeedLimit();
        testRoad.getStartLocation();
        testRoad.getEndLocation();
        testRoad.getCars();
        testRoad.getLights();

        //Test Lane in RoadTest class
        LaneTest testLane=new LaneTest();
        testLane.getId();
        testLane.getLength();

        //Test TrafficLight in TrafficLightTest class
        TrafficLightTest testTrafficLight=new TrafficLightTest();
        testTrafficLight.getId();
        testTrafficLight.getPosition();
        testTrafficLight.getRoad();
        testTrafficLight.getState();
        testTrafficLight.testOperate();

        //Test passerby in PasserbyTest class
        PasserbyTest testPasserby=new PasserbyTest();
        testPasserby.getId();
        testPasserby.getLocation();
        testPasserby.getIfTakeTaxi();


        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < USERINPUT; i++){
            Road road = new Road("0", 1, 5, new int[]{0, 0});
            cars.add(new Car("Car" + (i + 1), road));
        }
        cars.get(0).setSpeed(1);
        for (int object = 0; object < USERINPUT; object++) {
            System.out.printf("%s going:%dseg/s at location:%s%n", cars.get(object).getId(), cars.get(object).getSpeed(), cars.get(object).getPosition());
        }

    }
}

//Simulation loop: that gets user input for each turn
//        System.out.println("Start Simulation?(y)");
//                String answer = simController.nextLine();
//                answer = answer.toLowerCase();
//                if (answer.equals("y")) {
//                do {
//                turn = turn + 1;
//                for (int i = 0; i < carSpawns; i++) {
//        Car currentCar = cars.get(i);
//        TrafficLight currentLight = lights.get(i);
//        currentLight.operate();
//        currentLight.printLightStatus();
//        currentCar.move();
//        currentCar.printCarStatus();
//        }
//
//
//        System.out.println("Sim turn = " + turn + "\nContinue Sim?(y)");
//        answer = simController.nextLine();
//        answer = answer.toLowerCase();
//        } while (answer.equals("y"));
//        }
