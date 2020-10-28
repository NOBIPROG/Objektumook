package CarServices;

public class Tire {

    private float pressure;
    private boolean hasHole;

    public Tire() {
        if (Math.random() < 0.05) {
            hasHole = true;
            pressure = 0;
        } else {
            // hasHole = false;
            pressure = (float) (Math.random() * 3);
        }
    }

    public void pump() {
        if (! hasHole) {
            pressure = 3;
        }
    }

    public void fixHole() {
        hasHole = false;
    }

    public boolean hasHole() {
        return hasHole;
    }
}