package main.ex.ex2.after;

public class LightOnCommand implements Command {

    private AfterLight light;

    public LightOnCommand(AfterLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
