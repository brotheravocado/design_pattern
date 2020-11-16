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

public class Waitress {
    
    private MenuComponent allMenus;
    
    public Waitress(MenuComponent allMenus){
        
        this.allMenus = allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }
    public void printVegetarianMenu(){
        Iterator <MenuComponent> iterator = allMenus.createIterator();
        
        System.out.println("\nVEGETARIAN MENU\n----");
        while(iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            try{
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch(UnsupportedOperationException e){
                
            }
        }
    }
}
