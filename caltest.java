package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, c.add(10, 5));
    }

    @Test
    void testSub() {
        assertEquals(5, c.sub(10, 5));
    }
}
