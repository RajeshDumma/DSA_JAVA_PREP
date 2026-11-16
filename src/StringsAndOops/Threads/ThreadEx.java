package StringsAndOops.Threads;

class MyThread extends Thread{

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    Thread.currentThread().getName() + " : " + i
            );

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadEx {
    public static void main(String[] args){
       Thread t = Thread.currentThread();
       System.out.println(t);

       MyThread obj = new MyThread();
     //  obj.run(); // its execute successfully, The main thread continues its execution.
        Thread t1 =  new Thread(obj);
        t1.setName("Second Thread");
        System.out.println(t1);
        t1.start();

        Thread t2 = new Thread(obj);
        t2.setName("Third thread");
        System.out.println(t2);
        t2.start();

    }

}
