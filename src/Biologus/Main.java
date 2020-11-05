package Biologus;

import java.io.FileNotFoundException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Data data=new Data();
        data.animals();
        data.fastestAnimal(data.animals);
        data.fastestAnimalByType(data.animals);
        data.fastestAnimalByContinent(data.animals);

    }
}
