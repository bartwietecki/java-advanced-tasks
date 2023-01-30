package homework.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GenericClassTest {

    @Test
    public void shouldSwapIndexes(){
        Integer[] numbers = new Integer[]{1,2,3,4,5};
        Integer[] numbers2 = new Integer[]{1,5,3,4,2};

        GenericClass.genericMethodSwap(numbers, 1, 4);

        // nie samo assertEquals, tylko assertArrayEquals -> wstawiamy tablice !
        assertArrayEquals(numbers2, numbers);
    }
}