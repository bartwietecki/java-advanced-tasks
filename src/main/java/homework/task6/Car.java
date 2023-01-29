package homework.task6;

public class Car {
    String type;
    String engine;
    String wheels;

    public Car(String type, String engine, String wheels) {
        this.type = type;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }
}
