package io.chequer.solid;

// Single Responsibility Principle: 단일 책임 원칙이라는 뜻을 가지고 있으며 하나의 클래스에서는 하나의 동작만 수행해야 함

class Calculate {
    double a;
    double b;

    public Calculate(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return this.a + this.b;
    }

    public double subtract() {
        return this.a - this.b;
    }

    public double divide() {
        return this.a / this.b;
    }

    public double multiply() {
        return this.a * this.b;
    }

    //    private void drive() {
    //        // 드라이브 가자 ~!
    //    }
    //
    //    public void driveWithCar() {
    //        this.drive();
    //    }
}

public class SingleResponsibility {
    Calculate calculate;

    public SingleResponsibility() {
        this.calculate = new Calculate(1.3, 1.5);
        System.out.println(this.calculate.add());
        System.out.println(this.calculate.subtract());
        System.out.println(this.calculate.multiply());
        System.out.println(this.calculate.divide());
        //  System.out.println(this.calculate.driveWithCar());
    }
}
