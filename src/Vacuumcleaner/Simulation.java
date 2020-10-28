package Vacuumcleaner;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room room = new Room();
        System.out.println("Hány négyzertméter a szoba?");
        room.setRoom(sc.nextInt());

        VacuumCleaner vacuumCleaner = new VacuumCleaner(false, false, 20);
        makeready(vacuumCleaner);

    }public static void Cleaning(VacuumCleaner vacuumCleaner, Room room){

    }
    public static void makeready(VacuumCleaner vacuumCleaner){
        Scanner sc=new Scanner(System.in);
        while (!vacuumCleaner.ready()) {
            if (vacuumCleaner.isBagIsFull()) {
                System.out.println("Kiürírti a zsákot? igen/nem");
                String answer = sc.next();
                if (answer.equals("igen")) {
                    vacuumCleaner.setBagIsFull(false);
                    vacuumCleaner.setBagFullness(0);
                } else {
                    System.out.println("De.");
                    vacuumCleaner.setBagIsFull(false);
                    vacuumCleaner.setBagFullness(0);
                }
            }if(!vacuumCleaner.isPluged()){
                System.out.println("Dugd be a konektorba");
                System.out.println("Sikerült? igen/nem");
                String answer= sc.next();
                if(answer.equals("igen")){
                    vacuumCleaner.setPluged(true);
                }
            }if(!vacuumCleaner.isPower()){
                System.out.println("Bekéne dugni! igen/nem");
                String answer = sc.next();
                if (answer.equals("igen")) {
                    vacuumCleaner.setPower(true);
                }
            }

        }
    }
}
