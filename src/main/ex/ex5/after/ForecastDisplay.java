package main.ex.ex5.after;

public class ForecastDisplay implements Display {

    @Override
    public void update(float temperature) {
        System.out.println("Forecast: " + temperature + "F degrees");
    }
}
