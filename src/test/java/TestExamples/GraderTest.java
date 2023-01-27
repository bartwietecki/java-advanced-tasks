package TestExamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnB() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void ninetyNineShouldReturnA() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }

    @Test
    void ninetyShouldReturnA() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(90));
    }

    @Test
    void eightyShouldReturnB() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(80));
    }

    @Test
    void seventyShouldReturnC() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(70));
    }

    @Test
    void sixtyShouldReturnD() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(60));
    }

    @Test
    void zeroShouldReturnF() throws IllegalAccessException {
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(0));
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException() throws IllegalArgumentException {
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGrade(-1);
                });

    }
}