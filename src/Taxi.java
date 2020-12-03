public class Taxi extends Car {
    private int peopleOnTaxi = 0;
    public Taxi(String id) {
        this.id = ("taxi_" + id);
        length = super.getLength() * 1f;
    }

    public void getOnTaxi() {
        this.peopleOnTaxi++;
    }

    public void getOffTaxi() {
        if(this.peopleOnTaxi<=0);
        else this.peopleOnTaxi++;
    }

}