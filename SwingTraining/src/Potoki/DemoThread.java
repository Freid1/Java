package Potoki;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DemoThread  {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool(new DemonThreadFectory());
        for (int i = 0; i <5; i++) {
            exec.execute(new DemoRunnable());

        }

        TimeUnit.MILLISECONDS.sleep(500);
        exec.shutdown();
    }
}
