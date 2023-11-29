package calculator;
//client file

public class Calculator {
    public static void main(String[] args) {
        // {1 - [2 * (4 + 3)]}   

        // 4
        ExpressionComponent num1 = new Number(4);
        System.out.println(num1.compute());
        // 3
        ExpressionComponent num2 = new Number(3);
        System.out.println(num2.compute());
        // 4 + 3
        ExpressionComponent add = new AddExpression(num1, num2);
        System.out.println(add.compute());
        // 2
        ExpressionComponent num3 = new Number(2);
        System.out.println(num3.compute());
        // 2 * (4 + 3)
        ExpressionComponent mult = new MultiplyExpression(num3, add);
        System.out.println(mult.compute());
        // 1
        ExpressionComponent num4 = new Number(1);
        System.out.println(num4.compute());
        // 1 - [2 * (4 + 3)]
        ExpressionComponent sub = new SubtractExpression(num4, mult);
        System.out.println(sub.compute());
    }
}
