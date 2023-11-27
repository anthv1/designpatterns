package youtube_states.states;

import youtube_states.Viewing;

public class ReadyState implements ViewingState {
    private Viewing v;

    public ReadyState(Viewing v) {
        this.v = v;
    }

    @Override
    public void onLock() {
        v.setState(new LockedState(v));
        System.out.println("ready -> locked");
    }

    @Override
    public void onPlay() {
        v.setPlaying(true);
        v.setState(new PlayingState(v));
        System.out.println("ready -> playing");

    }

    @Override
    public void onNext() {
        System.out.println("Error: Locked (cannot move to next video while paused)");

    }
    
}
