package com.keyin.calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculatorUnderTest = new Calculator();
        int result = calculatorUnderTest.sum(2, 2);
        Assertions.assertNotNull(result);
        Assertions.assertNotEquals(5, result);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testMinus() {
        Calculator calculatorUnderTest = new Calculator();
        int result = calculatorUnderTest.minus(2, 2);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(0, result);
        Assertions.assertNotEquals(5, result);
    }

    @Test
    public void testDivide() {
        Calculator calculatorUnderTest = new Calculator();
        int result = calculatorUnderTest.divide(2, 2);
        Assertions.assertNotEquals(0,result);
        Assertions.assertEquals(1, result);

    }


}
