package com.lld.designpatterns.observer.notifyme;

public interface Observable {

  void subscribe(Observer observer);

  void unsubscribe(Observer observer);

  void notifyObservers();
}
