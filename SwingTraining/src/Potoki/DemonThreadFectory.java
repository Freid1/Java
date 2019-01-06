package Potoki;

import java.util.concurrent.ThreadFactory;

public class DemonThreadFectory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t=new Thread();
        t.setDaemon(true);
        return t;
    }
}
