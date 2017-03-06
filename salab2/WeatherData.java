/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab2;

import java.util.ArrayList;

/**
 *
 * @author GOH
 */
public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData(){
        observers = new ArrayList();
    }
    
    public void registerObserver(Observer o)
    {
        observers.add(o);
    }
    
    public void removeObserver(Observer o)
    {
        int i =observers.indexOf(o);
        if(i>=0)
        {
            observers.remove(i);
        }
    }
    
    public void notifyObservers()
    {
        for(int i=0; i<observers.size(); i++)
        {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    
    public void measurementsChanged()
    {
        notifyObservers();
    }
    
    public void setMeasurements(float temperature,float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
    public void getTemperature(){
        System.out.println("Temperature : "+this.temperature);
    }
    
    public void getHumidity(){
        System.out.println("Humidity : "+this.humidity);
    }
    
    public void getPressure(){
        System.out.println("Pressure : "+this.pressure);
    }
    
}
