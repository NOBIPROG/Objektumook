package Bicikli;

public class Bicikli {
    private int frontgear;
    private int[] reargear;
    private double wheelsize;
    private int shift;
   private double speed;
   private double roundpersec;

    public Bicikli() {
    }

    public Bicikli(int frontgear, int[] reargear, double wheelsize) {
        this.frontgear = frontgear;
        this.reargear = reargear;
        this.wheelsize = wheelsize;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getShift() {
        return shift;
    }

    public double getSpeed(double roundpersec) {
        //forudlatszám * (első fogaskerék fogainak száma / hátsó fogaskerék fogainak száma) * kerékátmérő.
        return roundpersec * (getFrontgear() / getReargear(getShift())) * (getWheelsize() * Math.PI);
    }

    public double getRoundpersec(double speed) {

        return speed / (getWheelsize() * Math.PI) / (getFrontgear() / getReargear(getShift()));
    }

    public void setRoundpersec(double roundpersec) {
        this.roundpersec = roundpersec;
    }

    public int getFrontgear() {
        return frontgear;
    }

    public int getReargear(int shift) {
        return reargear[shift - 1];
    }

    public double getWheelsize() {
        return wheelsize;
    }

    public double getRoundpersec() {
        return roundpersec;
    }

    public void setSpeed(double speed) {
        this.speed = speed;

    }

    public double getSpeed() {
        return speed;
    }
}
