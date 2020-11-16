
package deu.cse.design_pattern.ch03.modelling02;

public class Milk extends CondimentDecorator {
    
  public Milk(Beverage beverage) {
      this.beverage = beverage;
  }

  public String getDescription() {
      return beverage.getDescription() + ", Milk";
  }

  public double cost() {
      return .10 + beverage.cost();
  }

}
