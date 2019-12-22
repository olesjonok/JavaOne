package lv.javaguru.demo;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator victim = new Calculator();

    @BeforeAll
    public void setUp() {
        victim = new Calculator();
        System.out.println("Before All Tests: ");
    }

    @BeforeEach
    void BeforeEach(){
        victim = new Calculator();
        System.out.println("Before Each Test: ");
    }

    @Test
    public void shouldSumTwoNumbers() {
        victim = new Calculator();
        int result = victim.sum(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void mustSayIfTheNumberIsOdd(){
        boolean result = victim.isOdd(5);
        assertTrue(result);
    }
}