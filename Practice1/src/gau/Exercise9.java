package gau;

import java.util.Arrays;

public class Exercise9 {
    public Exercise9(){
//        double m[] = new double[8];
        double m[]  = {1.3, 0.4, 8, 0, -8.7, 2, 14.5, 7};
        for(int i=0; i<m.length; i++){
            System.out.println((i+1)+" - "+m[i]);
        }
        System.out.println(Arrays.toString(m));
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
        System.out.println("Min="+m[0]);
        System.out.println("Max="+m[7]);
        System.out.println(Arrays.stream(m).min().getAsDouble());
        System.out.println(Arrays.stream(m).max().getAsDouble());

//        System.out.println("================");
//        for (double item : m) {
//            System.out.println(item);
//        }
    }
}
