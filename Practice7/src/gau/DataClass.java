package gau;

public class DataClass {
    public synchronized void printNumbers(int N, String Name){
        for(int i=0; i<N; i++){
            System.out.println(Name+" -> "+i);
        }
    }
}
