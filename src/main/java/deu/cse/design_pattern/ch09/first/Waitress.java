/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch09.first;

/**
 *
 * @author dbswl
 */

import java.util.List;

public class Waitress {
    private final PancakeHouseMenu pancakeHouseMenu;
    private final DinnerMenu dinnerMenu;
            
            public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu){
                this.pancakeHouseMenu = pancakeHouseMenu;
                this.dinnerMenu = dinnerMenu;
            }
            public void printMenu(){
                List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
                System.out.println("메뉴\n-----\n아침 메뉴");
                for(int i =0; i <breakfastItems.size(); i++){
                    MenuItem m = breakfastItems.get(i);
                    printMenuItem(m);
                }
                System.out.println("\n점심 메뉴");
                MenuItem[] lunchItems = dinnerMenu.getMenuItems();
                for(int i =0; i <lunchItems.length; i++){
                    MenuItem m = lunchItems[i];
                    printMenuItem(m);
                }
            }
            public void printMenuItem(MenuItem menuItem){
                System.out.print(menuItem.getName() + ", ");
                System.out.print(menuItem.getPrice()+" -- ");
                System.out.println(menuItem.getDescription());
            }
            
}
