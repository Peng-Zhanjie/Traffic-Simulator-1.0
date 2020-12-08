public class Taxi extends Car {
    private int peopleOnTaxi = 0;
    public Taxi(String id) {
        this.id = ("taxi_" + id);
        length = super.getLength() * 1f;
    }

    //People get on taxi
    public void getOnTaxi() {
        this.peopleOnTaxi++;
    }

    //People get off taxi
    public void getOffTaxi() {
        if(this.peopleOnTaxi<=0);
        else this.peopleOnTaxi--;
    }

    public int getPeople() {
        return this.peopleOnTaxi;
    }

}