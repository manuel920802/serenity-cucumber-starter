package calculator.domain;

public class MathsOperation {
    private final String leftOperand;
    private final String operator;
    private final String rightOperand;

    public MathsOperation(String leftOperand, String operator, String rightOperand) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public String getLeftOperand() {
        return leftOperand;
    }

    public String getOperator() {
        return operator;
    }

    public String getRightOperand() {
        return rightOperand;
    }

    @Override
    public String toString() {
        return "MathsOperation{" +
                "leftOperand='" + leftOperand + '\'' +
                ", operator='" + operator + '\'' +
                ", rightOperand='" + rightOperand + '\'' +
                '}';
    }
}
