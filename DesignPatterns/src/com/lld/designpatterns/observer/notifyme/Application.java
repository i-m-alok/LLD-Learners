package com.lld.designpatterns.observer.notifyme;

import com.lld.designpatterns.observer.weatherstation.MobileDisplay;

public class Application {
  public static void main(String[] args) {

      Iphone iphone = new Iphone(0);

      Observer email1 = new EmailNotification(iphone, "myemail@abc.com");
      Observer email2 = new EmailNotification(iphone, "thisisem@pqr.com");

      iphone.subscribe(email1);
      iphone.subscribe(email2);

      iphone.setStock(10);

      iphone.unsubscribe(email1);

      iphone.setStock(0);
      iphone.setStock(12);
  }
}
