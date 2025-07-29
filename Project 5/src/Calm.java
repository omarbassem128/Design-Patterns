public class Calm implements State{
    public void robotReaction(boolean bool){
    if(bool)
        System.out.println("Ignore");
    else
        System.out.println("No Robot Found");
    }
}