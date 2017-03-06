/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab2;

/**
 *
 * @author GOH
 */
public class SAlab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData); 
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4F);
        weatherData.setMeasurements(82, 70, 29.2F);
        weatherData.setMeasurements(78, 90, 29.2F);
        
        System.out.println("");
        System.out.println("show notification from all observer:");
        weatherData.notifyObservers();
        
        System.out.println("");
        System.out.println("show notification after remove all observer:");
        weatherData.removeObserver(forecastDisplay);
        weatherData.removeObserver(statisticsDisplay);
        weatherData.removeObserver(currentDisplay);
        weatherData.notifyObservers();
        
        ThirdPartyDisplay a = new ThirdPartyDisplay(weatherData);
        System.out.println("");
        System.out.println("show after adding third party and forecastDisplay:");
        weatherData.registerObserver(forecastDisplay);
        weatherData.notifyObservers();
        
        System.out.println("");
        System.out.println("show getTemperature():");
        weatherData.getTemperature();
        
        
    }
    
}
