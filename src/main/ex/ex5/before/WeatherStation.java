package main.ex.ex5.before;

public class WeatherStation {
    private float temperature;
    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    public WeatherStation() {
        this.currentConditionsDisplay = new CurrentConditionsDisplay();
        this.statisticsDisplay = new StatisticsDisplay();
        this.forecastDisplay = new ForecastDisplay();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }

    private void measurementsChanged() {
        currentConditionsDisplay.update(temperature);
        statisticsDisplay.update(temperature);
        forecastDisplay.update(temperature);
    }

    public float getTemperature() {
        return temperature;
    }
}
