package main.behavior.command;

public class Client {

    public static void main(String[] args) {
        Server server = new Server();
        Command command = new OrderCommand(server);
        Controll controll = new Controll(command);

        controll.call();

        Server2 server2 = new Server2();
        Command command2 = new Order2Command(server2);
        Controll controll2 = new Controll(command2);

        controll2.call();

    }
}
