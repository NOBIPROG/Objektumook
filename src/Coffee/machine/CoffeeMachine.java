package Coffee.machine;

public class CoffeeMachine {
    private int water;
    private int coffee;
    private boolean cleanFilter;

    public CoffeeMachine(int water, int coffee, boolean cleanFilter) {
        this.water = water;
        this.coffee = coffee;
        this.cleanFilter = cleanFilter;


    }

    public boolean changeFilter() {
        return cleanFilter = true;

    }

    public int addWater(int water) {
        return this.water += water;

    }

    public int addCoffee(int coffee) {
        return this.coffee += coffee;

    }

    public void status() {
        System.out.println("Víz szint: " + water + "Kávé szint: " + coffee);
        if (cleanFilter == true) {
            System.out.println("Tiszta a filter");
        } else {
            System.out.println("Új filter kell");
        }
    }

    public void strongness() {
        if (coffee < water) {
            System.out.print("Gyenge kávé");
        } else {
            if (coffee > water) {
                System.out.print("Erős kávé");
            } else {
                System.out.print("Közepess erősségű");
            }
        }
    }
    public void cooking(){
        //strongness();
        addCoffee(1);
        addWater(2);
        changeFilter();
        System.out.print(" Kész a ");
        strongness();
        System.out.print(" kávéd");
        water=0;
        coffee=0;
        cleanFilter=false;
    }
}
