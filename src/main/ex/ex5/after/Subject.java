package main.ex.ex5.after;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Display> displayList;
    private float temperature;

    public Subject() {
        this.displayList = new ArrayList<>();
    }

    public void addDisplay(Display display) {
        displayList.add(display);
    }

    public void removeDisplay(Display display) {
        displayList.remove(display);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notification();
    }

    public void notification() {
        for (Display display : displayList) {
            display.update(temperature);
        }
    }
}
