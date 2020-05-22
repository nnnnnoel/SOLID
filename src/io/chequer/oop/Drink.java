package io.chequer.oop;

public class Drink {
    String name;
    int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public Drink(String name, int price) {
        this.setName(name);
        this.setPrice(price);
    }

}
