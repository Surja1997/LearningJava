package multithreading;

import io.reactivex.schedulers.Schedulers;

public class MaxTHreadsWIthRx {
    static int count =0;

    public static void main(String[] args) {

        while (true){
            Schedulers.newThread().scheduleDirect(() ->
                    {
                        try {
                            fun();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    );
        }
    }

    static void fun() throws InterruptedException {
        System.out.println("Thread #"+count++);
        while(true) {
            if (Thread.currentThread().getName().contains("Rx"))
                Thread.sleep(1000);
        }
    }
}
