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
public class Espresso extends Beverage{
    String size="MEDIUM";
    double sizeprice;
    
    public Espresso() {
        description = this.getSize()+" Espresso";
    }

    
    @Override
    public double cost() {
        return 3.6+this.sizeprice;
    }

    @Override
    public void setSize(String size) {
        switch (size) {
            case "large":  
                this.size="LARGE";
                this.sizeprice=500;
                this.description= this.getSize()+" Espresso";
                break;
            case "small":  
                this.size="SMALL";
                this.sizeprice=100;
                this.description= this.getSize()+" Espresso";
                break;
            default: 
                this.size="MEDIUM";
                this.sizeprice=0;
                this.description= this.getSize()+" Espresso";
                break;
        }        
    }

    @Override
    public String getSize() {
        return this.size;
    }
    
}
