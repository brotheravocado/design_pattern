
package deu.cse.design_pattern.ch02.modelling04;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement {
    private float temperature;
    private float humidity;
    
  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    String propertyName = evt.getPropertyName();
    if(propertyName != null && !propertyName.equals("") 
            && "weather data changed".equals(propertyName)){
        WeatherData.Values newOne = (WeatherData.Values) evt.getNewValue();
        this.temperature = newOne.getTemperature();
        this.humidity = newOne.getHumidity();
        display();
    }
  }
  @Override
  public void display() {
      System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
  }

}
