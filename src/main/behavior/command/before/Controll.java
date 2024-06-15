package main.behavior.command.before;

public class Controll {

    private Server server;

    public Controll(Server server) {
        this.server = server;
    }

    public void execute() {
        server.order();
    }
}
