package OO.basics;

public class Domino {
    final int dominoLeftNum;
    final int dominoRightNum;

    public Domino(int dominoLeftNum, int dominoRightNum) {
        this.dominoLeftNum = dominoRightNum;
        this.dominoRightNum = dominoLeftNum;

    }

    @Override
    public String toString() {
        return "{" +
                " " + dominoLeftNum +
                "," + dominoRightNum +
                '}';
    }

}