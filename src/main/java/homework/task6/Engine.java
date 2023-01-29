package homework.task6;

public class Engine {
    String type;
    int capacity;
    int enginePower;

    public Engine(String type, int capacity, int enginePower) {
        this.type = type;
        this.capacity = capacity;
        this.enginePower = enginePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}