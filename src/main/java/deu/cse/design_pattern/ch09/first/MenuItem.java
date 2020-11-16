/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch09.first;

/**
 *
 * @author dbswl
 */
public class MenuItem {
    private final String name;
    private final String desciption;
    private final boolean vegetarian;
    private final double price;
    
    public MenuItem(String name, String desciption,boolean vegetarian, double price ){
        this.name = name;
        this.desciption = desciption;
        this.vegetarian = vegetarian;
        this.price = price;       
    }
    
    public String getName(){
        return name;
    }
    public String getDescription(){
        return desciption;
    }
    public double getPrice(){
        return price;
    }
    public boolean isVegetarian(){
        return vegetarian;
    }
    
}
