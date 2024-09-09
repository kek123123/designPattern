package main.ex.ex4.after;

public class DraftState implements State {

    @Override
    public void render() {
        System.out.println("Rendering draft document.");
    }

    @Override
    public void publish(Context context) {
        System.out.println("Document sent for review.");
        context.setState(new ReviewState());
    }
}
