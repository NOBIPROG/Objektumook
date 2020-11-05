package Biologus;

import java.util.Comparator;

public class comparatorByMaxSpeedAndType implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
    if(o1.getType().equals("szárazföldi")&&o2.getType().equals("szárazföldi")){
        return (int) (o1.getMaxSpeed()-o2.getMaxSpeed());
    }
   return 1;
    }
}
