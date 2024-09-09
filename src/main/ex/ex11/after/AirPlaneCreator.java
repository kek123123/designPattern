package main.ex.ex11.after;

public class AirPlaneCreator implements Creator {
    @Override
    public AfterTransport create() {
        return new AfterAirplane();
    }
}
