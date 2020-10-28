package Bicikli;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Bicikli bicikli = new Bicikli(40, new int[]{28, 26, 24, 22, 20, 18, 16, 14}, 0.66);
        Scanner sc = new Scanner(System.in);
        System.out.println("Üdvözöljük a számoló programban! Mit szeretne számolni? ");
        System.out.println("a--> Sebesség");
        System.out.println("b -> Fordulat");
        String answer = sc.next();
        if (answer.equals("a")) {
            System.out.println("Hányszor tekeri meg a pedált egy másodperc alatt");
            bicikli.setRoundpersec(sc.nextDouble());
            System.out.println("Milyen fokozatban van a váltó? (1-8)");
            bicikli.setShift(sc.nextInt());
            System.out.println("A kerékpár sebessége: " + bicikli.getSpeed(bicikli.getRoundpersec()) + "m/s");
        } else {
            if (answer.equals("b")) {
                System.out.println("Mekkora a kerékpár sebessége km/h-ban");
                bicikli.setSpeed(sc.nextDouble() / 3.6);
                System.out.println("Milyen fokozatban van a váltó? (1-8)");
                bicikli.setShift(sc.nextInt());
                System.out.println("A pedál fordulatszáma: " + bicikli.getRoundpersec(bicikli.getSpeed()) + "rps");
            } else {
                System.out.println("Nincs ilyen lehetőség");
            }
        }

    }

}
