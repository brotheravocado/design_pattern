
package deu.cse.design_pattern.ch06.multi;

public class LightOnCommand implements Command {
    private Light light;
    
  public void execute() {
      light.on();
  }

  public LightOnCommand(Light light) {
      this.light = light;
  }

}
