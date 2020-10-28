package OO.basics;

public class Animal {
    int food;
    int drink;

    public Animal(int food, int drink){
        Animal animal1 = new Animal(50,50);

    }
    public void eat (){
        System.out.println("Eating");
        food--;
    }public void drink(){
        System.out.println("Drinking");
        drink--;
    }
    public void playing(){
        System.out.println("PLaying");
        drink++;
        food++;

    }
}
