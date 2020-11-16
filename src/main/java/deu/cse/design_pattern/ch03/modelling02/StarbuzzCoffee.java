/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch03.modelling02;

/**
 *
 * @author dbswl
 */
public class StarbuzzCoffee {
    public static void main(String args[]){
        Beverage b1 = new HouseBlend();
        System.out.println(b1.getDescription() + " $" + b1.cost());
        
        b1 = new Milk(b1);
        System.out.println(b1.getDescription() + " $" + b1.cost());
        
        b1 = new Mocha(b1);
        System.out.println(b1.getDescription() + " $" + b1.cost());
        
        b1 = new Mocha(b1);
        System.out.println(b1.getDescription() + " $" + b1.cost());
        
        Beverage b2 = new Mocha(
                        new Mocha(
                            new Milk(
                                new HouseBlend())));
        System.out.println(b2.getDescription() + " $"+b2.cost());
    }
}
