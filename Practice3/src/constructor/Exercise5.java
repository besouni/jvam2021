package constructor;

public class Exercise5 {
    private float x, y;
    public Exercise5(){};
    public Exercise5(float _x){
        x = _x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float m1(){
        float result = 0;  //y = 3, x = 4 //y=3, x=-4
        if(y!=0){
             result = x/y+x*y;
        }
        if(x<=0){
            result = (float) (Math.pow(x, 4)+y);
        }
        return result;
    }
}
