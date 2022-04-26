/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadingPackage;

/**
 *
 * @author Rubaba Hasan
 */
class PrintDemo {
   synchronized public void printCount() {
      try {
         for(int i = 5; i > 0; i--) {
            System.out.println("Counter   ---   "  + i );
         }
      } catch (Exception e) {
         System.out.println("Thread  interrupted.");
      }
   }
}

class ThreadDemo3 extends Thread {
   private Thread t;
   private String threadName;
   PrintDemo  PD;

   ThreadDemo3( String name,  PrintDemo pd) {
      threadName = name;
      PD = pd;
   }
   
   public void run() {
      //PD.printCount();
      synchronized(PD) {
       PD.printCount();
        
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }

   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

class TestThread3 {
   public static void main(String args[]) {

      PrintDemo PD = new PrintDemo();

      ThreadDemo3 T1 = new ThreadDemo3( "Thread - 1 ", PD );
      ThreadDemo3 T2 = new ThreadDemo3( "Thread - 2 ", PD );

      T1.start();
      T2.start();

      // wait for threads to end
         try {
         T1.join();
         T2.join();
      } catch ( Exception e) {
         System.out.println("Interrupted");
      }
   }
}