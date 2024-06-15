package main.behavior.command;

public class Controll {

    private Command command;

    public Controll(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }
}
