public class NewSubscriber implements Observer{
    @Override
    public void update(String text) {
        System.out.println("Message To New Subscriber: "+ text);
        System.out.println();
    }
}
