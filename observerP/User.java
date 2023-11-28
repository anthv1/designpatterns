package youtube;

public class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("normal user: new video was posted!");
    }

}
