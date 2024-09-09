package main.ex.ex2.before;

import main.ex.ex2.after.Command;

import java.util.LinkedList;
import java.util.Queue;

public class RemoteControl {

    private Light light;

    private Queue<Command> queue = new LinkedList<>();

    public RemoteControl(Light light) {
        this.light = light;
    }

    public void pressButton(boolean on) {
        if (on) {
            light.turnOn();
        } else {
            light.turnOff();
        }
    }

    public void produce(Command command) {
        queue.add(command);
    }

    public void consume() {
        for (Command command : queue) {
            command.execute();
        }
    }
}
