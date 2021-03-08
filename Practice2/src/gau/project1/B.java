package gau.project1;

import java.util.Scanner;

public class B {
    private int a, b, c;

    public void m1(){
        Scanner scan  = new Scanner(System.in);
        System.out.print("a->");
        a = scan.nextInt();
        System.out.print("b->");
        b=scan.nextInt();
        System.out.print("c->");
        c=scan.nextInt();
    }

    public void m2(){
        System.out.println(Math.min(Math.min(a, b), c));
    }

    public void m21(){
        if(a<b && a<c){
            System.out.println(a);
        }else if(b<c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }

    public void m22(){
        int m = a;
        if(m>b) m=b;
        if(m>c) m=c;
        System.out.println(m);
    }
}
