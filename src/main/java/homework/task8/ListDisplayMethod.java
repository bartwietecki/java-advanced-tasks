package homework.task8;

import java.util.ArrayList;
import java.util.List;

public class ListDisplayMethod {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(2);
        integerList.add(2);
        integerList.add(2);
        listElementsMethod(integerList);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(2.5);
        doubleList.add(3.5);
        doubleList.add(4.5);
        doubleList.add(12.75);
        listElementsMethod(doubleList);
    }

    public static <T> void listElementsMethod(List<T> list){
        for (T element : list){
            System.out.println(element);
        }
    }

}
