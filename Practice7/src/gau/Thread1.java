package gau;

public class Thread1 extends Thread {
    DataClass dataClass;

    public Thread1(DataClass dataClass) {
        this.dataClass = dataClass;
    }

    public void run(){
        dataClass.printNumbers(10, "Thread1");
    }

    public void run1(){
        dataClass.printNumbers(10, "Thread1");
    }
}
