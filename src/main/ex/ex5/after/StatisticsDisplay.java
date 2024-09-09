package main.ex.ex5.after;

public class StatisticsDisplay implements Display {

    @Override
    public void update(float temperature) {
        System.out.println("Statistics: " + temperature + "F degrees");
    }
}
