package Prak13;

public class test{
    public static void main(String[] args){
        System.out.println(new Multiply(new Subtract(new Const(5),new Variable("x")),new Const(9)).ToString());
       /* System.out.println(new Multiply(new Subtract(new Const(5),new Variable("x")),new Const(9)).evaluate(7));*/
        System.out.println();
        ExpressionTripple Ex1 = new ExpressionTripple();
        String var="x*x*x*8+7";
        System.out.println(new Add(Ex1.parse(var),new Const(0)).ToString());
        System.out.println(new Add(Ex1.parse(var),new Const(0)).evaluate(50));
        for(int i=0;i<10;i++){
            System.out.print(i +"     ");
            System.out.println(new Add(Ex1.parse(var),new Const(0)).evaluate(i));
        }
        var="x*x*x*8+7-y*z";
        System.out.println(new Add(Ex1.parse(var),new Const(0)).evaluate(5,6,7));
    }
}
