package OO.basics.dot.exercise;

public class Dots {
    public static void main(String[] args) {
        Dot dot=new Dot(2,1,"Dot");
        Dot dot2=new Dot(1,-2,"Dot2");

        dot.printinfo();
        dot2.printinfo();
        System.out.println(dot.distanceBeetwenTwoDots(dot,dot2));
    }
}
