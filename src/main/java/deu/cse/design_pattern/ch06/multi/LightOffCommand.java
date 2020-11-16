
package deu.cse.design_pattern.ch06.multi;

public class LightOffCommand implements Command {

    private Light light ;
    public void execute() {
        light.off();
  }


  public LightOffCommand(Light light) {
      this.light = light;
  }

}
