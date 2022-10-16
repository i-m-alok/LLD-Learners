package com.lld.designpatterns.observer.weatherstation;

public class Application {

  public static void main(String[] args) {

    WeatherStation weatherStation = new WeatherStation();
    weatherStation.setTemperature(12);

    MobileDisplay mobileDisplay = new MobileDisplay();

    weatherStation.subscribe(mobileDisplay);
    weatherStation.setTemperature(18);
    weatherStation.setTemperature(23);
    weatherStation.setTemperature(20);
    weatherStation.setTemperature(16);
  }
}
