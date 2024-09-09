package main.ex.ex5;

import main.ex.ex5.after.CurrentConditionDisplay;
import main.ex.ex5.after.ForecastDisplay;
import main.ex.ex5.after.StatisticsDisplay;
import main.ex.ex5.after.Subject;
import main.ex.ex5.before.WeatherStation;

public class Client {

    public static void main(String[] args) {
        //before
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.setTemperature(1.0f);

        //Display를 더 추가하려면 WeatherStation을 변경해야한다.

        Subject subject = new Subject();
        subject.addDisplay(new CurrentConditionDisplay());
        subject.addDisplay(new ForecastDisplay());
        subject.addDisplay(new StatisticsDisplay());

        subject.setTemperature(2.0f);
    }
}
