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

public class NullIterator implements Iterator <MenuComponent>{
    
    public MenuComponent next(){
        return null;
    }
    public boolean hasNext(){
        return false;
    }
    
}
