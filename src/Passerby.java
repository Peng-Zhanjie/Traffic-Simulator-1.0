import java.util.ArrayList;

public class Passerby {
    private String id;
    private int[] Location;
    private int ifTakeTaxi;
    private Road currentRoad;
    private static final int NOT_WILLING= 0;  //boolean False
    private static final int TAKE_WILLING= 1;  //boolean True
    public Passerby(String id, int[] Location, Road currentRoad){
        this.id = "Passerby_" + id;
        this.ifTakeTaxi=NOT_WILLING;
        this.Location=Location;
        this.currentRoad=currentRoad;
    }
    void WillTakeTaxi(){
        this.ifTakeTaxi=TAKE_WILLING;
    }  //Decide to take taxi

    void NoTakeTaxi(){ this.ifTakeTaxi=NOT_WILLING;}  //Refuse to take taxi

    public String getId() {
        return id;
    }

    public int getLocation() { return Location[0];}  //get passerby location

    public int getIfTakeTaxi(){return ifTakeTaxi;}
}
