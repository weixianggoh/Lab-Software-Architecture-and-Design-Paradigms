/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab1;

/**
 *
 * @author GOH
 */
public class Duck implements DuckInterface, FlyBehaviour{

    @Override
    public void swimming() {
        System.out.println("All duck float, even decoy");
    }

    @Override
    public void display() {
        System.out.println("I am a duck");
    }

    @Override
    public void performQuack() {
        System.out.println("I can quack");
    }

    @Override
    public void performFly() {
        System.out.println("I can fly");
    }

    @Override
    public void setFlyBehaviour() {
        
    }

    @Override
    public void setQuackBehaviour() {
        
    }

    @Override
    public void FlyWithWings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void FlyNoWay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
