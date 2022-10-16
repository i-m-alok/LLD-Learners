package com.lld.designpatterns.observer.weatherstation;

public class WeatherStation implements Observable {

  private int temperature;

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temprature) {
    this.temperature = temprature;
    notifyObservers();
  }

  public void subscribe(Observer observer){
     observers.add(observer);
  }

  public void unsubscribe(Observer observer){
    observers.remove(observer);
  }

  public void notifyObservers(){
    for (Observer observer : observers){
      observer.update(this);
    }
  }

}
