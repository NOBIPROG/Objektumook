package OO.basics;

public class Human {
    String eyecolor;
    int footSize;
    int weight;
    boolean hungry;

    public Human(String eyecolor, int footSize, int weight) {
        this.eyecolor = eyecolor;
        this.footSize = footSize;
        this.weight = weight;
        this.hungry = true;
    }

    public Human() {
    }

    public void eat() {
        System.out.println("eating");
        hungry = false;
        weight++;
    }

    public void gyertyaFenyesVacsora(Human human) {
        System.out.println("Pizza");
       /* hungry = false;
        human.hungry = false;
        weight++;
        human.weight++;*/
     human.eat();
     this.eat();
    }
}
