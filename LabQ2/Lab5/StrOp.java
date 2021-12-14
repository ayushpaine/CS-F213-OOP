public class StrOp {
    public static int evalExpression(String expr){
        String a = expr.split(" ")[0];
        Integer i1 = Integer.parseInt(a);

        String op = expr.split(" ")[1];

        String c = expr.split(" ")[2];
        Integer i2 = Integer.parseInt(c);

        switch(op){
            case "+":
                return i1 + i2;
                
            case "-":
                return i1 - i2;

            case "*":
                return i1 * i2;
            
            case "/":
                if(i2 == 0){
                    return Integer.MAX_VALUE;
                }
                else{
                    return i1 / i2;
                }
        }

        return 0;
    }

}