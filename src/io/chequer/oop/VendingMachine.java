package io.chequer.oop;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    int paidAmount = 0;
    List<Drink> drinkList;

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    public int getPaidAmount() {
        return this.paidAmount;
    }

    public List<Drink> getDrinkList() {
        return this.drinkList;
    }

    public VendingMachine() {
        List<Drink> list = new ArrayList<>();

        list.add(new Water());
        list.add(new CocaCola());
        list.add(new Pepsi());
        list.add(new ChilsungCider());

        this.setDrinkList(list);
    }


    public void payByUser(int amount) {
        this.setPaidAmount(this.getPaidAmount() + amount);
    }


    public boolean checkAmount(int price) {
        if (price >= this.getPaidAmount())
            return true;
        System.out.println("돈이 부족합니다.");
        return false;
    }

    public int howMuchPayback(int price) {
        return this.getPaidAmount() - price;
    }

    public Drink findByName(String name) {
        for (Drink drink : this.getDrinkList()) {
            if (drink.getName().equals(name)) {
                return drink;
            }
        }
        System.out.println("찾으시는 음료수가 없어요.");
        return null;
    }

    public Drink selectDrink(String name) {
        final Drink foundDrink = this.findByName(name);

        if (foundDrink != null) {
            if (checkAmount(foundDrink.getPrice())) {
                return foundDrink;
            }
        }
        return null;
    }

}
