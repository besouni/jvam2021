package gau;

public class ThreadExample2 implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("ThreadExampe 2");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
        }
    }
}
