/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch08.hook;

/**
 *
 * @author dbswl
 */
public class BeverageTestDriver {
    public static void main(String[]args){
        CaffeineBeverageWithHook myTea = new TeaWithHook();
        
        myTea.prepareRecipe();
        
        System.out.println("====================");
        CaffeineBeverageWithHook myCoffee = new CoffeeWithHook();
        myCoffee.prepareRecipe();
    }
}
