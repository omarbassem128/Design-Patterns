public class Spooler {
    private static Spooler uniqueInstance = new Spooler();
    
    private Spooler(){}

    public static Spooler getUniqueInstance(){
        return uniqueInstance;
    }

}
