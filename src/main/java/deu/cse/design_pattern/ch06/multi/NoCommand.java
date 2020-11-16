
package deu.cse.design_pattern.ch06.multi;

public class NoCommand implements Command {
  public void execute() {
      System.out.println("아무 것도 실행되지 않습니다.");
  }

}
