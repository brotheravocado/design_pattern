
package deu.cse.design_pattern.ch04.modelling03;

import java.util.ArrayList;
import java.util.List;


public abstract class Pizza { // pizza 추상 클래스
    
  protected List<String>toppings = new ArrayList<String>();
  protected String name;
  protected String dough;
  protected String sauce;

  public void prepare() { // Pizza prepare 메소드 출력
      System.out.println("Preparing "+ name);
      System.out.println("Tossing dough...");
      System.out.println("Adding sauce... ");
      System.out.println("Adding toppings: ");
      toppings.forEach(topping->{
          System.out.println(" "+topping);
      });
  }

  public void bake() { 
      System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
      System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
      System.out.println("Place pizza in official PizzaStore box");
  }
  public String getName(){ 
      return name;
  }
  
 
  public String toString(){ // 
      StringBuilder display = new StringBuilder();
      display.append("---- ").append(name).append("----\n"); // 이름 추가
      display.append(dough).append("\n"); // 도우 추가
      display.append(sauce).append("\n"); // 소스 추가
      toppings.forEach(topping->{ // 있는 toping 추가
          display.append(topping).append("\n");
      });
      return display.toString();
  }

}
