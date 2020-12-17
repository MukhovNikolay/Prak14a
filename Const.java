package Prak13;

public class Const implements CommonInterface{
    private int value;
    public Const(int value){
        this.value = value;
    }
    public int evaluate(int x){
        return value;
    }
    public String toString(){
        return String.valueOf(value);
    }
    public int evaluate(int x,int y,int z){
        return value;
    }
}
