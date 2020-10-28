package CarServices;

public class Engine {

    private int oilLevel;
    private boolean isDiesel;

    public Engine() {
        oilLevel = (int) Math.floor(Math.random() * 50) + 50;
        isDiesel = Math.random() < 0.5;
    }

    public void fillOil() {
        oilLevel = 100;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public boolean isDiesel() {
        return isDiesel;
    }
}
