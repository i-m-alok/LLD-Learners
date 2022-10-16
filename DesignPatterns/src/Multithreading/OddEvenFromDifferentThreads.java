package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class OddEvenFromDifferentThreads {

  public static void main(String[] args) {

    AtomicInteger data = new AtomicInteger(0);
    Object lock = new Object();

    Thread evenPrinter = new Thread(new EvenRunnable(data, lock));
    Thread oddPrinter = new Thread(new OddRunnable(data, lock));

    evenPrinter.start();
    oddPrinter.start();
  }
}

class EvenRunnable implements Runnable {

  private AtomicInteger num;
  public Object lock;

  public EvenRunnable(AtomicInteger num, Object lock) {
    this.num = num;
    this.lock = lock;
  }

  @Override
  public void run() {

    synchronized (lock) {
      while (num.get() <= 20) {

        if (num.get() % 2 != 0) {

          try {
            lock.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }

        } else {
          System.out.println("Printing from EvenPrinter :" + num);
          num.incrementAndGet();
          lock.notifyAll();
        }
      }
    }
  }
}

class OddRunnable implements Runnable {

  private AtomicInteger num;
  public Object lock;

  public OddRunnable(AtomicInteger num, Object lock) {
    this.num = num;
    this.lock = lock;
  }

  @Override
  public void run() {

    synchronized (lock) {
      while (num.get() <= 20) {

        if (num.get() % 2 == 0) {
          try {
            lock.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }else{
          System.out.println("Printing from OddPrinter :" + num);
          num.incrementAndGet();
          lock.notifyAll();
        }
      }
    }
  }
}
