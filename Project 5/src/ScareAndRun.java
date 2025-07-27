public class ScareAndRun extends State{

    @Override
    public void robotReaction() {
        if(robot.otherrobotfound)
            System.out.println("Scare and run away lol");
        else
            System.out.println("No Robot Found");
    }
}