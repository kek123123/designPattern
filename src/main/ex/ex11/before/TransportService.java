package main.ex.ex11.before;

public class TransportService {
    public Transport createTransport(String type) {
        if (type.equals("BUS")) {
            return new Bus();
        } else if (type.equals("TAXI")) {
            return new Taxi();
        } else if (type.equals("BICYCLE")) {
            return new Bicycle();
        } else {
            throw new IllegalArgumentException("Unknown transport type: " + type);
        }
    }
}
