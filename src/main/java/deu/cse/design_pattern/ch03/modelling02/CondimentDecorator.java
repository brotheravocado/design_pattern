
package deu.cse.design_pattern.ch03.modelling02;

public abstract class CondimentDecorator extends Beverage {
  protected Beverage beverage;

  @Override
  public abstract String getDescription();

}
