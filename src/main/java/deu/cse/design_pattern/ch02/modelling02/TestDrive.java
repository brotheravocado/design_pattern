/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch02.modelling02;

/**
 *
 * @author dbswl
 */
public class TestDrive {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        
        CurrentConditions currentDisplay = new CurrentConditions(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80,65,30);
        System.out.println("---------------------------------");
        weatherData.setMeasurements(83, 70, 29);
         System.out.println("---------------------------------");
         weatherData.setMeasurements(78,90,29);
        
    }
}
