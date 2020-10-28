package Bevásárlókosár;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Product {
    private String name;
    private BigDecimal price;
    private int pcs;

    public Product(String name, BigDecimal price, int pcs) {
        this.name = name;
        this.price = price;
        this.pcs = pcs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPcs(int pcs) {
        this.pcs = pcs;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getPcs() {
        return pcs;
    }
}

