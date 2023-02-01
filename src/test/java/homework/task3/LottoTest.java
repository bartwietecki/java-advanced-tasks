package homework.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoTest {

    @Test
    public void sixNumbersDrawingTest() {
        Lotto lotto = new Lotto();
        lotto.sixNumbersDrawing();
        int[] lastDrawing = lotto.getLastDrawing();
        assertNotNull(lastDrawing);
        assertEquals(6, lastDrawing.length);
        for (int number : lastDrawing) {
            assertTrue(number >= 1 && number <= 49);
        }
    }

    @Test
    public void checkNumbersTest() {
        Lotto lotto = new Lotto();
        lotto.lastDrawing = new int[]{1,2,3,4,5,6};
        int[] numbers = new int[]{1,2,3,4,5,6};

        int tries = lotto.checkNumbers(numbers);

        assertEquals(6, tries);
        assertEquals(1, lotto.getNumberOfWinners());
    }
}