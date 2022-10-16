package Multithreading;

public class CreateNewThreads {

  public static void main(String[] args) throws InterruptedException {

      Thread t;

      for(int i = 0; i < 10; i++){
          t = new Thread(new MyRunnable(), "thread"+i);
          t.start();
          t.join(); // tell the main thread to wait until t completes its execution
      }
    System.out.println("All threads created successfully");
  }
}

class MyRunnable implements Runnable {

  @Override
  public void run() {
    System.out.println("Running :"+ Thread.currentThread().getName());
  }
}
