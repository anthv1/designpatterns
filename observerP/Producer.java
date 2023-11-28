package youtube;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String name;
    private List<Video> videos = new ArrayList<Video>();
    private List<Subscriber> subscribers = new ArrayList<>();
    // private List<User> users;
    // private List<PremiumUser> premiumUsers;

    public Producer(String name) {
        this.name = name;
    }

    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
        System.out.println("added subscriber");
    }

    public void postVideo() {
        for (Subscriber s : subscribers) {
            s.update();
        }

    }

    public static void main(String[] args) {
        Producer p = new Producer("producer");
        User u = new User("user");
        User u2 = new User("user2");

        p.addSubscriber(u);
        p.postVideo();
        p.addSubscriber(u2);
        p.postVideo();

        PremiumUser pu = new PremiumUser("premium");
        p.addSubscriber(pu);
        p.postVideo();
    }

}
