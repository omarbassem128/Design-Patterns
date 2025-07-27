public class App {
    public static void main(String[] args) throws Exception {
        Robot robot1 = new Robot();
        Robot robot2 = new Robot();
        Robot robot3 = new Robot();

        robot1.setState(new AggressiveState());
        robot2.setState(new Calm());
        robot3.setState(new ScareAndRun());
        robot1.otherRobotFoundSensor(false);
        robot2.otherRobotFoundSensor(false);
        robot3.otherRobotFoundSensor(false);
        robot1.otherRobotFoundSensor(true);
        robot2.otherRobotFoundSensor(true);
        robot3.otherRobotFoundSensor(true);
    }
}