package Multithreading;

public class Deadlock {
  static final String resource1 = "Scanner";
  static final String resource2 = "Printer";
  public static void main(String[] args) throws InterruptedException {

    Thread t1 = new Thread(new Desktop(), "Desktop");
    Thread t2 = new Thread(new Laptop(), "Laptop");

    t1.start();
    t2.start();

  }

  static class Laptop implements Runnable {

    @Override
    public void run() {

      synchronized (resource1) {
        System.out.println(Thread.currentThread().getName() + " has acquired " + resource1);
        try {
          Thread.currentThread().sleep(30000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      System.out.println(Thread.currentThread().getName() + " waiting for " + resource2);

      synchronized (resource2) {
        System.out.println(Thread.currentThread().getName() + " has acquired " + Deadlock.resource2);
      }
    }
  }

  static class Desktop implements Runnable {


    @Override
    public void run() {

      synchronized (resource2) {
        System.out.println(Thread.currentThread().getName() + " has acquired " + Deadlock.resource2);
        try {
          Thread.currentThread().sleep(30000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      System.out.println(Thread.currentThread().getName() + " waiting for " + resource1);

      synchronized (resource1) {
        System.out.println(Thread.currentThread().getName() + " has acquired " + resource1);
      }
    }
  }

}


