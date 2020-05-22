package io.chequer.solid;

interface Athlete {
}

interface SwimmingAthlete extends Athlete {
    void swim();
}

interface RunningAthlete extends Athlete {
    void run();
}

interface BoxingAthlete extends Athlete {
    void boxing();
}

class Minhyuk implements RunningAthlete {
    @Override
    public void run() {
        System.out.println("달리기를 한다");
    }
}


public class InterfaceSegregation {
    public InterfaceSegregation() {
    }
}
