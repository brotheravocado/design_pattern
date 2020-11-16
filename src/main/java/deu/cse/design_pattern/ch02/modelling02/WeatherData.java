package deu.cse.design_pattern.ch02.modelling02;
// WeatherData 클래스

import java.util.LinkedList;

class WeatherData extends Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * Constructor
     */
    public WeatherData() {
        mObserver = new LinkedList<>();
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
    }

    public void registerObserver(Observer o) {
        mObserver.add(o);
    }

    public void removeObserver(Observer o) {
        int i = mObserver.indexOf(o);
        if (i >= 0) {
            mObserver.remove(i);
        }
    }

    public void notifyObservers() {
        mObserver.forEach((mObserver) -> {
            mObserver.update(temperature, humidity, pressure);
        });
    }
}
