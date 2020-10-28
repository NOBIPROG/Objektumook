package CarServices;

public class Car {
    private Tire[] tires = new Tire[4];
    private Engine engine;

    public Car() {
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new Tire();
        }
        engine = new Engine();
    }

    public Tire[] getTires() {
        return tires;
    }

    public Engine getEngine() {
        return engine;
    }

    /*
    public boolean getStatus() {
        return getEngineStatus() && getTiresStatus();
    }

    public boolean getEngineStatus() {

    }

    public boolean getTiresStatus() {

    }
    */
}

