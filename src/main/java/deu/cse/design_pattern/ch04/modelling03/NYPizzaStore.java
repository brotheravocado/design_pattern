
package deu.cse.design_pattern.ch04.modelling03;

class NYPizzaStore extends PizzaStore {
  public Pizza createPizza(String type) {
      if(type.equals("cheese")){ // 만약 피자가 cheese라면 
          return new NYStyleCheesePizza(); // 뉴욕스타일 치즈피자 생성
      }
      else if(type.equals("veggie")){ // 만약 피자가 veggie라면
          return new NYStyleVeggiePizza(); // 뉴욕스타일 배지피자 생성
      }
      else{
          return null;
      }
  }

}
