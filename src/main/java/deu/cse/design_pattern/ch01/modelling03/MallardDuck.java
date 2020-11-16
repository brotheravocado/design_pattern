
package deu.cse.design_pattern.ch01.modelling03;
//MallardDuck 클래스
class MallardDuck extends Duck {
  public MallardDuck() {
      flyBehavior = new FlyWithWings();
      quackBehavior = new Quack();
  }

  public void display() {
      System.out.println("저는 물오리입니다.");
  }

}
