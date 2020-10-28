package OO.basics.dot.exercise;

public class Circle {
    private Dot midlepoint;
    private double radius;

    public Circle(Dot midlepoint, int radius) {
        this.midlepoint = midlepoint;
        this.radius = radius;

    }

    public double getArea(double radius) {
        double area = 0;
        area=radius*2*Math.PI;


        return area;
    }

}

