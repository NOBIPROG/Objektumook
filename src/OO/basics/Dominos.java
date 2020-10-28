package OO.basics;

import java.util.Arrays;

public class Dominos {
    public static void main(String[] args) {
        Domino domino1 = new Domino(5, 2);
        Domino domino2 = new Domino(4, 6);
        Domino domino3 = new Domino(1, 5);
        Domino domino4 = new Domino(6, 7);
        Domino domino5 = new Domino(2, 4);
        Domino domino6 = new Domino(7, 1);
        Domino[] dominos = {domino1, domino2, domino3, domino4, domino5, domino6};
        System.out.println(Arrays.toString(orderOfDominos(dominos)));
        //for (int i = 0; i < orderOfDominos(dominos).length; i++) {
        //  orderOfDominos(dominos)[i].toString();
        Domino[] result = orderOfDominos(dominos);
        for (int i = 0; i < result.length; i++) {
            result[i].toString();
        }


    }

    public void dominosLeftNum(Domino domino) {
        System.out.println(domino.dominoLeftNum);
    }

    public void dominosRightNum(Domino domino) {
        System.out.println(domino.dominoRightNum);
    }

    //dom1-dom5-dom2-dom4-dom6-dom3
    public static Domino[] orderOfDominos(Domino[] dominos) {
        Domino[] order = new Domino[dominos.length];
        order[0] = dominos[0];
        for (int i = 0; i < order.length-1; i++) {
            for (int j = 0; j < order.length; j++) {
                if (order[i].dominoRightNum == dominos[j].dominoLeftNum) {
                    order[i+1] = dominos[j];
                }

            }

        }
        return order;
    }
}
