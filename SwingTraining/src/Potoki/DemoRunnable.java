package Potoki;

public class DemoRunnable implements Runnable {
    protected int count =10;
    private static int threadCount=0;
    private final int index=threadCount++;




    public DemoRunnable() {}
    public DemoRunnable(int count) {
        this.count = count;
    }

    public String status(){
        return "#"+index+"("+(count>0?count:"Finish")+"),";
    }

    public int fibonachi(){
        int x1=0;
        int x2=1;
        for (int i = 0; i <5; i++) {
            int y=x1+x2;
            x1=x2;
            x2=y;
            System.out.println(status()+"   "+y);
        }
        return 0;
    }

    @Override
    public void run() {
        while ((count--)>0) {

            System.out.print(status());

            Thread.yield();
        }
        System.out.println();

    }
}
