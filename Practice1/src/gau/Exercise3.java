package gau;

import java.util.Scanner;

public class Exercise3 {
    public Exercise3(){
        System.out.println("Exercise #3");
        int  x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.print("X=");
        x = scanner.nextInt();
        System.out.print("Y=");
        y = scanner.nextInt();
        System.out.print("Z=");
        z = scanner.nextInt();
        System.out.println("X+Y+Z="+(x+y+z));
        System.out.println("X*Y*Z="+(x*y*z));
    }
}
