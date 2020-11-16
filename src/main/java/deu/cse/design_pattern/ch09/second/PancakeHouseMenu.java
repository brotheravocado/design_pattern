/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch09.second;

/**
 *
 * @author dbswl
 */
import deu.cse.design_pattern.ch09.first.MenuItem;
import java.util.ArrayList;

public class PancakeHouseMenu {
    private final ArrayList<MenuItem> menuitems;
    
    public PancakeHouseMenu(){
        menuitems = new ArrayList<>();
        
        addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs, and toast",true,2.99); 
        addItem("Regular Pancake Breakfast","Pancakes with fried eggs, sausaget",false,2.99);
        addItem("Blueberry Pancakes","Pancakes made with fresh blueberries, "+ "and blueberry syrup",true,3.49);
        addItem("Waffles","Waffles, with you choice of blueberries or strawberries",true,3.59);
    }
    public final void addItem(String name, String description,boolean vegetarian, double price){
        
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuitems.add(menuItem);
    
    }
    public Iterator <MenuItem> createIterator(){
        return new PancakeHouseMenuIterator(menuitems);
    }
}
