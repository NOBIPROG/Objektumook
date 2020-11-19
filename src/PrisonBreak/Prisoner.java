package PrisonBreak;

import java.util.ArrayList;
import java.util.List;

public abstract class Prisoner implements Strategy {
    String name;
    List<Prisoner> enemies;
    int ages;

    public Prisoner(String name) {
        this.name = name;
        enemies = new ArrayList<>();
    }

    public abstract int setAges(int age);

    public abstract int getAges();

    public abstract String getName();

    public abstract int getEnemies();
}
