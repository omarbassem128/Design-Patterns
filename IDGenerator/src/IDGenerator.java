public class IDGenerator{
    private static IDGenerator uniqueInstance;
    
    private IDGenerator(){}

    public static IDGenerator getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new IDGenerator();
            System.out.println("new unique instance created");
        }
        return uniqueInstance;
    }

    public String generateID(){
        return "1234";
    }
}