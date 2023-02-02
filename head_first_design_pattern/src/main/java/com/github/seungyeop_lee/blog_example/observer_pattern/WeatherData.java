package com.github.seungyeop_lee.blog_example.observer_pattern;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {
    Set<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(temperature, humidity, pressure));
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
