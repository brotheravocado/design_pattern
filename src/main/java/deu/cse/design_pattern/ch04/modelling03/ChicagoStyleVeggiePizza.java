
package deu.cse.design_pattern.ch04.modelling03;

public class ChicagoStyleVeggiePizza extends Pizza { // Pizza 클래스 상속
  public ChicagoStyleVeggiePizza() { 
      name = "Chicago Deep Dish Veggie Pizza"; // ChicagoStyleVeggiePizza에 맞게 이름,도우,소스 정보 저장
      dough = "Extra Thick Crust Dough";
      sauce = "Plum Tomato Sauce";
      
      toppings.add("Sharedded Mozzarella Cheese"); // Pizza의 토핑 추가
      toppings.add("Black Olives");
      toppings.add("Spinach");
      toppings.add("Eggplant");
  }

  public void cut() {
      System.out.println("Cutting the pizza into square slices");
  }

}
