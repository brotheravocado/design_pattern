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
public class MenuTestDrive {
    
    public static void main(String args[]){
        
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU","Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of coursel");
        
        MenuComponent allMenus = new Menu("ALL MENU","All menus combined");
        
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);
        
         pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs, and toast",true,2.99));
         pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast","Pancakes with fried eggs, sausage",false,2.99));
         pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes","Pancakes made with fresh blueberries, "+ "and blueberry syrup",true,3.49));
         pancakeHouseMenu.add(new MenuItem("Waffles","Waffles, with you choice of blueberries or strawberries",true,3.59));
         
        dinnerMenu.add(new MenuItem("Vegetarian BLT","(Fakin) Bacon with lettuce & tomato on whole wheat" ,true,2.99)); 
        dinnerMenu.add(new MenuItem("BLT"," Bacon with lettuce & tomato on whole wheat",false,2.99));
        dinnerMenu.add(new MenuItem("Soup of the day","A bowl of the soup of the day, with a side of potato salad",false,3.29));
        dinnerMenu.add(new MenuItem("Hotdog","A hot dog, with saurkraut, relish, onions, topped with chees",false,3.05));
        dinnerMenu.add(new MenuItem("Steamed Veggies and Brown Rice","Steamed vegetables over brown rice",true,3.99));
        dinnerMenu.add(new MenuItem("Pasta","Spaghetti with Marinara Sauce and a slice of sourdough bread",true,3.89));
        dinnerMenu.add(dessertMenu);
        
        dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust, topped with vanilla icecream",true,1.59));
        dessertMenu.add(new MenuItem("Cheesecake","Creamy New York cheesecake, with a chocolate graham crust",true,1.99));
        
        dessertMenu.add(new MenuItem("Sorbet","A scoop of rasberry and a scoop of lime",true,1.89));
        cafeMenu.add(new MenuItem("Veggie Burfer and Air Fires","Veggie burger on a whole wheat bun, lettuce, tomato, and fries",true,3.99));
        cafeMenu.add(new MenuItem("Soup of the day","A cup of the soup of the day,with a side salad",false,3.69));
        cafeMenu.add(new MenuItem("Burrito","A large burrito, with whole printo beans, salsa, guacamole",true,4.29));
        
        Waitress waitress = new Waitress(allMenus);
        
        waitress.printVegetarianMenu();
        waitress.printMenu();
    }
}
