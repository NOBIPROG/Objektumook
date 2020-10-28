package CarServices;

import java.util.ArrayList;

public class CarService {
    private ArrayList<Car> parkingLot;
    private int income;

    public CarService() {
        parkingLot = new ArrayList<>(6);
        income = 0;
    }

    public void addNewCar(Car c) {
        if (parkingLot.size() < 6) {
            parkingLot.add(c);
        }
    }

    public boolean repairNextCar() {
        if (parkingLot.size() > 0) {
            Car car = parkingLot.get(0);
            for (Tire t : car.getTires()) {
                if (t.hasHole()) {
                    t.fixHole();
                }
                t.pump();
            }
            if (car.getEngine().getOilLevel() < 100) {
                car.getEngine().fillOil();
            }
            pay(car);
            parkingLot.remove(0);
            return true;
        }
        return false;
    }

    public void pay(Car car) {
        income += car.getEngine().isDiesel() ? 12000 : 11000;
    }

    public int countRemainingCars() {
        return parkingLot.size();
    }

    public int getIncome() {
        return income;
    }
}

