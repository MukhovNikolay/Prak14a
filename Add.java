package Prak13;

public class Add extends BinaryOperation{
    public Add(CommonInterface elem1,CommonInterface elem2){
        super(elem1,elem2);
    }
    public String getOperation(){
        return "+";
    }
    public int calculate(int elem1,int elem2){
        return elem1+elem2;
    }
}
