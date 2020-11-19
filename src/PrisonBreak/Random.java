package PrisonBreak;

public class Random extends Prisoner {
    public Random(String name) {
        super(name);
    }

    @Override
    public boolean confess(Prisoner prisoner) {
        return Math.random() < 0.5;
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
