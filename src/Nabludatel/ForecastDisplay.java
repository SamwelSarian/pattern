package Nabludatel;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement{

    private float currentPressure=29.9f;
    private float lastPressure;
    public ForecastDisplay(Observable observable){
        observable.addObserver(this);
    }
    public void update(Observable observable,Object arg) {
        if (observable instanceof WeatherData){
            WeatherData weatherData=(WeatherData)observable;
            lastPressure=currentPressure;
            currentPressure=weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("//////datas/////"+currentPressure+"  "+lastPressure);
    }
}
