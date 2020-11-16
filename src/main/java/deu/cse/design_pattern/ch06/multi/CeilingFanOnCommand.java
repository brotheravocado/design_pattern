
package deu.cse.design_pattern.ch06.multi;

public class CeilingFanOnCommand implements Command {
  
    private CeilingFan fan;
    public void execute() {
      fan.off();
  }

  public CeilingFanOnCommand(CeilingFan fan) {
      this.fan = fan;
  }
}
