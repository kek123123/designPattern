package main.behavior.command;

public class Order2Command implements Command {

    private Server2 server2;

    public Order2Command(Server2 server2) {
        this.server2 = server2;
    }

    @Override
    public String execute() {
        server2.order();
        return "호출";
    }
}
