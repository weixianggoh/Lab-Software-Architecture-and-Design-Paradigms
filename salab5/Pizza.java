/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab5;

import java.util.ArrayList;

/**
 *
 * @author GOH
 */
abstract public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
//        ArrayList out = new ArrayList();
//        out.add("---- " + name + " ----\n");
//        out.add(dough + "\n");
//        out.add(sauce + "\n");
//        for (int i = 0; i < toppings.size(); i++) {
//            out.add(toppings.get(i) + "\n");
//        }
//        return out.toString();        
        
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append((String )toppings.get(i) + "\n");
        }
        return display.toString();
    }
}
