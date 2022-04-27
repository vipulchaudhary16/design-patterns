package Behavioral.observer;

public interface Subject {
    void subscribe(Subscriber sub );
    void unsubscribe(Observer sub);
    void notifySubscriber();
    void upload(String title);
}
