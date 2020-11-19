package PrisonBreak;

public class Naiv extends Prisoner {


    public Naiv(String name) {
        super(name);
    }

    @Override
    public boolean confess(Prisoner prisoner) {
        return false;
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
