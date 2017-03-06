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
public class ThirdPartyDisplay implements Observer,DisplayElement{
    
    private float temperature;
    private float humidity;
    private Subject weatherData;
    
    public ThirdPartyDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }    
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();        
    }

    @Override
    public void display() {
        System.out.println("Third party do crazy stuff : "+temperature*100+"F degrees and "+humidity*100+"% humidity");
    }
    
}
