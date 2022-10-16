package com.lld.designpatterns.observer.notifyme;

public class EmailNotification implements Observer {

  Observable observable;
  String email;

  EmailNotification(Observable observable, String email) {
    this.observable = observable;
    this.email = email;
  }

  @Override
  public void update() {
    sendEmail();
  }

  public void sendEmail() {
    System.out.println("mail sent to :" + email);
  }

  @Override
  public String toString() {
    return "EmailNotification{" +
            "observable=" + observable +
            ", email='" + email + '\'' +
            '}';
  }
}
