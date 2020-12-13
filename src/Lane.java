public class Lane extends Road {
        int LaneSet=1;
        static final int RIGHT_LANE_SIDE=1;
        static final int LEFT_LANE_SIDE=0;
    public Lane(String id,int laneSet) {
        this.id= ("lane_" + id);
        length = super.getLength()/2;
        this.LaneSet=laneSet;
    }
}