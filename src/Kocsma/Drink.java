package Kocsma;

public class Drink {
    private String type;
    private double quantity;
    private double alcohol;
    private int price;

    public Drink(String type, double quantity, double alcohol, int price) {
        this.type = type;
        this.quantity = quantity;
        this.alcohol = alcohol;
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public int getPrice() {
        return price;
    }
}
