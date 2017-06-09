/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab1_2;

/**
 *
 * @author GOH
 */
public class SAlab1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck mallard = new MallardDuck();
        
        mallard.performQuack();
        mallard.performFly();
        mallard.display();       
        
        FlyNoWay set_mallard_no_fly = new FlyNoWay();
        mallard.setFlyBehaviour(set_mallard_no_fly);
        mallard.performFly();
    }
    
}
