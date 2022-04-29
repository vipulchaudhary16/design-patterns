package Behavioral.observer;

import java.util.ArrayList;

public class Subscriber implements Observer {
    private final String name;
    private final ArrayList<Channel> subscription = new ArrayList<>();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Channel channel) {
        System.out.println("Hey " + name + ",\n\t" + channel.ChannelName + " Uploaded : " + channel.videoTitle);
    }

    @Override
    public void subscribeChannel(Channel ch) {
        subscription.add(ch);
    }

    @Override
    public void unsubscribeChannel(Channel ch) {
        subscription.remove(ch);
    }

    public void getAllSubscription() {
        System.out.println(name +" , You have subscribed these channels:");
        if(subscription.isEmpty()){
            System.out.println("\tNo Channels to show\n");
        } else {
            for (Channel ch : subscription) {
                System.out.println("\t-> "+ch.ChannelName);
            }
            System.out.println();
        }

    }
}
