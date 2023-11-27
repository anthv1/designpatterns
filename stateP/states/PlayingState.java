package youtube_states.states;

import youtube_states.Viewing;

public class PlayingState implements ViewingState {
    private Viewing v;

    public PlayingState(Viewing v) {
        this.v = v;
    }

    @Override
    public void onLock() {
        v.setPlaying(false);
        v.setState(new LockedState(v));
        System.out.println("playing -> locked");
    }

    @Override
    public void onPlay() {
        v.setPlaying(false);
        v.setState(new ReadyState(v));
        System.out.println("playing -> ready");
    }

    @Override
    public void onNext() {
        System.out.println("now playing the next video");
    }
    
}
