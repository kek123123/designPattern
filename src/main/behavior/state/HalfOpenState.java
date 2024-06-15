package main.behavior.state;

public class HalfOpenState implements State {

    private HalfOpenState() {}

    private static class HalfOpenStateHolder {
        private static final HalfOpenState INSTANCE = new HalfOpenState();
    }

    public static HalfOpenState getInstance() {
        return HalfOpenStateHolder.INSTANCE;
    }

    @Override
    public void action(Context context) {
        System.out.println("half open");
        context.setState(OpenState.getInstance());
    }
}
