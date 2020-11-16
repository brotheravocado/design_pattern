/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch05.chocolate03;

/**
 *
 * @author dbswl
 */
public class ChocolateController {
    public static void main(String args[]){
        new Thread(()->{ //unique instance 값 = 0
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
            System.out.println("객체 정보: " + boiler);
            boiler.fill();
            boiler.boil();
            boiler.drain();
    }).start();
        // 500msec 정지시 초콜렛 보일러 객체 두개가 생성됨
        // 1000msec 정지시에는 하나만 생성됨
        try{
            Thread.sleep(500);
        }catch(InterruptedException ex){
            System.out.println(ex);
        }
        
        new Thread(()->{
            ChocolateBoiler boiler = ChocolateBoiler.getInstance();
            System.out.println("객체 정보: " + boiler);
            boiler.fill();
            boiler.boil();
            boiler.drain();
        }).start();
    }
    
}
