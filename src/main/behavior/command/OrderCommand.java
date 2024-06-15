package main.behavior.command;

public class OrderCommand implements Command {

    private Server server;

    public OrderCommand(Server server) {
        this.server = server;
    }

    @Override
    public String execute() {
        server.order();
        return "실행 완료";
    }
}
