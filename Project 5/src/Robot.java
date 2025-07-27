public class Robot{
    State state;
    boolean otherrobotfound;

    public void setState(State state){
        this.state = state;
    }

    public void otherRobotFoundSensor(boolean otherrobotfound){
        this.otherrobotfound = otherrobotfound;
        state.robotReaction(this.otherrobotfound);
    }
}