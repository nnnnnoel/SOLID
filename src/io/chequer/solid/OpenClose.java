package io.chequer.solid;

import java.util.HashMap;
import java.util.Map;

interface CarInfo {
    abstract public int getMaxSpeed();
    abstract public int getCarPrice();
}

abstract class Car implements CarInfo {
    String name;
    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    };
}

class Porsche extends Car {
    public Porsche() {
        super("Porsche");
    }

    @Override
    public int getMaxSpeed() {
        return 300;
    }

    @Override
    public int getCarPrice() {
        return 120000000;
    }
}

class BMW extends Car {
    public BMW() {
        super("BMW");
    }

    @Override
    public int getMaxSpeed() {
        return 260;
    }

    @Override
    public int getCarPrice() {
        return 110000000;
    }
}

class Driver {
    Car car;
    public Driver(Car car) {
        this.car = car;
    }

    public Map<String, Object> getCarInfo() {
        Map<String, Object> map = new HashMap<>();

        map.put("name", this.car.getName());
        map.put("maxSpeed", this.car.getMaxSpeed());
        map.put("price", this.car.getCarPrice());
        return map;
    }
}

public class OpenClose {
    Driver first;
    Driver second;

    Map<String, Object> firstCarInfo;
    Map<String, Object> secondCarInfo;

    public OpenClose() {
        this.first = new Driver(new Porsche());
        this.firstCarInfo = this.first.getCarInfo();
        this.second = new Driver(new BMW());
        this.secondCarInfo = this.second.getCarInfo();
    }
}
