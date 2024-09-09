package main.ex.ex2.after;

import java.util.LinkedList;
import java.util.Queue;

public class AfterRemoteControl {

    private Queue<Command> queue = new LinkedList<>();

    public void produce(Command command) {
        queue.add(command);
    }

    public void consume() {
        for (Command command : queue) {
            command.execute();
        }
        queue.clear();
    }
}
