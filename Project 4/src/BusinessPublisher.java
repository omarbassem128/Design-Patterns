import java.util.ArrayList;
import java.util.Scanner;

public class BusinessPublisher implements Subject{
    ArrayList<Observer> subscribers = new ArrayList<>();
    String article;

    @Override
    public void addObserver(Observer o) {
        if(!subscribers.contains(o))
            subscribers.add(o);
        else
            System.out.println("Subscriber Already Exists");
    }

    public void removeObserver(Observer o) {
        if(subscribers.contains(o))
            subscribers.remove(o);
        else
            System.out.println("Subscriber Doesn't Exist");
    }
    
    public void writeArticle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Your Article:-");
        this.article = sc.nextLine();
    }
    
    
    public void publishArticle(){
        notifyObservers();
    }
    
    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(article);
        }
    }

}