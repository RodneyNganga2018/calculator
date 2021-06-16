package io.codingdojo.calculator;

public class Calculator implements java.io.Serializable {
    private double num1;
    private double num2;
    private String operation;
    private double result;

    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
        this.operation = "+";
        this.result = 0;
    }

    public void setOperandOne(double num) {
        this.num1 = num;
    }

    public void setOperandTwo(double num) {
        this.num2 = num;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void performOperation() {
        switch(this.operation) {
            case("+"):
                result = num1 + num2;
                break;
            case("-"):
                result = num1 - num2;
                break;
            case("*"):
                result = num1 * num2;
                break;
            case("/"):
                result = num1 / num2;
                break;
            default:
                System.out.println("Did not enter a valid operation, try again!");
        }
    }

    public double getResults() {
        return result;
    }
}
