package homework.task1;

import java.util.ArrayList;
import java.util.HashSet;
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
        System.out.println("Oryginalna Lista values: " + values);

        // Konwersja Listy na Hashset
        HashSet<Integer> hashSet = new HashSet<Integer>(values);
        List<Integer> uniqueList = new ArrayList<>(hashSet);
        System.out.println("Unikalne elementy z Listy values przy użyciu HashSet: " + uniqueList);

        System.out.println("Użycie metody getUniqueElements:");
        System.out.println(getUniqueElements(values));


    }

    public static List<Integer> getUniqueElements(List<Integer> elements) {
        List<Integer> uniqueElements = new ArrayList<>();
        for (Integer i : elements){
            if(!uniqueElements.contains(i)){
                uniqueElements.add(i);
            }
        }
        return uniqueElements;
    }

}

