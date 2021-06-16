package io.codingdojo.calculator;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator test = new Calculator();
        test.setOperandOne(10.5);
        test.setOperation("+");
        test.setOperandTwo(5.2);
        test.performOperation();
        System.out.println(test.getResults());
    }
}
