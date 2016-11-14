package headFirst.observer.subject;

import headFirst.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public class WeatherData implements Subject {
    private double temperature;
    private double humidity;
    private double pressure;

    private List<Observer> observers;

    // once the weather changes, this method will be called.
    public void measurementsChanged() {
        notifyObservers();
    }

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
