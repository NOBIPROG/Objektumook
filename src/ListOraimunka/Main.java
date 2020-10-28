package ListOraimunka;

import Bevásárlókosár.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(10);
        people.add(new Person("Józsi", 30, 64, 170));
        people.add(new Person("Béla", 43, 65, 150));
        people.add(new Person("Pistabá", 66, 98, 175));
        List<Integer>numbers=new ArrayList<>(12);
        for (int i = 0; i <10; i++) {
            numbers.add((int)Math.random()*16);
            System.out.println(numbers.get(i));
        }
    }

    public int minWeight(ArrayList<Person> people) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).height < min) {
                min = people.get(i).height;
            }
        }
        return min;
    }

    public int sumOfPeopleHeight(ArrayList<Person> people) {
        int sum = 0;
        return sum;
    }

    public void deleteEvenNums(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(nums.get(i));
                System.out.println(nums.get(i));
            }

        }
    }

    public void deleteEvenNumsForEach(List<Integer> nums) {
        for (Integer number : nums) {
            if (number % 2 == 0) {
                nums.remove(number);
            }
        }

    }

    public void deleteEvenNumsIterator(List<Integer> nums) {
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
    }

}

