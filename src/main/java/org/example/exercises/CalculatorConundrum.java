package org.example.exercises;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int result;
        try {
            result = switch(operation) {
                case "+" -> operand1 + operand2;
                case "*" -> operand1 * operand2;
                case "/" -> operand1 / operand2;
                case "" -> throw new IllegalArgumentException("Operation cannot be empty");
                case null -> throw new IllegalArgumentException("Operation cannot be null");
                default -> throw new IllegalOperationException("Operation '"+ operation +"' does not exist");
            };
        } catch (ArithmeticException ae) {
            throw new IllegalOperationException("Division by zero is not allowed", ae);
        }
        return String.format("%d %s %d = %d", operand1, operation, operand2, result);
    }
}

class IllegalOperationException extends RuntimeException {
    public IllegalOperationException(String errorMessage) {
        super(errorMessage);
    }
    public IllegalOperationException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
