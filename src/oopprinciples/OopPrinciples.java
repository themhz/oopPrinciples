/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprinciples;

import oopprinciples.strategy.Animal;
import oopprinciples.strategy.Bird;
import oopprinciples.strategy.Dog;
import oopprinciples.strategy.Flys;
import oopprinciples.strategy.CantFly;


/**
 *
 * @author themhz
 */
public class OopPrinciples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnimalPlay();
    }

    public static void AnimalPlay() {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());

        // This allows dynamic changes for flyingType
        //sparky.setFlyingAbility(new ItFlys());

        //System.out.println("Dog: " + sparky.tryToFly());
    }

}
