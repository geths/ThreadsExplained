/*
 * Description : A simple program to explain Multithreading in Java and the difference between run() and start()
 * Author      : Getha Jagannathan
 */
package threadsexplained;

public class ThreadsExplained implements Runnable
{
   public void run()
   {  
        for(int i=1;i<=5;i++)
        {  
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }  

            System.out.println(Thread.currentThread().getName() + " - " + i);  
        } 
   }  
   public static void main(String args[])
   {  
      Thread t1 = new Thread(new ThreadsExplained(), "thread1");
      Thread t2 = new Thread(new ThreadsExplained(), "thread2"); 
      Thread t3 = new Thread(new ThreadsExplained(), "thread3");
      Thread t4 = new Thread(new ThreadsExplained(), "thread4"); 
      Thread t5 = new Thread(new ThreadsExplained(), "Deamon");
      t5.setDaemon(true);
      //run() method executes the call from the main thread sequentially - hence no benefit of multi-threading
      t1.run();  
      t2.run(); 
      //start() methods starts the threads simultaneously - hence output will differ each time the program is executed
      t5.start();//Starting the Deamon Thread - JVM does not wait for the completion of this thread
      t3.start();  
      t4.start();     
   }
}