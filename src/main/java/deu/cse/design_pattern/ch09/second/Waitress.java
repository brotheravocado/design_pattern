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

public class Waitress {
    private final PancakeHouseMenu pancakeHouseMenu;
    private final DinnerMenu dinnerMenu;
    
    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu){
                this.pancakeHouseMenu = pancakeHouseMenu;
                this.dinnerMenu = dinnerMenu;
            }
public void printMenu(){
                Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
                Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
                
                System.out.println("메뉴\n-----\n아침 메뉴");
                printMenu(pancakeIterator);
                System.out.println("\n점심 메뉴");
                printMenu(dinnerIterator);
            }
            public void printMenu(Iterator<MenuItem> iterator){
                while(iterator.hasNext()){
                MenuItem menuItem = iterator.next();
                System.out.print(menuItem.getName() + ", ");
                System.out.print(menuItem.getPrice()+" -- ");
                System.out.println(menuItem.getDescription());
                }
                
            }            
}
