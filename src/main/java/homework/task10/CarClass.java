package homework.task10;

import java.util.LinkedList;
import java.util.Queue;

public class CarClass {

    private String carName;
    private String carType;

    public CarClass(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public static void main(String[] args) {

        Queue<CarClass> carClassQueue = new LinkedList<>();

        CarClass car1 = new CarClass("Audi", "Coupe");
        CarClass car2 = new CarClass("BMW", "SUV");
        CarClass car3 = new CarClass("Mercedes", "Sedan");

        carClassQueue.add(car1);
        carClassQueue.add(car2);
        carClassQueue.add(car3);

        System.out.println("Wszystkie auta w kolejce:");
        for (CarClass cars : carClassQueue){
            System.out.println(cars);
        }

        System.out.println();

        System.out.println("Działanie metody peek (Pierwszy element z kolejki, bez jego usunięcia):");
        System.out.println(carClassQueue.peek());

        System.out.println();

        System.out.println("Wszystkie auta w kolejce, po zastosowaniu metody .peek():");
        for (CarClass cars : carClassQueue){
            System.out.println(cars);
        }

        System.out.println();

        System.out.println("Działanie metody poll (Pierwszy element z kolejki z jego usunięciem):");
        System.out.println(carClassQueue.poll());

        System.out.println();

        System.out.println("Wszystkie auta w kolejce, po zastosowaniu metody .poll():");
        for (CarClass cars : carClassQueue){
            System.out.println(cars);
        }
    }

    @Override
    public String toString() {
        return "CarClass {" +
                "carName='" + carName + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }
}
