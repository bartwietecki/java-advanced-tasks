package TestExamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour() {
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));

    }
//        assertNotEquals();
//        assertTrue();
//        assertFalse();
//        assertNull();
//        assertNotNull();

        @Test
        void threePlusSevenShouldEqualTen(){
            var calculator = new SimpleCalculator();
            assertEquals(10, calculator.add(3,7));


    }
}