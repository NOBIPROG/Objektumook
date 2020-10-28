package Útszakasz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Út {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Files/forgalom.txt"));

        int textlenght = sc.nextInt();
        int[] hour = new int[textlenght];
        int[] min = new int[textlenght];
        int[] sec = new int[textlenght];
        int[] time = new int[textlenght];
        String[] city = new String[textlenght];
        for (int i = 0; i < textlenght; i++) {
            hour[i] = sc.nextInt();
            min[i] = sc.nextInt();
            sec[i] = sc.nextInt();
            time[i] = sc.nextInt();
            city[i] = sc.next();
        }
        Car[] cars = new Car[textlenght];
        for (int i = 0; i < textlenght; i++) {
            cars[i] = new Car(hour[i], min[i], sec[i], time[i], city[i]);
        }
        sc = new Scanner(System.in);
        System.out.print("Adja meg a jármű sorszámát:");
        int number = sc.nextInt();
        if (city[number].equals("A")) {
            System.out.println("Felső város részbe tart");
        } else {
            System.out.println("Alsó város részbe tart");
        }
lastcars(cars);

    }

    public static void lastcars(Car[] car) {
        int counter = 0;
        int firstCarMin = 0;
        int firstCarSec = 0;
        int finalCarMin = 0;
        int finalCarSec = 0;

        for (int i = car.length - 1; counter < 2; i--) {
            if (car[i].getCity().equals("A")&& counter==0) {
                firstCarMin = car[i].getMin();
                firstCarSec = car[i].getSec();
                counter++;
            } else {
                if (car[i].getCity().equals("A")){
                    finalCarMin=firstCarMin-car[i].getMin();
                    finalCarSec=firstCarSec-car[i].getSec();
                    counter++;
                }
            }


        }
        System.out.println(finalCarMin*60+finalCarSec);
    }
    public static void carCounterByHour(Car[] cars){
        int sumF=0;
        int sumA=0;
        int hour=0;
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getCity().equals("A")&&hour!=cars[i].getHour()){
                hour=cars[i].getHour();
                sumA++;
            }else{if(cars[i].getCity().equals("A")&&hour==cars[i].getHour()&&sumA!=0){
                sumA++;


            }}

        }
    }
}

