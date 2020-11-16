
package deu.cse.design_pattern.ch02.modelling05;

import java.util.concurrent.Flow;

class ForecastDisplay implements DisplayElement, Flow.Subscriber<WeatherData.Values> {
  private Flow.Subscription  subscription = null;
  private float currentPressure = 29.92f;
  private float lastPressure;
  
  @Override
  public void display(){
      System.out.print("Forecast: ");
      if(currentPressure > lastPressure){
          System.out.println("Improving weather on the way");
      }
      else if(currentPressure == lastPressure){
          System.out.println("More of the same");
      }
      else if(currentPressure < lastPressure){
          System.out.println("Watch out for cooler, rainy weather");
      }
  }
  
  @Override
  public void onSubscribe(Flow.Subscription subscription){
      this.subscription = subscription;
      this.subscription.request(1);
  }
  
  @Override
  public void onNext(WeatherData.Values item){
      lastPressure = currentPressure;
      currentPressure = item.getPressure();
      display();
      this.subscription.request(1);
  }
  
  @Override
  public void onError(Throwable throwable){
      throw new UnsupportedOperationException("Not supported yet");   
  }

  @Override
  public void onComplete(){
      throw new UnsupportedOperationException("Not supported yet");   
  }
}
