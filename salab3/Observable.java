/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab3;

/**
 *
 * @author GOH
 */
public class Observable {
    
    boolean changed;
    
    public void setChanged(){
        changed = true;
    }
    
    public void notifyObservers()
    {
        if(changed){
            
        }
    }
    
    
    
    
}
