package gau.project1;

import java.util.Scanner;

public class A {
    private int a=1, b;

    public void m1(){
        Scanner scan  = new Scanner(System.in);
        System.out.print("a->");
        a = scan.nextInt();
        System.out.print("b->");
        b=scan.nextInt();
    }

    public void m2(){
        System.out.println("a+b="+(a+b));
    }

    public int m3(){
        return a*b;
    }
}
