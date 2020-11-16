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
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;
    
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
        System.out.println("ChocolateBoiler 생성자가 실행됩니다.");          
    }
    /* 싱글턴 패턴을 적용하여 초콜렛 보일러의 유일한 객체를 반환하는 메소드*/
    public static ChocolateBoiler getInstance(){
        if(uniqueInstance == null){ // 동시에 null을 확인하게 되면 null로 확인될 수 있음
            try{
                System.out.println("\n1초 간 지연됩니다.");
                Thread.sleep(1000); // 1초 뒤 초콜릿 보일러 객체 반환
            } catch(InterruptedException ex){
                System.out.println(ex);
                }
            System.out.println("\n1. 초콜렛 보일러의 유일한 객체를 생성");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("2. 초콜렛 보일러 객체를 반환");
        return uniqueInstance;
    }
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("보일러가 비어 있으므로 초콜렛과 우유를 채웁니다.");
        }
    }
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            System.out.println("차있으며 끓고 있으므로 이제 비웁니다.");
        }
    }
    public void boil(){
        if(!isEmpty() && isBoiled()){
            boiled = true;
            System.out.println("보일러에 초콜렛과 우유가 있으므로 끓입니다.");
        }
    }
    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
}
