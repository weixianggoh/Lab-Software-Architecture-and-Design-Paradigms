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
public class SAlab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimplePizzaFactory a =new SimplePizzaFactory();

        PizzaStore b = new PizzaStore(a);

        Pizza pizza1 = b.orderPizza("cheese");
        System.out.println("We ordered a " + pizza1.getName() + "\n");
        System.out.println(pizza1.toString());
        
        Pizza pizza2 = b.orderPizza("veggie");
        System.out.println("We ordered a " + pizza2.getName() + "\n");
        System.out.println(pizza2.toString());
    }
    
}
