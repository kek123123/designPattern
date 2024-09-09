package main.ex.ex4.after;

public class ApprovedState implements State {

    @Override
    public void render() {
        System.out.println("Rendering approved document.");
    }

    @Override
    public void publish(Context context) {
        System.out.println("Document is already approved.");
    }
}
