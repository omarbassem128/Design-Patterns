public class AggressiveState implements State{
    public void robotReaction(boolean bool){
    if(bool)
        System.out.println("Attackkkk!!!!!");
    else
        System.out.println("No Robot Found");
    }
}