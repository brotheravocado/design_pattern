
package deu.cse.design_pattern.ch08.hook;

public abstract class CaffeineBeverageWithHook {
  public final void prepareRecipe() {
      boilWater();
      brew();
      pourInCup();
      if(customerWantsCondiments()){
          addCondiments();
      }
  }
      

  protected abstract void brew();

  protected abstract void addCondiments();
  
  private void boilWater(){
      System.out.println("물 끓이는 중");
  }
  public void pourInCup() {
      System.out.println("컵에 따르는 중");
  }

  protected boolean customerWantsCondiments() {
      return true;
  }

}
