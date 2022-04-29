package Behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private final List<Subscriber> subs = new ArrayList<>();
    public String videoTitle;
     String ChannelName;

    Channel(String name){
        this.ChannelName = name;
    }

    @Override
    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }

    @Override
    public void unsubscribe(Observer sub) {
        subs.remove(sub);
    }

    @Override
    public void notifySubscriber() {
        for(Observer sub : subs) {
            sub.update(this);
        }
    }

    @Override
    public void upload(String videoTitle) {
        this.videoTitle = videoTitle;
        notifySubscriber();
    }
}
