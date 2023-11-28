package youtube;

public class PremiumUser implements Subscriber {
    private String name;

    public PremiumUser(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("premium user: new video was posted!");
    }
}
