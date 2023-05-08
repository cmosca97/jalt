package com.example.jalt.m2.s04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OtherTest {

    @Test
    void testIncrease() {
        fail("Not yet implemented");
    }
    
    @Test
    void increasePlain() {
        int input = 4;
        int expected = 5;
        int actual = Other.increase(input);
        assertEquals(expected, actual);
    }
}
