/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch09.composite.menu2;

import java.util.Iterator;
import java.util.ArrayList;


/**
 *
 * @author dbswl
 */
public class Menu extends MenuComponent{
    
    
    private Iterator <MenuComponent> iterator = null;
    private final ArrayList <MenuComponent> menuComponents = new ArrayList<>();
    private final String name;
    private final String description;
    
    
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
        public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i){
        return menuComponents.get(i);  
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
        public Iterator<MenuComponent> createIterator(){

        return new NullIterator();
    }

    public void print(){
        System.out.print("\n"+getName());
        System.out.println(", "+ getDescription());
        System.out.println("----------------------------");
        
        Iterator <MenuComponent> it = menuComponents.iterator();
        while(it.hasNext()){
            MenuComponent menuComponent = it.next();
            menuComponent.print();
        }
    }
    
}
