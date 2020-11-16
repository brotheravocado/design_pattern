
package deu.cse.design_pattern.ch04.modelling03;

public abstract class PizzaStore {
  public abstract Pizza createPizza(String type);
 
  public Pizza orderPizza(String type) { 
// 팩토리 메소드를 사용하여 피자 객체를 만들고 최종적으로 박스에 담을 때까지의 과정을 기술
      Pizza pizza = createPizza(type); // 실제로 생성 되는 구상 객체가 무엇인지 알수 없게 한다.
      System.out.println("--- Making a "+ pizza.getName()+ "---");
      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
      return pizza;
  }

}
