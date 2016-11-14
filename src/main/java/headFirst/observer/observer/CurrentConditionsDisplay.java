package headFirst.observer.observer;

import headFirst.observer.DisplayElement;
import headFirst.observer.subject.Subject;
import headFirst.observer.subject.WeatherData;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        if (weatherData instanceof WeatherData) {
            WeatherData newWeatherData = (WeatherData) weatherData;
            temperature = newWeatherData.getTemperature();
            humidity = newWeatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and "
                + humidity + "% humidity.");
    }

}
