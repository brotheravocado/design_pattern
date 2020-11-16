/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch02.modelling05;

/**
 *
 * @author dbswl
 */
public class WeatherStation {
    public static void main(String[] args) throws InterruptedException{
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        
        weatherData.subscribe(currentConditions);;
        weatherData.subscribe(statisticsDisplay);;
        weatherData.subscribe(forecastDisplay);;
        
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("-----------------------------");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("-----------------------------");
        weatherData.setMeasurements(78,90,29.2f);
        
    }
}
