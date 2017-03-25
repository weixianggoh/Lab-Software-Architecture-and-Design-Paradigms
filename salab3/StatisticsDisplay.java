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
public class StatisticsDisplay implements Observer, DisplayElement{
    
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings; 
    Observable observable; 
    
    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }    

    @Override
    public void display() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherdata = (WeatherData)o;            
            this.tempSum+=weatherdata.getTemperature();
            this.numReadings++;
            
            if(weatherdata.getTemperature()>this.maxTemp)
            {
                this.maxTemp=weatherdata.getTemperature();
            }
            if(weatherdata.getTemperature()<this.minTemp)
            {
                this.minTemp = weatherdata.getTemperature();
            }
            display();
        }
    }

    
    
    
}

