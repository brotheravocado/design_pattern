
package deu.cse.design_pattern.ch02.modelling05;

import java.util.concurrent.Flow;

public class CurrentConditionsDisplay implements Flow.Subscriber<WeatherData.Values>, DisplayElement {
  
    private Flow.Subscription subscription = null;
  private float temperature;
  private float humidity;
  
  @Override
  public void display() {
      System.out.println("Current conditions : " + temperature + "F degrees and "+ humidity + "% humidity");
  }
  
  @Override
  public void onSubscribe(Flow.Subscription subscription) {
      this.subscription = subscription;
      subscription.request(1);
  }
 @Override
  public  void onNext(WeatherData.Values item) {
      this.temperature = item.getTemperature();
      this.humidity = item.getHumidity();
      display();
      this.subscription.request(1);
  }

  @Override
  public void onError(Throwable throwable) {
      throw new UnsupportedOperationException("Not supported yet");
  }

  @Override
  public void onComplete() {
      throw new UnsupportedOperationException("Not supported yet");      
  }

}
