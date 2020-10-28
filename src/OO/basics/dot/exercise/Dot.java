package OO.basics.dot.exercise;

public class Dot {
    private int positionX;
    private int positionY;
    private String name;

    public Dot(int positionX, int positionY, String name) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.name = name;
    }

    public Dot() {
        positionY = 0;
        positionX = 0;
        name = "Dot";

    }

    public void printinfo() {
        System.out.println(name + "= X:" + positionX + " Y:" + positionY);
        if (positionX > 0 && positionY > 0) {
            System.out.println("Jobb felső negyedben van");
        } else {
            if (positionX > 0 && positionY < 0) {
                System.out.println("Jobb alsó negyedben van");
            } else {
                if (positionX < 0 && positionY > 0) {
                    System.out.println("Bal felső negyedben van");
                } else {
                    if (positionX < 0 && positionY < 0) {
                        System.out.println("Bal alsó negyedben van");
                    }

                }
            }
        }
    }

    public double distanceBeetwenTwoDots(Dot dot1, Dot dot2) {
        double distance = 0;
        double first = Math.pow(dot2.positionX - dot1.positionY, 2);
        double second = Math.pow(dot2.positionY - dot1.positionY, 2);
        distance = Math.sqrt(first + second);

        return distance;
    }

}

