public class App {
    public static void main(String[] args) throws Exception {
        BusinessPublisher businessPublisher = new BusinessPublisher();
        EmailSubscriber emailSubscriber = new EmailSubscriber();
        SMSSubscriber smsSubscriber = new SMSSubscriber();
        NewSubscriber newSubscriber = new NewSubscriber();
        NewSubscriber newSubscriber2 = new NewSubscriber();
        businessPublisher.addObserver(emailSubscriber);
        businessPublisher.addObserver(smsSubscriber);
        businessPublisher.addObserver(newSubscriber);
        businessPublisher.removeObserver(newSubscriber2);
        businessPublisher.writeArticle();
        businessPublisher.publishArticle();

    }
}
