
package deu.cse.design_pattern.ch02.modelling04;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherData  {
  
 private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
  private float temperature;
  private float humidity;
  private float pressure;
  
  public void addPropertyListener(PropertyChangeListener listener) {
      this.pcs.addPropertyChangeListener(listener);
  }

  public void removePropertyChangeListener(PropertyChangeListener listener) {
      this.pcs.removePropertyChangeListener(listener);
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
      Values oldOne = new Values(this.temperature, this.humidity, this.pressure);
      this.temperature = temperature;
      this.humidity = humidity;
      this.pressure = pressure;
      Values newOne = new Values(this.temperature, this.humidity, this.pressure);
      this.pcs.firePropertyChange("weather data changed", oldOne,newOne);
  }

  public float getpressure() {
      return pressure;
  }
  public float getHumidity(){
      return humidity;
  }
  public float getTemperature(){
      return temperature;
  }
  
  public class Values {
  private float temperature;
  private float humidity;
  private float pressure;
  
  public Values(float temperature, float humidity, float pressure){
      this.temperature = temperature;
      this.humidity = humidity;
      this.pressure = pressure;
  }
  public float getTemperature(){
      return temperature;
  }
  public float getHumidity(){
      return humidity;
  }
  public float getPressure(){
      return pressure;
  }
}

}
