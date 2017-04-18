/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab5;

/**
 *
 * @author GOH
 */
public class SimplePizzaFactory {   
    
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza();
        }else if(type.equalsIgnoreCase("pepperoni")){
            pizza = new PepperoniPizza();
        }else if(type.equalsIgnoreCase("clam")){
            pizza = new ClamPizza();
        }else if(type.equalsIgnoreCase("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
