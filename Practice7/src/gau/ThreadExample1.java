package gau;

public class ThreadExample1 extends Thread {
    
    public void run(){
        for(int i=0; i<100; i++) {
            System.out.println("ThreadExampe 1");
            System.out.println(this.getName());
            System.out.println(this.getPriority());
        }
    }
    
    public void method1(){
        System.out.println("Method 1");
    }
}
