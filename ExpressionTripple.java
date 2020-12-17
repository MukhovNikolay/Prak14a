package Prak13;

public class ExpressionTripple {
    char [] elements;
    int flag = 1;
    String var1,var2;
    int begin,end;

    public CommonInterface parse(String var) {
        if(var.indexOf("(")!=-1){
            begin = var.indexOf("(");
            flag=1;
            int i=begin;
            elements = var.toCharArray();
            while(flag!=0){
                i++;
                if(elements[i]=='(')
                    flag++;
                if(elements[i]==')')
                    flag--;
            }
            end =i;
            if(begin!=0) {
                var1 = var.substring(0, begin);
            }
            else
                var1 ="";
            if(end!=var.length()-1) {
                var2 = var.substring(end + 1);
            }
            else
                var2 = "";
            return Conditions(end,begin,var1,var2,var);
        }
        if ((var.indexOf("+") != -1)) {
            return new Add(parse(var.substring(0, var.indexOf("+"))), parse(var.substring(var.indexOf("+") + 1)));
        }
        if (var.indexOf("-") != -1) {
            return new Subtract(parse(var.substring(0, var.indexOf("-"))), parse(var.substring(var.indexOf("-") + 1)));
        }
        if ((var.indexOf("*") != -1)||(var.indexOf("/") != -1)) {
            if(var.indexOf("*")<var.indexOf("/"))
                return new Multiply(parse(var.substring(0, var.indexOf("*"))), parse(var.substring(var.indexOf("*") + 1)));
            else
                return new Divide(parse(var.substring(0, var.indexOf("/"))), parse(var.substring(var.indexOf("/") + 1)));
        }
        if((var.indexOf("x")!=-1)||(var.indexOf("y")!=-1)||(var.indexOf("z")!=-1)){
            return new Variable(var);
        }
        return new Const(Integer.parseInt(var));
    }
    private CommonInterface Conditions(int end,int begin,String var1,String var2,String var){
        if ((var1.indexOf("+") != -1)) {
            return new Add(parse(var.substring(0,var1.indexOf("+"))), parse(var.substring(var1.indexOf("+") + 1)));
        }
        if (var1.indexOf("-") != -1) {
            return new Subtract(parse(var.substring(0,var1.indexOf("-"))), parse(var.substring(var1.indexOf("-") + 1)));
        }
        if ((var2.indexOf("+") != -1)) {
            return new Add(parse(var.substring(0,end+1+var2.indexOf("+"))), parse(var.substring(var2.indexOf("+")+2+end)));
        }
        if (var2.indexOf("-") != -1) {
            return new Subtract(parse(var.substring(0,end+1+var2.indexOf("-"))), parse(var.substring(end+3+var2.indexOf("-"))));
        }
        if ((var1.indexOf("*") != -1)) {
            return new Multiply(parse(var.substring(0,var1.indexOf("*"))), parse(var.substring(var1.indexOf("*") + 1)));
        }
        if (var1.indexOf("/") != -1) {
            return new Divide(parse(var.substring(0,var1.indexOf("/"))), parse(var.substring(var1.indexOf("/") + 1)));
        }
        if ((var2.indexOf("*") != -1)) {
            return new Multiply(parse(var.substring(0,end+1+var2.indexOf("*"))), parse(var.substring(end+var2.indexOf("*") + 2)));
        }
        if (var2.indexOf("/") != -1) {
            return new Divide(parse(var.substring(0,end+1+var2.indexOf("/"))), parse(var.substring(end+var2.indexOf("/") + 2)));
        }
            var = var.substring(begin + 1, end);
            return parse(var);
    }
}


