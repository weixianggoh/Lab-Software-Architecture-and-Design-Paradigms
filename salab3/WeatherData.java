/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab3;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author GOH
 */
public class WeatherData extends Observable{
    
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData(){
        
    }
    
    public void measurementsChanged()
    {
        setChanged();
        notifyObservers();
    }
    
    public void setMeasurements(float temperature,float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
//    public void getTemperature(){
//        System.out.println("Temperature : "+this.temperature);
//    }
//    
//    public void getHumidity(){
//        System.out.println("Humidity : "+this.humidity);
//    }
//    
//    public void getPressure(){
//        System.out.println("Pressure : "+this.pressure);
//    }
    
    public float getTemperature(){
        return this.temperature;
    }
    
    public float getHumidity(){
        return this.humidity;
    }
    
    public float getPressure(){
        return this.pressure;
    }
    
}
