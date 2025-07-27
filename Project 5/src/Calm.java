public class Calm extends State{

    @Override
    public void robotReaction() {
        if(robot.otherrobotfound)
            System.out.println("ignore");
        else
            System.out.println("No Robot Found");
    }
}