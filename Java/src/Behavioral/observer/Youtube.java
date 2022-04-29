package Behavioral.observer;

public class Youtube {
    public static void main(String[] args) {
        Channel CodeWithHarry = new Channel("Code With Harry");
        Channel TechnicalSagar = new Channel("Technical Sagar");

        Subscriber s1 = new Subscriber("Vipul");
        Subscriber s2 = new Subscriber("Harsh");
        Subscriber s3 = new Subscriber("SheelKumar");

       Subscribe(s1 ,CodeWithHarry);
       Subscribe(s2 ,CodeWithHarry);
       Subscribe(s3 ,CodeWithHarry);
       Subscribe(s2 ,TechnicalSagar);

       UnSubscribe(s1 , CodeWithHarry);

       s1.getAllSubscription();
       s2.getAllSubscription();
       s3.getAllSubscription();

        CodeWithHarry.upload("Design patterns sirf 15 minutes me");
        TechnicalSagar.upload("Dabbe vaale Guruji - Exposed");
    }

    public static void Subscribe(Subscriber subscriber , Channel channel){
        channel.subscribe(subscriber);
        subscriber.subscribeChannel(channel);
    }

    public static void UnSubscribe(Subscriber subscriber , Channel channel){
        channel.unsubscribe(subscriber);
        subscriber.unsubscribeChannel(channel);
    }


}
