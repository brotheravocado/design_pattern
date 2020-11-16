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
import java.util.ArrayList;
import deu.cse.design_pattern.ch09.first.MenuItem;

public class PancakeHouseMenuIterator implements Iterator<MenuItem>{
    
    private final ArrayList<MenuItem> items;
    private int position = 0;
    
    public PancakeHouseMenuIterator(ArrayList<MenuItem> items){
        this.items = items;
    }
    public MenuItem next(){
        MenuItem item = items.get(position);
        position += 1;
        return item;
    }
    public boolean hasNext(){
        return position < items.size();
    }
    
}
