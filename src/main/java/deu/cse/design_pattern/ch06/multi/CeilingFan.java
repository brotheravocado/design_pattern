
package deu.cse.design_pattern.ch06.multi;

public class CeilingFan {
  private String location;

  public CeilingFan(String location) {
      this.location = location;
  }

  public void on() {
      System.out.println(location + " 천장 선풍기가 커졌습니다.");
  }

  public void off() {
      System.out.println(location + " 천장 선풍기가 꺼졌습니다.");
  }

}
