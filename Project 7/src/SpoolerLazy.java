public class SpoolerLazy {
    private static volatile SpoolerLazy uniqueInstance; 

    private SpoolerLazy(){}

    public static SpoolerLazy getInstance(){
        if(uniqueInstance == null){
            synchronized(SpoolerLazy.class) {
                if(uniqueInstance == null)
                    uniqueInstance = new SpoolerLazy();
            }
        }
        return uniqueInstance;
    }
}