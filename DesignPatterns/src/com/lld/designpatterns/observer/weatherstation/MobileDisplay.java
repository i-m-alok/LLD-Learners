package com.lld.designpatterns.observer.weatherstation;

public class MobileDisplay implements Observer {

  @Override
  public void update(Observable observable) {
    WeatherStation weatherStation =  observable instanceof WeatherStation ? ((WeatherStation)observable) : null;
    System.out.println("The temprature is :"+ weatherStation.getTemperature());
  }
}
