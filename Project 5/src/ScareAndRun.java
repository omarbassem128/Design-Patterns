public class ScareAndRun implements State{
    public void robotReaction(boolean bool){
    if(bool)
        System.out.println("Scaring...Running");
    else
        System.out.println("No Robot Found");
    }
}