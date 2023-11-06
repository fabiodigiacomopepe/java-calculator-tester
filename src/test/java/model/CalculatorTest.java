package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("Addizione")
    void floatAdd() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.floatAdd(0, 1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.floatAdd(1, 0);
        });
        assertEquals(7, Calculator.floatAdd(5, 2));
        assertNotEquals(4, Calculator.floatAdd(12, 8));
    }

    @Test
    @DisplayName("Sottrazione")
    void floatSubtract() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.floatSubtract(0, 1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.floatSubtract(1, 0);
        });
        assertEquals(3, Calculator.floatSubtract(5, 2));
        assertNotEquals(20, Calculator.floatSubtract(12, 8));
    }

    @Test
    @DisplayName("Divisione")
    void floatDivide() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.floatDivide(0, 1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.floatDivide(1, 0);
        });
        assertEquals(5, Calculator.floatDivide(10, 2));
        assertNotEquals(12, Calculator.floatDivide(6, 2));
    }

    @Test
    @DisplayName("Moltiplicazione")
    void floatMultiply() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.floatMultiply(0, 1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.floatMultiply(1, 0);
        });
        assertEquals(20, Calculator.floatMultiply(10, 2));
        assertNotEquals(3, Calculator.floatMultiply(6, 2));
    }
}