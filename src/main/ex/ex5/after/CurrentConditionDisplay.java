package main.ex.ex5.after;

public class CurrentConditionDisplay implements Display {

    @Override
    public void update(float temperature) {
        System.out.println("Current conditions: " + temperature + "F degrees");
    }
}
