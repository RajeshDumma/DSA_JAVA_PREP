package StringsAndOops.Threads;

import java.lang.*;

class Threads implements Runnable{

    String threadName;
    Threads(String str){
        threadName = str;
    }

    public void run(){
        for (int i = 0; i <= 5; i++){
            System.out.println( threadName +": "+ i);

            try{
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}

public class ThreadEx2 {
    public static void main(String[] args){
        Thread t = Thread.currentThread();
       // t.setName("First/Main thread");
        System.out.println(t);
        ThreadGroup gp = new ThreadGroup("RRR"); // Thread Group

        Threads t1 = new Threads("Second Thread");
                Thread th = new Thread(gp,t1);
                th.start();
                try{
                    th.join();
                }catch (Exception e){}
        System.out.println(th);

                Threads t2 = new Threads("Third Thread");
                Thread th1 = new Thread(gp, t2);
                th1.start();
                try {
                    th1.join();
                }catch (Exception e){}
                System.out.println(th1);

              /* try{
                   t.sleep(1000);
               } catch (Exception e){} */ // with sleep we can hold some time main thread

        System.out.println(gp);

        System.out.println("Group Name: " + gp.getName());

        System.out.println("Max Priority: " + gp.getMaxPriority());

        System.out.println("Active Threads: " + gp.activeCount());

        System.out.println("Active Groups: " + gp.activeGroupCount());

        gp.list();
                System.out.println("Main Thread End");

    }
}
