package main.behavior.state;

public class OpenState implements State {

    private OpenState() {}

    private static class OpenStateHolder {
        private static final OpenState INSTANCE = new OpenState();
    }

    public static OpenState getInstance() {
        return OpenStateHolder.INSTANCE;
    }

    @Override
    public void action(Context context) {
        System.out.println("Close");
        context.setState(CloseState.getInstance());
    }
}
