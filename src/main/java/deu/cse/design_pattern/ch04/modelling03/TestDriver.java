/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch04.modelling03;

/**
 *
 * @author dbswl
 */
public class TestDriver {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordred a "+ pizza.getName() + "\n");
        
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordred a "+ pizza.getName() + "\n");
        
        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordred a "+ pizza.getName() + "\n");
        
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordred a "+ pizza.getName() + "\n");
    }
}
