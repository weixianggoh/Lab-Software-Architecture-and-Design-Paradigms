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
public class StatisticsDisplay implements Observer, DisplayElement{
    
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings; 
    private Subject weatherData;    
    
    public StatisticsDisplay(Subject weatherData) { 
        this.weatherData = weatherData; weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tempSum += temp; numReadings++;
        if (temp > maxTemp) { 
            maxTemp = temp;
        }
        if (temp < minTemp) { 
            minTemp = temp;
        }
        display();    
    }

    @Override
    public void display() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
    
}
