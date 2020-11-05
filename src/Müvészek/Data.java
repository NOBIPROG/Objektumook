package Müvészek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import java.util.HashMap;
import java.util.Map;



public class Data {
    List<Person> people = people();

    public Data() throws FileNotFoundException {
    }

    public List<Person> people() throws FileNotFoundException {
        Scanner sk = new Scanner(new File("Files/szemely.txt"));
        Scanner sc = new Scanner(new File("Files/foglalkozas.txt"));
        List<Person> people = new ArrayList<>();
        while (sk.hasNextLine()) {
            String[] splitit = sk.nextLine().split(",");
            String[] jobtxt = sc.nextLine().split(",");
            int year = Integer.parseInt(splitit[1]);
            List<String> job = new ArrayList<>(Arrays.asList(jobtxt));
            job.remove(jobtxt[0]);
            String name = splitit[0];
            String award;
            if (splitit.length > 2) {
                award = splitit[2];
                people.add(new Person(name, year, award, job));
            } else {
                people.add(new Person(name, year, job));
            }
        }
        System.out.println(people);
        return people;
    }

    public void orderByNamein2013(List<Person> people) {
        ComparatorByName comparatorByName = new ComparatorByName();
        ComparatorByYear comparatorByYear = new ComparatorByYear();
        Collections.sort(people, comparatorByName.thenComparing(comparatorByYear));
        for (Person person : people) {
            if (person.getYear() == 2013) {
                System.out.println(person.getName());
            }
        }
    }

    public void doBallet(List<Person> people) {
                System.out.println("Balett:");
        for (Person person : people) {
            if (person.getJob().toString().contains("balett")) {
                System.out.println(person.getName() + person.getJob());
            }
        }
    }

    public void mostAwardedYear(List<Person> people) {
        int sum = 0;
        int actualyear = 0;
        Map<Integer, List<Person>> peoplemap = new HashMap<>();
        for (Person person : people) {
            peoplemap.putIfAbsent(person.getYear(), new ArrayList<>());
            peoplemap.get(person.getYear()).add(person);
        }
        for (Integer year : peoplemap.keySet()) {
            if (sum < peoplemap.get(year).size()) {
                sum = peoplemap.get(year).size();
                actualyear = year;

            }
        }

        System.out.println("Év:" + (actualyear) + " " + sum + "Fő");

    }

    public void jobsNumbers(List<Person> people) {
        Map<String, List<Person>> peoplemap = new HashMap<>();
        for (Person person : people) {
            for (String job : person.getJob()) {
                peoplemap.putIfAbsent(job, new ArrayList<>());
                peoplemap.get(job).add(person);
            }

        }
        for (String job:peoplemap.keySet()){

            System.out.println((job+": "+(peoplemap.get(job).size())));
        }
    }
}
