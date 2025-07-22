public class SMSSubscriber implements Observer{
    @Override
    public void update(String text) {
        System.out.println("Message To SMS Subscriber: "+ text);
        System.out.println();
    }
}