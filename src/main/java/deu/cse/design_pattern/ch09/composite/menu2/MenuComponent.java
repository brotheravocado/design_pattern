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

public abstract class MenuComponent {
    
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
}
    public String getDescription(){
        throw new UnsupportedOperationException();
}
    public double getPrice(){
        throw new UnsupportedOperationException();
}
    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
}
    public abstract Iterator <MenuComponent> createIterator(); // 추가된 추상 메소드
    
    public void print(){
        throw new UnsupportedOperationException();
    }
}