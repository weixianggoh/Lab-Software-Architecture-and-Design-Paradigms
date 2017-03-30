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
public class Mocha extends CondimentDecorator {
    Beverage bevearage;
    String size="MEDIUM";
    double sizeprice;

    public Mocha(Beverage bevearage) {
        this.bevearage = bevearage;
    }
    
    @Override
    public String getDescription() {
        return this.getSize()+" "+this.bevearage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        double out;
        double price=10;
        out=price+this.sizeprice+bevearage.cost();
        return out;
    }

    @Override
    public void setSize(String size) {
        switch (size) {
            case "large":  
                this.size = "LARGE";
                this.sizeprice=500;
                break;
            case "small":  
                this.size = "SMALL";
                this.sizeprice=100;
                break;
            default: 
                this.size = "MEDIUM";
                this.sizeprice=0;
                break;
        }        
    }

    @Override
    public String getSize() {
        return this.size;
    }
    
    
}
