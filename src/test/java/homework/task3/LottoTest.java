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
        lotto.sixNumbersDrawing();
        int[] lastDrawing = lotto.getLastDrawing();
        int[] numbers = new int[] { lastDrawing[0], lastDrawing[1], lastDrawing[2],
        lastDrawing[3], lastDrawing[4], lastDrawing[5]};

        int tries = lotto.checkNumbers(numbers);

        assertEquals(6, tries);
        assertEquals(1, lotto.getNumberOfWinners());
    }
}