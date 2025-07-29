public class Robot{
    State state;
    boolean otherRobotFound;

    public void setState(State state){
        this.state = state;
    }

    public void otherRobotFoundSensor(boolean otherRobotFound){
        this.otherRobotFound = otherRobotFound;
        state.robotReaction(this.otherRobotFound);
    }
}