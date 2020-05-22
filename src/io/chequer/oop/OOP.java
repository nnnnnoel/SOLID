package io.chequer.oop;


public class OOP {
    Person person;
    VendingMachine vendingMachine;

    public OOP() {
        this.person = new Person();
        this.vendingMachine = new VendingMachine();

        final int paidAmountByUser = this.person.pay(3000);

        if (paidAmountByUser > 0) {
            this.vendingMachine.payByUser(this.person.pay(3000));
            final Drink selectedDrink = this.vendingMachine.selectDrink("칠성사이다");
            if (selectedDrink != null) {
                final int paybackAmount = this.vendingMachine.howMuchPayback(selectedDrink.getPrice());
                this.person.receiveDrink(selectedDrink);
                if (paybackAmount > 0) {
                    this.person.payback(paybackAmount);
                }
                this.person.drinking();
            } else {
                this.person.payback(paidAmountByUser);
            }
        } else {
            System.out.println("돈을 넣어주세요.");
        }
    }

}
