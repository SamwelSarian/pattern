package Nabludatel;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
        SamwelDisplay samwelDisplay=new SamwelDisplay(weatherData);
        HeatlIndexDisplay heatlIndexDisplay=new HeatlIndexDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80,65,40.4f);


    }
}
