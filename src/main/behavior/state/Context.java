package main.behavior.state;

public class Context {

    private State state;

    public Context(State closeState) {
        this.state = closeState;
    }

    public void click() {
        state.action(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
