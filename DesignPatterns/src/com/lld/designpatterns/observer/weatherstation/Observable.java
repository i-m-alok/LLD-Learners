package com.lld.designpatterns.observer.weatherstation;

import java.util.ArrayList;
import java.util.List;

public interface Observable {

  List<Observer> observers = new ArrayList<>();

  void subscribe(Observer observer);

  void unsubscribe(Observer observer);

  void notifyObservers();
}
