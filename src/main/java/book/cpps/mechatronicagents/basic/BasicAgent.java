/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.cpps.mechatronicagents.basic;

import jade.core.Agent;

/**
 *
 * @author Adersh
 */
public class BasicAgent extends Agent {
    
    @Override
    protected void setup() {
        System.out.println("Hello, I am an Agent! My name is " + getLocalName());
        addBehaviour(new MyOneShotBehaviour());
    }
    
    @Override
    protected void takeDown() {
        System.out.println("I am out. Bye!");
    }
}
