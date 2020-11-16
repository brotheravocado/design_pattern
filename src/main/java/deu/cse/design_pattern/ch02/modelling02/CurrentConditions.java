package deu.cse.design_pattern.ch02.modelling02;
//CurrentConditions 클래스

class CurrentConditions implements Observer, DisplayElement {

    private WeatherData WeatherData;
    private float temperature;
    private float humidity;

    public CurrentConditions(WeatherData weatherData) {
        this.WeatherData = weatherData;
        this.WeatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions:s " + temperature + "F degress and " + humidity + "% humidity");
    }

}
