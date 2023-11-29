package calculator;
public class Number implements ExpressionComponent {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @override
    public int compute() {
        return value;
    }
}