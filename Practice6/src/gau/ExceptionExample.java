package gau;

public class ExceptionExample {
    public void method1(){
        int x = 5, y=0, z, t;
        int m[] = {9, 8};
        try {
            t = m[4];
            z = x/y;
        }catch (Exception e){
//            System.out.println("Arithmetic Erorr!!");
            z = x;
        }
        System.out.println(z);
        System.out.println(x+9);
        System.out.println("Hello Java");
    }
}
