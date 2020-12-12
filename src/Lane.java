public class Lane extends Road {
    public Lane(String id) {
        this.id= ("lane_" + id);
        length = super.getLength() /2;
    }
}