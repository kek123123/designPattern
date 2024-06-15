package main.behavior.state;

public class CloseState implements State {

    private CloseState() {}

    private static class CloseStateHolder {
        private static final CloseState INSTANCE = new CloseState();
    }

    public static CloseState getInstance() {
        return CloseStateHolder.INSTANCE;
    }

    @Override
    public void action(Context context) {
        System.out.println("Open");
        context.setState(HalfOpenState.getInstance());
    }
}
