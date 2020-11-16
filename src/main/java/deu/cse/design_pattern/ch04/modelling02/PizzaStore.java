
package deu.cse.design_pattern.ch04.modelling02;

class PizzaStore {
    
  private SimplePizzaFactory factory;
    
  public PizzaStore(SimplePizzaFactory factory) {
      this.factory = factory;
  }

  public Pizza orderPizza(String type) {
      Pizza pizza;
      
      pizza = factory.createPizza(type);
      
      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
      return pizza;
  }

}
