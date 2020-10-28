package Vacuumcleaner;

import java.util.Random;

public class Room {
    private int size;
    private int[] dirtiness;

    public int getSize() {
        return size;
    }

    public int[] getDirtiness() {
        return dirtiness;
    }

    public void setRoom(int size) {
        this.size = size;
        this.dirtiness = new int[getSize()];
        for (int i = 0; i < getSize(); i++) {
            dirtiness[i] = (int) (Math.random() * 5);

        }
    }
}

