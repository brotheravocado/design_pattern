
package deu.cse.design_pattern.ch08.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CoffeeWithHook extends CaffeineBeverageWithHook {
  protected void brew() {
      System.out.println("필터를 통해서 커피를 우려내는 중");
  }

  protected void addCondiments() {
      System.out.println("우유와 설탕을 추가하는 중");
  }

  protected boolean customerWantsCondiments() {
      String answer = getUserInput();
      
      if(answer.toLowerCase().startsWith("y")){
          return true;
      }
      else{
          return false;
  }
  }
  
private String getUserInput(){
    String answer = null;
    
    System.out.println("커피에 우유와 설탕을 넣어 드릴까요? (y/n): ");
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      try{
          answer = in.readLine();
      }catch(IOException ioe){
          System.err.println(ioe);
      }
      if(answer == null){
          return "no";
      }
      return answer;
}
}
