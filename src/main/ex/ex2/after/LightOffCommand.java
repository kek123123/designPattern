package main.ex.ex2.after;

public class LightOffCommand implements Command {

    private AfterLight light;

    public LightOffCommand(AfterLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
