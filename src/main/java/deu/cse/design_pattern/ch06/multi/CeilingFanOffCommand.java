
package deu.cse.design_pattern.ch06.multi;

public class CeilingFanOffCommand implements Command {
  
    private CeilingFan fan ;
    public void execute() {
        fan.off();
  }

  public CeilingFanOffCommand(CeilingFan fan) {
      this.fan = fan;
  }
}
