package homework.task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {

    @Test
    void testShouldReturnUniqueElements() {
        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);

        List<Integer> uniqueElements = Task1.getUniqueElements(values);

        List<Integer> expectedElements = new ArrayList<>();
        expectedElements.add(10);
        expectedElements.add(11);
        expectedElements.add(12);

        assertEquals(expectedElements, uniqueElements);
    }
}