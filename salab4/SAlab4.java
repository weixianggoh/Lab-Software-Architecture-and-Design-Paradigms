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
public class SAlab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription()+" RM"+beverage1.cost());
        
        beverage1.setSize("small");
        System.out.println(beverage1.getDescription()+" RM"+beverage1.cost());
        
        beverage1.setSize("large");
        System.out.println(beverage1.getDescription()+" RM"+beverage1.cost());
        
        beverage1.setSize("medium");
        System.out.println(beverage1.getDescription()+" RM"+beverage1.cost());
        
        System.out.println("");
        Beverage beverage2 = new HouseBlend();
        System.out.println(beverage2.getDescription()+" RM"+beverage2.cost());
        
        
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+" RM"+beverage2.cost());
        
            
        beverage2.setSize("large");
        System.out.println(beverage2.getDescription()+" RM"+beverage2.cost());

    }
    
}
