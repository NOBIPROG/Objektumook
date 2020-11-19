package PrisonBreak;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<Prisoner> prisoners = new ArrayList<>();
        Prisoner naiv = new Naiv("Naiv");
        Prisoner random = new Random("Random");
        Prisoner eye = new EyeForEye("EyeforEye");
        Prisoner rat = new Rat("Rat");
        prisoners.add(naiv);
        prisoners.add(random);
        prisoners.add(eye);
        prisoners.add(rat);
        Game game = new Game();
        game.simulation(prisoners, 10000);
        game.results(prisoners);

    }

    public void simulation(List<Prisoner> prisoners, int rounds) {

        for (int i = 0; i < rounds; i++) {
            for (int j = 0; j < prisoners.size() - 1; j++) {
                //  Prisoner prisoner1 = prisoners.get(j);
                for (int k = j + 1; k < prisoners.size(); k++) {
                    boolean prisoner1Rat = false;
                    boolean prisoner2Rat = false;
                    //    Prisoner prisoner2 = prisoners.get(k);
                    if (prisoners.get(j).confess(prisoners.get(k))) {
                        prisoners.get(k).enemies.add(prisoners.get(j));
                        prisoner1Rat = true;


                    } else if (prisoners.get(k).confess(prisoners.get(j))) {
                        prisoners.get(j).enemies.add(prisoners.get(k));
                        prisoner2Rat = true;
                    }
                    if (prisoner1Rat && prisoner2Rat) {
                        prisoners.get(j).setAges(2);
                        prisoners.get(k).setAges(2);
                    } else if (prisoner1Rat) {
                        prisoners.get(k).setAges(3);
                    } else if (prisoner2Rat) {
                        prisoners.get(j).setAges(3);
                    } else {
                        prisoners.get(j).setAges(1);
                        prisoners.get(k).setAges(1);
                    }
                }
            }
        }
    }
    public void results(List<Prisoner> prisoners) {
        for (Prisoner prisoner : prisoners) {
            System.out.println(prisoner.getName()+ " : " + prisoner.getAges() + " ellenség: " + prisoner.getEnemies());
        }
    }
}
