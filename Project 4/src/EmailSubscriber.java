public class EmailSubscriber implements Observer{
    @Override
    public void update(String text) {
        System.out.println("Message To Email Subscriber: "+ text);
        System.out.println();
    }
}