package gau;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DataClass data = new DataClass();
        Thread1 t1 = new Thread1(data );
        Thread2 t2 = new Thread2(data );
        t1.start();
        t2.start();
//        t1.run1();
//        t2.run2();


//       ThreadExample1 t1 = new ThreadExample1();
//       t1.setPriority(1);
//       t1.start();
//        System.out.println();

//       ThreadExample2 t2 = new ThreadExample2();
//       Thread t2_2 = new Thread(t2);
//       t2_2.setPriority(10);
//       t2_2.start();

//        t1.method1();
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println("Main Method");
    }
}
