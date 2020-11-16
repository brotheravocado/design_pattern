
package deu.cse.design_pattern.ch01.modelling03;

class RubberDuck extends Duck {
  public  RubberDuck() {
      flyBehavior = new FlyNoWay();
      quackBehavior = new MuteQuack();
  }

  public void display() {
      System.out.println("저는 고무 오리입니다.");
  }

}
