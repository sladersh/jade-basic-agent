/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.cpps.mechatronicagents.basic;

import jade.core.behaviours.SimpleBehaviour;

/**
 *
 * @author Adersh
 */
public class MyOneShotBehaviour extends SimpleBehaviour {
    
    @Override
    public void action() {
        System.out.println("Executing something!");
    }
    
    @Override
    public boolean done() {
        System.out.println("This only executes once because this function returns true");
        return false;
    }
}
