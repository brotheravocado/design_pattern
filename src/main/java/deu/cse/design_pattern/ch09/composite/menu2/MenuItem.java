/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch09.composite.menu2;

/**
 *
 * @author dbswl
 */
import java.util.Iterator;

public class MenuItem extends MenuComponent{
    
    private final String name;
    private String description;
    private boolean vegetarian;
    private double price;
    
    public MenuItem(String name, String description, boolean vegetarian, double price){
        
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
        
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public boolean isVegetarian(){
        return vegetarian;
    }
    public Iterator <MenuComponent> createIterator(){ // Leaf    노드 임을 의미
        return new NullIterator();
    }
    public void print(){
        System.out.print("    " +getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("        --" + getDescription());
    }
}
