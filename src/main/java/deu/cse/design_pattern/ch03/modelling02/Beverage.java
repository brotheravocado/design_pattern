
package deu.cse.design_pattern.ch03.modelling02;

public abstract class Beverage {
  protected String description = "Unknown Beverage";

  public String getDescription() {
      return description;
  }

  public abstract double cost();

}
