package homework.task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {

    @Test
    void shouldReturnUniqueElements() throws IllegalArgumentException {
        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);

        HashSet<Integer> hashSet = new HashSet<Integer>(values);
        List<Integer> uniqueList = new ArrayList<>(hashSet);

        List<Integer> expectedResult = List.of(10,11,12);
        assertEquals(expectedResult, uniqueList);
    }
}