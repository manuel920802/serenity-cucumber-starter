package calculator.domain;

import java.util.Objects;

public class RecordedOperation {
    private final String operation;
    private final String result;

    public RecordedOperation(String operation, String result) {
        this.operation = operation;
        this.result = result;
    }

    @Override
    public String toString() {
        return "RecordedOperation{" +
                "operation='" + operation + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordedOperation that = (RecordedOperation) o;
        return Objects.equals(operation, that.operation) && Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, result);
    }
}
