package Müvészek;

import java.util.Arrays;
import java.util.List;

public class Person {
String name;
int year;
String award;
List<String> job;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public void setJob(String[] job) {
        this.job.addAll(Arrays.asList(job));
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAward() {
        return award;
    }

    public List<String> getJob() {
        return job;
    }


    public Person(String name, int year, List<String> job) {
        this.name = name;
        this.year = year;
        this.job = job;
    }

    public Person(String name, int year, String award,List<String> job) {
        this.name = name;
        this.year = year;
        this.award = award;
        this.job = job;


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", award='" + award + '\'' +
                ", job=" + job +
                '}';
    }
}
