public class Robot {
    boolean otherrobotfound;
    State state;
    public void otherRobotFoundSensor(boolean otherrobotfound){
        this.otherrobotfound = otherrobotfound;
    }
    public void setState(State state){
        this.state = state;
    }
}