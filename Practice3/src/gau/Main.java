package gau;

import constructor.Exercise2;
import constructor.Exercise5;
import inheritance.A;
import inheritance.B;
import inheritance.C;

public class Main {

    public static void main(String[] args) {

	// write your code here

        A a =  new A();
        A a1 = new A();
        A a2 = new A();
        a.setXY();
        a.printX();
        a.printY();

        System.out.println("===============");

        B b = new B(5, 6);
        b.printX();
        b.printY();
//        b.setXY();
//        b.printX();
//        b.printY();

//        B b1 = new B();
        C c = new C(5, 6);


//        Exercise5 exercise5 = new Exercise5(4);
//        exercise5.setY(3);
//        System.out.println(exercise5.m1());
//        Exercise2 exercise2 = new Exercise2();
//        Exercise2 exercise21 = new Exercise2(10);
//        exercise21.m1();
//        System.out.println(exercise21.m2());
//        System.out.println(exercise21.m3());
    }
}
