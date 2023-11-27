package youtube_states;

import youtube_states.states.ReadyState;
import youtube_states.states.ViewingState;

public class Viewing {
    private ViewingState state = new ReadyState(this);
    private boolean isPlaying = false;

    public void play() {
        state.onPlay();
    }

    public void lock() {
        state.onLock();
    }

    public void next() {
        state.onNext();
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public void setState(ViewingState state) {
        this.state = state;
    }
    

    public static void main(String[] args) {
        Viewing v = new Viewing();
        v.play();
        v.next();
        v.lock();
    }
}
