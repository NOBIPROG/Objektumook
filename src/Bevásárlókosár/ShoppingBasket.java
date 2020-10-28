package Bevásárlókosár;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    ArrayList<Product> Products = new ArrayList<>();

    public BigDecimal getSumOfPrice() {
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < Products.size(); i++) {
            BigDecimal price = Products.get(i).getPrice();
            BigDecimal subtotal = price.multiply(new BigDecimal(Products.get(i).getPcs()));
            sum = sum.add(subtotal);

        }
        return sum;
    }

    public ArrayList<String> getProductList() {
        ArrayList<String> list = new ArrayList<>();
        for (Product p : Products) {
            list.add(p.getName() + "-" + p.getPcs() + "-" + p.getPrice());

        }
        return list;

    }
}
