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
public class MenuTestDrive {
    
    public static void main(String args[]){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        
        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
        
        waitress.printMenu();
    }
    
}
