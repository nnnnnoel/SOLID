package io.chequer.solid;

class Tire {
    String name;

    public Tire(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class KoreaTire extends Tire {
    public KoreaTire() {
        super("한국타이어");
    }
}

class JapanTire extends Tire {
    public JapanTire() {
        super("일본타이어");
    }
}

//class Car {
//    Tire tire;
//
//    public Car() {
//        this.tire = new JapanTire();
//    }
//
//    public void changeTire(Tire tire) {
//        this.tire = tire;
//    }
//}

public class DependencyInversion {
    public DependencyInversion() {
    }
}
