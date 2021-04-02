package gau;

import java.util.Scanner;

public class Cclass implements InterfaceForCclass {
    private int a=10, b=9;
    private char s='#', h='@';
    private Scanner scanner;

    @Override
    public void printAB(){
        System.out.println(a+", "+b);
    }

    @Override
    public void printSH(){
        System.out.println(s+",  "+h);
    }

    @Override
    public void printManipulationAB() {
        System.out.println((a+b)+"\n"+(a*b)+"\n"+(a*1.0/b)+"\n"+(a%b));
    }

    @Override
    public void setA() {
        scanner = new Scanner(System.in);
        a = scanner.nextInt();
    }

    @Override
    public void setB() {
        scanner = new Scanner(System.in);
        b = scanner.nextInt();
    }

    @Override
    public void setSH() {
        scanner = new Scanner(System.in);
        h = scanner.nextLine().charAt(0);
        s = scanner.next().charAt(0);
    }
}
