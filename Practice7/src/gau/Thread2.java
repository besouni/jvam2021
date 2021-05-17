package gau;

public class Thread2  extends Thread{
    DataClass dataClass;

    public Thread2(DataClass dataClass) {
        this.dataClass = dataClass;
    }

    public void run(){
        dataClass.printNumbers(10, "Thread2");
    }

    public void run2(){
        dataClass.printNumbers(10, "Thread2");
    }
}
