package youtube;

// The observer interface
// We use an interface (unintuitively called "subscriber")
// So that we could theoretically have different types of users subscribed
// E.g. normal users, youtube premium users, youtube kids users etc..
public interface Subscriber {
    public abstract void update();
}
