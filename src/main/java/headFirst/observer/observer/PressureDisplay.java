package headFirst.observer.observer;

import headFirst.observer.DisplayElement;
import headFirst.observer.subject.Subject;
import headFirst.observer.subject.WeatherData;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public class PressureDisplay implements Observer, DisplayElement {
    private double pressure;
    private Subject weatherData;

    public PressureDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        if (weatherData instanceof WeatherData) {
            WeatherData newWeatherData = (WeatherData) weatherData;
            pressure = newWeatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("Current pressure: " + pressure + " Pa.");
    }

}
