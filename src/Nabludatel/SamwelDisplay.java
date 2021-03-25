package Nabludatel;

import java.util.Observable;
import java.util.Observer;

public class SamwelDisplay implements Observer,DisplayElement {
    Observable observer;
    private float pressure;
    public SamwelDisplay(Observable observer){
        this.observer=observer;
        observer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData=(WeatherData)o;
            this.pressure=weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: "+pressure+" = pressure");
    }
}
