package headFirst.observer;

import headFirst.observer.observer.CurrentConditionsDisplay;
import headFirst.observer.observer.PressureDisplay;
import headFirst.observer.subject.WeatherData;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public class Demo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4);

        weatherData.removeObserver(pressureDisplay);
        weatherData.setMeasurements(78, 90, 29.2);
    }
}
