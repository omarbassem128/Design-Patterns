public interface Subject {
    void notifyObservers();
    void addObserver(Observer o);
    void removeObserver(Observer o);

}
