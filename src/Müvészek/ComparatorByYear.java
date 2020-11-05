package Müvészek;

import java.util.Comparator;

public class ComparatorByYear implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return (o1.getYear() - o2.getYear());
    }
}
