package Boxolok;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BoxolokData {


    public static void main(String[] args) throws FileNotFoundException {
        List<Boxer> boxolok = boxolok();
        Map<String, List<Boxer>> boxersByNat = new HashMap<>();
        Map<Integer, List<String>> boxersByCat = boxersInEachCatByName(boxolok);
        Map<Integer, List<Boxer>> boxersByCatFull = boxersInEachCatFull(boxolok);
        for (Boxer boxer : boxolok) {
            boxersByNat.putIfAbsent(boxer.getNation(), new ArrayList<>());
            boxersByNat.get(boxer.getNation()).add(boxer);

        }

        //FELADATOK
        System.out.println("Átlag súly" + avgWeight(boxersByNat, "hu"));
        System.out.println("A legnehezebb boxoló: " + maxWeight(boxolok) + "kg");
        System.out.println("Súlycsoport ellenörző: " + boxolok.get(7).myWeightCategory());
        System.out.println("Melyik súlycsoportba tartozik? " + whichCategory("Arany Áron", boxolok) + ". kategóriába");
        System.out.println(boxersInEachCatByName(boxolok));
        if (catWinnerByZeroFight(boxersByCat)) {
            System.out.println("Van olyan boxoló aki harc nélkül nyer");
        } else {
            System.out.println("Nincs olyan boxoló aki harc nélkül nyer");
        }
        fightsByCategories(boxersByCat);
        System.out.println(garantedWin(boxersByCatFull));
    }

    public static List<Boxer> boxolok() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Files/boxers.txt"));
        List<Boxer> boxolok = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] splitit = sc.nextLine().split(",");

            int weight = Integer.parseInt(splitit[2]);
            int weightLossPerDay = Integer.parseInt(splitit[3]);
            int maxWeightLoss = Integer.parseInt(splitit[4]);
            Boxer boxer = new Boxer(splitit[0], splitit[1], weight, weightLossPerDay, maxWeightLoss);
            boxolok.add(boxer);

        }
        return boxolok;
    }

    public static double avgWeight(Map<String, List<Boxer>> boxersByNat, String country) {
        int sumWeight = 0;
        int sumBoxer = boxersByNat.get(country).size();
        for (Boxer boxer : boxersByNat.get(country)) {
            sumWeight += boxer.getWeight();
        }


        return sumWeight / (double) sumBoxer;
    }

    public static int maxWeight(List<Boxer> boxolok) {
        int max = 0;
        for (Boxer boxer : boxolok) {
            if (boxer.getWeight() > max) {
                max = boxer.getWeight();
            }
        }
        return max;
    }

    public static int whichCategory(String name, List<Boxer> boxolok) {
        int category = 0;
        for (Boxer boxer : boxolok) {
            if (boxer.getName().equals(name)) {
                category = boxer.myWeightCategory();
            }
        }

        return category;
    }

    public static Map<Integer, List<String>> boxersInEachCatByName(List<Boxer> boxolok) {
        Map<Integer, List<String>> boxersByCat = new TreeMap<>();
        for (Boxer boxer : boxolok) {
            boxersByCat.putIfAbsent(boxer.myWeightCategory(), new ArrayList<>());
            boxersByCat.get(boxer.myWeightCategory()).add(boxer.getName());

        }

        return boxersByCat;

    }

    public static void fightsByCategories(Map<Integer, List<String>> boxersByCat) {
        for (Integer category : boxersByCat.keySet()) {
            for (int i = 0; i < boxersByCat.get(category).size(); i++) {
                String name = boxersByCat.get(category).get(i);
                for (int j = i + 1; j < boxersByCat.get(category).size(); j++) {
                    String name2 = boxersByCat.get(category).get(j);
                    System.out.println(name + " vs " + name2);
                }
            }
        }
    }

    public static boolean catWinnerByZeroFight(Map<Integer, List<String>> boxersByCat) {
        for (Integer ignored : boxersByCat.keySet()) {
            if (boxersByCat.size() == 1) {
                return true;
            }
        }
        return false;

    }

    public static Map<Integer, List<Boxer>> boxersInEachCatFull(List<Boxer> boxolok) {
        Map<Integer, List<Boxer>> boxersByCat = new TreeMap<>();
        for (Boxer boxer : boxolok) {
            boxersByCat.putIfAbsent(boxer.myWeightCategory(), new ArrayList<>());
            boxersByCat.get(boxer.myWeightCategory()).add(boxer);

        }

        return boxersByCat;

    }

    public static int garantedWin(Map<Integer, List<Boxer>> boxersByCatFull) {
        int sum = 0;
        int category = 0;
        boolean isOK=false;
        for (Integer cat : boxersByCatFull.keySet()) {
           for(Boxer boxer:boxersByCatFull.get(cat)){
               if(boxer.getNation().equals("hu")){
                   sum++;
               }
           }if(sum==boxersByCatFull.get(cat).size()){
               category=cat;
               isOK=true;
            }

        }
       if(isOK){
           return category;
       }else {
           System.out.println("Nincs");
       }
       return -1;
    }
}


