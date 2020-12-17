package Prak13;

public abstract class BinaryOperation implements CommonInterface{
    private final CommonInterface elem1,elem2;
    public BinaryOperation(CommonInterface elem1,CommonInterface elem2){
        this.elem1 = elem1;
        this.elem2 = elem2;
    }
    public int evaluate(int x){
            return calculate(elem1.evaluate(x), elem2.evaluate(x));
    }
    public int evaluate(int x,int y,int z){
        return calculate(elem1.evaluate(x,y,z),elem2.evaluate(x,y,z));
    }
    public String toString(){
        return "("+elem1 + " " + getOperation() +" "+elem2+")";
    }
    public String ToString(){
        StringBuilder b1 = new StringBuilder();
        CommonInterface elem = this.elem1;
        b1.append(elem);
        b1.append(" ").append(getOperation()).append(" ");
        b1.append(elem2);
        return b1.toString();
    }
    public abstract String getOperation();
    public abstract int calculate(int elem1,int elem2);
}
