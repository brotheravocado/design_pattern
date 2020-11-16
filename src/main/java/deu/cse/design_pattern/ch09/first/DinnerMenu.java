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
public class DinnerMenu {
    
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems;
    
    public DinnerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
            
       addItem("Vegetarian BLT","(Fakin) Bacon with lettuce & tomato on whole wheat" ,true,2.99); 
        addItem("BLT"," Bacon with lettuce & tomato on whole wheat",false,2.99);
        addItem("Soup of the day","Soup of the day, with a side of potato salad",false,3.29);
        addItem("Hotdog","A hot dog, with saurkraut, relish, onions, topped with chees",false,3.05);
        addItem("Steamed Veggies and Brown Rice","Steamed vegetables over brown rice",true,3.99);
        addItem("Pasta","Spaghetti with Marinara Sauce and a slice of sourdough bread",true,3.89);
        
    }
    
    private final void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("Sorry, menu is full! Can't add item to menu");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }
    
    public MenuItem[] getMenuItems(){
        return menuItems.clone();
    }
}
