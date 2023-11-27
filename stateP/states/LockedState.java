package youtube_states.states;

import youtube_states.Viewing;

public class LockedState implements ViewingState {
    private Viewing v;

    public LockedState(Viewing v) {
        this.v = v;
    }

    @Override
    public void onLock() {
        if (v.isPlaying()) {
            v.setState(new ReadyState(v));
            System.out.println("locked -> ready");
        }
    }

    @Override
    public void onPlay() {
        v.setState(new ReadyState(v));
        System.out.println("locked -> ready");
    }

    @Override
    public void onNext() {
        System.out.println("Error: Locked");
    }
    
}
