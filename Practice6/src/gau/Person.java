package gau;

import java.sql.SQLOutput;

public class Person {
    public String lastName = "Tabatadze";
    protected String Id = "1212341242";
    String name = "Beso";
    private int Age = 37;

    public void method1(int Age){
//        int Age=9;
        System.out.println(Age);
        System.out.println(this.Age);
    }
}
