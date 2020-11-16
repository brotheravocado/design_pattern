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

public class DinnerMenuIterator implements Iterator <MenuItem>{
    
    private final MenuItem[] items;
    private int position = 0;
    
    public DinnerMenuIterator(MenuItem[] items){
        this.items = items;
    }
    public MenuItem next(){
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }
    public boolean hasNext(){
        return !(position >= items.length || items[position] == null);
    }
}
