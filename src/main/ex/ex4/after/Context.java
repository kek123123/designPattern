package main.ex.ex4.after;

public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void render() {
        state.render();
    }

    public void publish() {
        state.publish(this);
    }
}
