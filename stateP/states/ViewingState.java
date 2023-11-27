package youtube_states.states;

public interface ViewingState {
    public abstract void onLock();
    public abstract void onPlay();
    public abstract void onNext();
}
