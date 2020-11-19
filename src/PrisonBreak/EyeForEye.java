package PrisonBreak;

public class EyeForEye extends Prisoner {

    public EyeForEye(String name) {
        super(name);
    }

    @Override
    public boolean confess(Prisoner prisoner) {
        return enemies.contains(prisoner);
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
