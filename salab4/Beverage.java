/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab4;

/**
 *
 * @author GOH
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    
    public String getDescription(){
        return this.description;
    }
    
    public abstract double cost();
    
    public abstract void setSize(String size);
    
    public abstract String getSize();
}
