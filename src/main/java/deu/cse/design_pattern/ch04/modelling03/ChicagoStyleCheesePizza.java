
package deu.cse.design_pattern.ch04.modelling03;

public class ChicagoStyleCheesePizza extends Pizza { // Pizza 클래스 상속
  public void cut() {
      System.out.println("Cutting the pizza into square slices");
  }

  public  ChicagoStyleCheesePizza() {
      name = "Chicago Style Deep Dish Cheese Pizza"; // ChicagoStypleCheesePizza에 맞게 이름,도우,소스 정보 저장
      dough = "Extra Thick Crust Dough";
      sauce = "Plum Tomato Sauce";
      
      toppings.add("Sharedded Mozzarella Cheese"); // Pizza 토핑 추가
             
  }

}
