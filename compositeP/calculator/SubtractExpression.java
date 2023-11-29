package calculator;

public class SubtractExpression implements ExpressionComponent {
    ExpressionComponent exp1;
    ExpressionComponent exp2;

    public SubtractExpression(ExpressionComponent exp1, ExpressionComponent exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public int compute() {
        return exp1.compute() - exp2.compute();
    }
    
}
