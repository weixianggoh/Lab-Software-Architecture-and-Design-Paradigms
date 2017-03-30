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
public class HouseBlend extends Beverage{
    String size="MEDIUM";
    double sizeprice;

    public HouseBlend() {
        description = this.getSize()+" House Blend Coffee";
    }
    
    
    @Override
    public double cost() {
        return 10.89+this.sizeprice;
    }

    @Override
    public void setSize(String size) {
        switch (size) {
            case "large":  
                this.size="LARGE";
                this.sizeprice=500;
                this.description= this.getSize()+" House Blend Coffee";
                break;
            case "small":  
                this.size="SMALL";
                this.sizeprice=100;
                this.description= this.getSize()+" House Blend Coffee";
                break;
            default: 
                this.size="MEDIUM";
                this.sizeprice=0;
                this.description= this.getSize()+" House Blend Coffee";
                break;
        }        
    }

    @Override
    public String getSize() {
        return this.size;
    }
    
}
