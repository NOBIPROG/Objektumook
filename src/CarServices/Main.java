package CarServices;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        // LocalDateTime t = LocalDateTime.of(2020, 10, 21, 13, 20);
        // t.plus();

        CarService belaba = new CarService();

        for (float time = 7; time < 19; time += 0.5) {
            double r = Math.random();
            System.out.println("Idő: " + time);
            if (r < 0.6) {
                belaba.addNewCar( new Car() );
                System.out.println("Beállít egy autó a parkolóba");
            } else if (r < 0.8) {
                belaba.addNewCar( new Car() );
                belaba.addNewCar( new Car() );
                System.out.println("Beállít két autó a parkolóba");
            } else {
                // Do nothing.
                System.out.println("Nem állt be autó a parkolóba");
            }

            // megszerelünk 1 autót
            boolean didRepair = belaba.repairNextCar();
            System.out.println(didRepair ? "Megszereltünk egy autót" : "Bélabá kávézott");
        }
        System.out.println("A parkolóban zárás után " + belaba.countRemainingCars() + " autó maradt.");
        System.out.println("Bélabá napi bevétele: " + belaba.getIncome() + " Ft.");

    }
}