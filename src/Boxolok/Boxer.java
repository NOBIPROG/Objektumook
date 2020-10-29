package Boxolok;

import java.util.List;

public class Boxer {
    String name;
    String nation;
    int weight;
    int weightlossperday;
    int maxweightloss;
    int[] weightCategories = {52, 57, 63, 71, 79, 91};


    public void setName(String name) {
        this.name = name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setWeightlossperday(int weightlossperday) {
        this.weightlossperday = weightlossperday;
    }

    public void setMaxweightloss(int maxweightloss) {
        this.maxweightloss = maxweightloss;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public int getWeight() {
        return weight;
    }

    public int getWeightlossperday() {
        return weightlossperday;
    }

    public int getMaxweightloss() {
        return maxweightloss;
    }

    public Boxer(String name, String nation, int weight, int weightlossperday, int maxweightloss) {
        this.name = name;
        this.nation = nation;
        this.weight = weight;
        this.weightlossperday = weightlossperday;
        this.maxweightloss = maxweightloss;
    }

    @Override
    public String toString() {
        return "Boxer{" +
                "name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", weight=" + weight +
                ", weightlossperday=" + weightlossperday +
                ", maxweightloss=" + maxweightloss +
                '}';
    }

    public int myWeightCategory() {
        int category = 0;
        for (int i = 0; i < weightCategories.length; i++) {
            if (weight <= weightCategories[i] && i == 0) {
                category = i;
                break;
            }
            if (weight <= weightCategories[i] && weight > weightCategories[i - 1]) {
                category = i;
                break;
            }
            if (weight > weightCategories[i] && i == weightCategories.length - 1) {
                category = i;
               break;
            }
        }
        return category;
    }
}

