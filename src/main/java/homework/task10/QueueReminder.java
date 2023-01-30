package homework.task10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReminder {

    public static void main(String[] args) {

        Queue<String> queueExample = new LinkedList<>();
        queueExample.add("Bartek");
        queueExample.add("Tomek");
        queueExample.offer("Bartek");
        queueExample.offer("Tomek");

        System.out.println(queueExample);
        System.out.println(queueExample.poll());
        System.out.println(queueExample);
        System.out.println(queueExample.peek());
        System.out.println(queueExample);

        // peek() - metoda używana do uzyskania wartości pierwszego elementu w kolejce, ale bez jego usunięcia.
        //          Jeśli kolejka jest pusta zwraca null.

        // poll() - metoda używana do usuwania i zwracania pierwszego elementu z kolejki.
        //          Jeśli kolejka jest pusta zwraca null.

    }
}
