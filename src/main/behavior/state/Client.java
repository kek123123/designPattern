package main.behavior.state;

public class Client {

    public static void main(String[] args) {
        Context context = new Context(CloseState.getInstance());

        context.click();
        context.click();
        context.click();
        context.click();
    }
}
