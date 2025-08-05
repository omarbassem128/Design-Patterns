public class SpoolerEager {
    private static SpoolerEager uniqueInstance = new SpoolerEager();
    
    private SpoolerEager(){}

    public static SpoolerEager getUniqueInstance(){
        return uniqueInstance;
    }

}
