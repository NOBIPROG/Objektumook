package PrisonBreak;

import java.util.List;

public class Rat extends Prisoner {

    public Rat(String name) {
        super(name);
    }

    @Override
    public boolean confess(Prisoner prisoner) {
        return true;
    }

    @Override
    public int setAges(int age) {
        return ages+=age;
    }

    @Override
    public int getAges() {
        return ages;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEnemies() {
        return enemies.size();
    }

}
