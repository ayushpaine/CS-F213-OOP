Give code for a  Java class public class StrOp 
that contains a static method   public static int evalExpression(String expr)
Parameters:
String expr: A string of the form “a op b” where ‘a’ and ‘b’ are non-negative integers and ‘op’ is one of the four operators +, -, * and /. The operands and the operator are space-separated. (Assume correct inputs will be given) 
Return value: The method should use Java Library class methods to obtain the int values and return the value obtained after evaluating the expression.
 If the value is fractional, return only the integral part.
 If the value is infinite or indeterminate, return MAX_VALUE as defined in the Integer class.