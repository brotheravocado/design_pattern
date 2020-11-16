
package deu.cse.design_pattern.ch04.modelling03;

public class NYStyleVeggiePizza extends Pizza { // Pizza 클래스 상속
  public  NYStyleVeggiePizza() {
      name = "NY Style Veggie Pizza"; // NYStyleVeggiePizza에 맞게 이름,도우,소스 정보 저장
      dough = "Thin Crust Dough";
      sauce = "Marinara Sauce";
      
      toppings.add("Grated Reggiano Cheese"); // Pizza에 맞게 토핑 추가
      toppings.add("Garlic");
      toppings.add("Onion");
      toppings.add("Mushrooms");
      toppings.add("Red Pepper");
              
  }

}
