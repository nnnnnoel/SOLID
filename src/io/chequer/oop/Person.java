package io.chequer.oop;

public class Person {
    int money;
    Drink drink;

    public void setMoney(int money) {
        this.money = money;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public int getMoney() {
        return this.money;
    }

    public Drink getDrink() {
        return this.drink;
    }

    public Person() {
        this.setMoney(30000);
    }

    public int pay(int amount) {
        if (this.getMoney() >= amount) {
            this.setMoney(this.getMoney() - amount);
            return amount;
        }
        return 0;
    }

    public void payback(int amount) {
        this.setMoney(this.getMoney() + amount);
    }

    public void receiveDrink(Drink drink) {
        this.setDrink(drink);
    }

    public void drinking() {
        if (this.getDrink() != null) {
            System.out.println("꿀꺽꿀꺽~ 아 시원해~");
            this.setDrink(null);
        }
    }

}
