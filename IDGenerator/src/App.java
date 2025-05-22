public class App {
    public static void main(String[] args) throws Exception {
        IDGenerator generator = IDGenerator.getInstance();
        String stu1id = generator.generateID();
        System.out.println(stu1id);
    }
}
