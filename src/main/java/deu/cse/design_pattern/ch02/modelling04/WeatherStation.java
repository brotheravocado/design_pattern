/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch02.modelling04;

/**
 *
 * @author dbswl
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        
        weatherData.addPropertyListener(currentConditions);
        weatherData.addPropertyListener(statisticsDisplay);
        weatherData.addPropertyListener(forecastDisplay);
        
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("------------------------------");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("------------------------------");
        weatherData.removePropertyChangeListener(forecastDisplay);
        weatherData.setMeasurements(78,90,29.2f);

    }
}
