/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab6;

/**
 *
 * @author GOH
 */
public class SAlab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChocolateBoiler a = new ChocolateBoiler();
        ChocolateBoiler d = new ChocolateBoiler();
        System.out.println("Start make chocalate");
        System.out.println("Check empty status : "+a.isEmpty());
        System.out.println("Check boiling status : "+a.isBoiled());
        System.out.println("Check empty status : "+d.isEmpty());
        System.out.println("Check boiling status : "+d.isBoiled());
        System.out.println("");
        
        System.out.println("start filling !!!");
        a.fill();
        //d.fill();
        System.out.println("Check empty status : "+a.isEmpty());
        System.out.println("Check boiling status : "+a.isBoiled());
        System.out.println("Check empty status : "+d.isEmpty());
        System.out.println("Check boiling status : "+d.isBoiled());
        System.out.println("");
        
        System.out.println("start boiling");
        a.boil();
        //d.boil();
        System.out.println("Check empty status : "+a.isEmpty());
        System.out.println("Check boiling status : "+a.isBoiled());
        System.out.println("Check empty status : "+d.isEmpty());
        System.out.println("Check boiling status : "+d.isBoiled());
        System.out.println("");
        
        System.out.println("start drain !!!");
        a.drain();
        //d.drain();
        System.out.println("Check empty status : "+a.isEmpty());
        System.out.println("Check boiling status : "+a.isBoiled());
        System.out.println("Check empty status : "+d.isEmpty());
        System.out.println("Check boiling status : "+d.isBoiled());
        System.out.println("");
        
        
        Singeton_ChocolateBoiler b = Singeton_ChocolateBoiler.getInstance();
        System.out.println("");
        Singeton_ChocolateBoiler c = Singeton_ChocolateBoiler.getInstance();
        System.out.println("");
        System.out.println("Start make chocalate");
        System.out.println("Check empty status for b: "+b.isEmpty());
        System.out.println("Check boiling status for b: "+b.isBoiled());
        System.out.println("Check empty status for c: "+c.isEmpty());
        System.out.println("Check boiling status for c: "+c.isBoiled());
        System.out.println("");
        
        System.out.println("start filling !!!");
        b.fill();
        c.fill();
        System.out.println("Check empty status for b: "+b.isEmpty());
        System.out.println("Check boiling status for b: "+b.isBoiled());
        System.out.println("Check empty status for c: "+c.isEmpty());
        System.out.println("Check boiling status for c: "+c.isBoiled());
        System.out.println("");
        
        System.out.println("start boiling");
        b.boil();
        //c.boil();
        System.out.println("Check empty status for b: "+b.isEmpty());
        System.out.println("Check boiling status for b: "+b.isBoiled());
        System.out.println("Check empty status for c: "+c.isEmpty());
        System.out.println("Check boiling status for c: "+c.isBoiled());
        System.out.println("");
        
        System.out.println("start drain !!!");
        b.drain();
        //c.drain();
        System.out.println("Check empty status for b: "+b.isEmpty());
        System.out.println("Check boiling status for b: "+b.isBoiled());
        System.out.println("Check empty status for c: "+c.isEmpty());
        System.out.println("Check boiling status for c: "+c.isBoiled());  
        System.out.println("");
        
        
        System.out.println("conclusion :: A,B,C,D are created.\nA and D can have difference value in same time.\nBut in Singeton,B and C share same value");
    }
    
}
