package homework.task3;

import java.util.Random;

public class Lotto {
    public int[] lastDrawing;
    public int numberOfWinners;

    public Lotto() {
        this.lastDrawing = new int[6];
    }

    public int[] getLastDrawing() {
        return lastDrawing;
    }

    public int getNumberOfWinners() {
        return numberOfWinners;
    }


    public void sixNumbersDrawing() {
        Random random = new Random();
        for (int i = 0; i < lastDrawing.length; i++) {
            lastDrawing[i] = random.nextInt(49) + 1;
        }
    }

    public int checkNumbers(int[] numbers) {
        int tries = 0;
        for (int i : numbers) {
            for (int lastDrawingNumber : lastDrawing) {
                if (i == lastDrawingNumber)
                    tries++;
            }
        }
        if (tries == 6) {
            numberOfWinners++;
        }
        return tries;
    }


}