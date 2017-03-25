/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author GOH
 */
public class SwingObserverExample {
    JFrame frame;
    
    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    
    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it???");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        
    }
    
    class AngelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Dont do it, you might regret");
        }
    }

    class DevilListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Come on, just do it!");
        }
    }    
}
