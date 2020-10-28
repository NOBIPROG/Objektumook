package Indiánok;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println(indians());
        System.out.println("Indiánok száma: " + numberOfIndians(indians()));
        List<Indián> indiánok = indians();
        HashMap<String, List<Indián>> reservation = new HashMap<>();
        for (Indián indian : indiánok) {
            reservation.putIfAbsent(indian.getTribe(), new ArrayList<>());
            reservation.get(indian.getTribe()).add(indian);
        }
        System.out.println("Bizonyos törzs lakóinak száma: " + reservation.get("Seminole").size());
        System.out.println("Eszközök száma: " + printAllTools(indiánok));
        System.out.println("Milyen a férfi arány a Seminole törzsben?\n" + countIndians(reservation, "f", "Seminole") + ":" + countIndians(reservation, "n", "Seminole"));
        System.out.println("Vének tanácsának tagja: "+getOld(reservation, "Apache"));
        System.out.println("A(z) "+mostPopulatedTribe(reservation)+" törzsben vannak a legtöbben");
        System.out.println("Nemek aránya az egyes törzsekben:");
        menRate(reservation);
    }


    public static int numberOfIndians(List<Indián> indiáns) {
        int numberOfIndians = indiáns.size();
        return numberOfIndians;
    }

    public static List<Indián> indians() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Files/indianok.txt"));
        List<Indián> indiáns = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] splitit = sc.nextLine().split(",");
            //System.out.println(splitit[0]);
            int age = Integer.valueOf(splitit[3]);
            String[] tools = splitit[4].split("\\|");
            List<String> toollist = Arrays.asList(tools);
            Indián indián = new Indián(splitit[0], splitit[1], splitit[2], age, toollist);
            //System.out.println(indián);//ez csak egy ellenörző
            indiáns.add(indián);
        }
        return indiáns;

    }

    public static int printAllTools(List<Indián> indians) {
        HashSet<String> allTools = new HashSet<>();
        for (Indián indian : indians) {
            allTools.addAll(indian.getTools());
        }
        return allTools.size();

    }

    public static int countIndians(HashMap<String, List<Indián>> reservation, String gender, String tribe) {
        int counter = 0;
        for (Indián indián : reservation.get(tribe)) {
            if (indián.getGender().equals(gender)) {
                counter++;
            }
        }
        return counter;
    }

    public static ArrayList<String> getOld(HashMap<String, List<Indián>> reservation, String tribe) {
        ArrayList<String> names = new ArrayList<String>();
        for (Indián indián : reservation.get(tribe)) {
            if (indián.getTools().contains("békepipa")) {
                names.add(indián.getName());

            }
        }
        return names;
    }

    public static String mostPopulatedTribe(HashMap<String, List<Indián>> indian) {
        Iterator<String> iterator = indian.keySet().iterator();
        int nums = 0;
        String tribe = "No one";
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (indian.get(s).size() > nums) {
                nums = indian.get(s).size();
                tribe = s;

            }
        }
        System.out.print(nums + " ");
        return tribe;
    }
    public static void menRate(HashMap<String, List<Indián>> indian) {
        for(String tribe: indian.keySet()){
            System.out.println(tribe+" "+ countIndians(indian,"f",tribe)+ ":"+countIndians(indian,"n",tribe));
        }
    }
}
