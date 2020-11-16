
package deu.cse.design_pattern.ch06.multi;
import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
  public static final int MAX_COMMANDS = 7;
  private List<Command> onCommands = new ArrayList<>();
  private List<Command> offCommands = new ArrayList<>();
  private Command undoCommand;
  
  public RemoteControl() {
      Command noCommand = new NoCommand();
      for(int i = 0; i < MAX_COMMANDS; i++){
          onCommands.add(i, noCommand);
          offCommands.add(i, noCommand);
      }
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
      onCommands.set(slot, onCommand);
      offCommands.set(slot,offCommand);
  }

  public void onButtonWasPushed(int slot) {
      onCommands.get(slot).execute();
  }

  public void offButtonWasPushed(int slot) {
      offCommands.get(slot).execute();
  }

  public String toString() {
      StringBuilder buf = new StringBuilder();
      
      buf.append("\n---------Remote Control -----------\n");
      for(int i = 0; i < onCommands.size(); i++){
          buf.append("[slot ").append(i).append("] ");
          buf.append(onCommands.get(i).getClass().getName()).append("  ");
          buf.append(offCommands.get(i).getClass().getName()).append("\n");
          
      }
      return buf.toString();
  }

  

}
