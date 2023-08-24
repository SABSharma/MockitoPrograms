package org.example;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testSum() {
        Calculator c = new Calculator();
        assertEquals(5 , c.sum(3,2));
    }
}