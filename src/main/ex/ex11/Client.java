package main.ex.ex11;

import main.ex.ex11.after.AfterTransport;
import main.ex.ex11.after.AirPlaneCreator;
import main.ex.ex11.after.Creator;
import main.ex.ex11.before.TransportService;

public class Client {

    public static void main(String[] args) {
        TransportService transportService = new TransportService();
        transportService.createTransport("BUS");

        Creator creator = new AirPlaneCreator();
        AfterTransport afterTransport = creator.create();
        afterTransport.move();
    }
}
