package main.ex.ex4.after;

public class ReviewState implements State {

    @Override
    public void render() {
        System.out.println("Rendering document under review.");
    }

    @Override
    public void publish(Context context) {
        System.out.println("Document approved.");
        context.setState(new ApprovedState());
    }
}
