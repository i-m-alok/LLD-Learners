package com.lld.designpatterns.observer.notifyme;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements Observable {

  public List<Observer> observers = new ArrayList<>();
  public int stock;

  public Iphone(int stock) {
    this.stock = stock;
  }

  @Override
  public void subscribe(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void unsubscribe(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {

    for (Observer observer : observers) {
      observer.update();
    }
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    if (this.stock == 0) {
      notifyObservers();
    }
    this.stock = stock;
  }
}
