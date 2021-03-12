package constructor;

public class  Exercise2{
    private int x;

    public Exercise2(){ }

    public Exercise2(int _x){
        x = _x;
    }

    public void m1(){
        if(x>=5 && x<=24){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public int m2(){
        return 2*x;
    }

    public int m3(){
        return 2*m2();
    }
}
