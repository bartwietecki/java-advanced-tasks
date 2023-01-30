package homework.task7;

import java.util.Arrays;

public class GenericClass {

    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8,10};
        System.out.println("Original array: " + (Arrays.toString(numbers)));
        genericMethodSwap(numbers, 2, 4);
        System.out.println("Swap method usage: " + Arrays.toString(numbers));

        String[] names = {"Jan", "Kasia", "Basia", "Asia"};
        System.out.println("Original array: " + (Arrays.toString(names)));
        genericMethodSwap(names, 0, 3);
        System.out.println("Swap method usage: " + Arrays.toString(names));

    }

    public static <T> void genericMethodSwap(T[] array, int position1, int position2){
        T temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
    }
}
