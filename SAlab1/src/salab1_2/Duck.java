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
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    
    public Duck(){
        
    }
    
    public abstract void display();
    
    public void performFly(){
        flyBehaviour.fly();
    }
    
    public void performQuack(){
        quackBehaviour.quack();
    }
    
    public void swim(){
        System.out.println("All duck float even decoy");
    }
    
    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }
    
    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }    
    
    
}
