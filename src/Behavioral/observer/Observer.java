package Behavioral.observer;

public interface Observer {
    void subscribeChannel(Channel ch);
    void unsubscribeChannel(Channel ch);
    void update(Channel channel);
    void getAllSubscription();
}
