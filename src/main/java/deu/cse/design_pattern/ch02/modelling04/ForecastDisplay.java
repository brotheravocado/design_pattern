
package deu.cse.design_pattern.ch02.modelling04;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ForecastDisplay implements DisplayElement, PropertyChangeListener {
  
  private float currentPressure = 29.92f;
  private float lastPressure;

  @Override
  public void display() {
      System.out.print("Forecatst: ");
      if(currentPressure > lastPressure){
          System.out.println("Improving weather on the way!");
      }
      else if(currentPressure == lastPressure){
          System.out.println("More of the same");
      }
      else if(currentPressure < lastPressure){
          System.out.println("Watch out for cooler, rainy weather");
      }
  }
  
  @Override
  public  void propertyChange(PropertyChangeEvent evt) {
      String propertyName = evt.getPropertyName();
    if(propertyName != null && !propertyName.equals("") 
            && "weather data changed".equals(propertyName)){
        WeatherData.Values newOne = (WeatherData.Values) evt.getNewValue();
        lastPressure = currentPressure;
        currentPressure = newOne.getPressure();
        display();
  }

}
}
