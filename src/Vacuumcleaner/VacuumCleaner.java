package Vacuumcleaner;

public class VacuumCleaner {
    private boolean power;
    private boolean pluged;
    private int bagSize;
    private boolean bagIsFull;
    private int bagFullness;

    public VacuumCleaner(boolean power, boolean pluged, int bagSize) {
        this.power = power;
        this.pluged = pluged;
        this.bagSize = bagSize;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setPluged(boolean pluged) {
        this.pluged = pluged;
    }

    public void setBagSize(int bagSize) {
        this.bagSize = bagSize;
    }

    public void setBagIsFull(boolean bagIsFull) {
        this.bagIsFull = bagIsFull;
    }

    public void setBagFullness(int bagFullness) {
        this.bagFullness = bagFullness;
    }

    public boolean isPower() {
        return power;
    }

    public boolean isPluged() {
        return pluged;
    }

    public int getBagSize() {
        return bagSize;
    }

    public boolean isBagIsFull() {
        return bagIsFull;
    }

    public int getBagFullness() {
        return bagFullness;
    }

    public boolean ready() {
        return isPluged() && !isBagIsFull() && isPower();

    }

    public void bagStatus() {
        if (getBagFullness() < getBagSize()) {
            setBagIsFull(false);
        } else {
            setBagIsFull(true);
        }
    }
}
