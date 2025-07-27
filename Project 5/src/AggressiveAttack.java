public class AggressiveAttack extends State{


    public void robotReaction(){
        if(robot.otherrobotfound)
            System.out.println("Attackkkkk !!!!!!!!");
        else
            System.out.println("No Robot Found");
    }
}