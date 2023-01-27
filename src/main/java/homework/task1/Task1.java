package homework.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Na podstawie poniższej listy napisz mechanizm, który zwróci tylko elementy unikalne:
 * List<Integer> values = new ArrayList<>();
 * values.add(10);
 * values.add(11);
 * values.add(10);
 * values.add(11);
 * values.add(12);
 * values.add(11);
 * <p>
 * NAPISZ TEST JEDNOSTKOWY SPRAWDZAJĄCY POPRAWNOŚĆ DZIAŁANIA METODY
 */

public class Task1 {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();

        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);

        System.out.println(values);


    }


}