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
import java.util.Stack;

public class CompositeIterator implements Iterator <MenuComponent>{
    
    private final Stack <Iterator<MenuComponent>> stack = new Stack<>();
    
    public CompositeIterator(Iterator <MenuComponent> iterator){
        stack.push(iterator);
    }
    
    public MenuComponent next(){
        if(hasNext()){
            Iterator <MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            stack.push(component.createIterator());
            return component;
        }else{
            return null;
        }
    }
    public boolean hasNext(){
        
        if(stack.empty()){
            return false;
        }else{
            Iterator <MenuComponent> iterator = stack.peek();
            if(iterator.hasNext()){
                stack.pop();
                return hasNext();
            }
            else{
                return true;
            }
        }
        
    }
    
}
