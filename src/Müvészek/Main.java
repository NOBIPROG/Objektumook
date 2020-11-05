package Müvészek;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Data data = new Data();
        data.people();
        data.orderByNamein2013(data.people);
        data.doBallet(data.people);
        data.mostAwardedYear(data.people);
        data.jobsNumbers(data.people);
    }
}
