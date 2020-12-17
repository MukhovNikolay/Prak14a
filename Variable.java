package Prak13;

public class Variable implements CommonInterface{
    private String var;
    public Variable (String var){
        this.var = var;
    }
  public int evaluate(int x,int y,int z){
        switch(var) {
            case "x":
                return x;
            case "y":
                return y;
            case "z":
                return z;
        }
        return 0;
    }
 public int evaluate(int x){
     return x;
 }
    public String toString(){
        return var;
    }

}
