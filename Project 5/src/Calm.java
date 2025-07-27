public class Calm extends State{
    public void robotReaction(boolean bool){
    if(bool)
        System.out.println("Ignore");
    else
        System.out.println("No Robot Found");
    }
}